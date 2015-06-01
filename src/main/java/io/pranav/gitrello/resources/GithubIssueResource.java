package io.pranav.gitrello.resources;


import com.google.inject.Inject;
import io.pranav.gitrello.GithubClient;
import io.pranav.gitrello.GitrelloConfiguration;
import io.pranav.gitrello.TrelloClient;
import io.pranav.gitrello.github.GithubComment;
import io.pranav.gitrello.github.GithubWebHook;
import io.pranav.gitrello.trello.Board;
import io.pranav.gitrello.trello.BoardList;
import io.pranav.gitrello.trello.Card;
import io.pranav.gitrello.trello.CommentCard;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


@Path("gitrello/github/issue")
public class GithubIssueResource {

  private TrelloClient trello;
  private GithubClient github;
  private GitrelloConfiguration configuration;

  @Inject
  public GithubIssueResource(TrelloClient trello,
                             GithubClient github,
                             GitrelloConfiguration configuration) {
    this.trello = trello;
    this.github = github;
    this.configuration = configuration;
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void receiveGithubIssueWebHook(GithubWebHook githubWebHook) throws IOException, InterruptedException {
    Card card;
    try {
      card = searchForCard(githubWebHook);
    } catch (IndexOutOfBoundsException e) {
      card = createNewCard(githubWebHook);
    }

    // Make sure comments are in sync
    List<GithubComment> githubComments = github.getGithubComments(githubWebHook.getIssue().getCommentsUrl());
    List<CommentCard> trelloComments = trello.getCommentCardsForCard(card.getId());
    for(GithubComment githubComment : githubComments) {
      String githubCommentTrelloString = githubComment.toTrelloCommentString();
      if(!trelloComments.stream().anyMatch(t -> t.getData().getText().equals(githubCommentTrelloString))) {
        System.out.println("Adding comment: "+githubComment.toTrelloCommentString());
        trelloComments.add(trello.postComment(card.getId(), githubComment.toTrelloCommentString()));
      }
    }
  }

  private Card searchForCard(GithubWebHook githubWebHook) throws IOException {
    Board board = trello.search(githubWebHook.getRepository().getName()).getBoards().get(0);
    List<Card> cards = trello.getBoardCards(board.getId());
    return cards.stream()
        .filter(c -> c.getDesc().startsWith(TrelloClient.getGithubIssueIdentifier(githubWebHook)))
        .collect(Collectors.toList()).get(0);
  }

  private Card createNewCard(GithubWebHook githubWebHook) throws IOException {
    Board board = trello.search(githubWebHook.getRepository().getName()).getBoards().get(0);
    BoardList boardList = trello.getBoardLists(board.getId()).stream()
        .filter(l -> l.getName().equals(configuration.getTrelloConfiguration().getNewCardListName()))
        .collect(Collectors.toList()).get(0);

    Card card = Card.newBuilder()
        .setClosed(false)
        .setName(githubWebHook.getIssue().getTitle())
        .setDesc(githubWebHook.getIssue().getBody())
        .setDue("null")
        .setIdList(boardList.getId())
        .setUrlSource("null")
        .build();
    System.out.println("Creating new card: "+card.getName());
    Card trelloCard = trello.createNewCard(card, TrelloClient.getGithubIssueIdentifier(githubWebHook));
    return trelloCard;
  }

}
