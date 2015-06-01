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
  public void receiveGithubIssueWebHook(GithubWebHook githubWebHook) throws IOException {
    String searchString = TrelloClient.getGithubIssueIdentifier(githubWebHook);
    List<Card> cards = searchForCard(searchString);

    if(cards.size() == 0) {
      createNewCard(githubWebHook);
      cards = searchForCard(searchString);
    }
    Card card = cards.get(0);
    // Make sure comments are in sync
    System.out.println(card.getName());
    List<GithubComment> githubComments = github.getGithubComments(githubWebHook.getIssue().getCommentsUrl());
    List<CommentCard> trelloComments = trello.getCommentCardsForCard(card.getId());
    for(GithubComment githubComment : githubComments) {
      String githubCommentTrelloString = githubComment.toTrelloCommentString();
      if(!(trelloComments.stream().anyMatch(t -> t.getData().getText().equals(githubCommentTrelloString)))) {
        System.out.println("Adding comment: "+githubComment.toTrelloCommentString());
        System.out.println(trello.postComment(card.getId(), githubComment.toTrelloCommentString()));
      }
    }
  }

  private List<Card> searchForCard(String searchString) throws IOException {
    return trello.search(searchString).getCards().stream()
        .filter(c -> c.getDesc().startsWith(searchString))
        .collect(Collectors.toList());
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
    trello.createNewCard(card, TrelloClient.getGithubIssueIdentifier(githubWebHook));
    return card;
  }

}
