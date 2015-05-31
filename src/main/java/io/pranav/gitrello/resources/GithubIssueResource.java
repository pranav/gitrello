package io.pranav.gitrello.resources;


import com.google.inject.Inject;
import io.pranav.gitrello.GitrelloConfiguration;
import io.pranav.gitrello.TrelloClient;
import io.pranav.gitrello.github.GithubWebHook;
import io.pranav.gitrello.trello.Board;
import io.pranav.gitrello.trello.BoardList;
import io.pranav.gitrello.trello.Card;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


@Path("gitrello/github/issue")
public class GithubIssueResource {

  private final TrelloClient trello;
  private final GitrelloConfiguration configuration;

  @Inject
  public GithubIssueResource(TrelloClient trello, GitrelloConfiguration configuration) {
    this.trello = trello;
    this.configuration = configuration;
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void receiveGithubIssueWebHook(GithubWebHook githubWebHook) throws IOException {
    String searchString = new StringBuilder()
        .append(githubWebHook.getRepository().getOwner().getLogin())
        .append("/")
        .append(githubWebHook.getRepository().getName())
        .append("/")
        .append(githubWebHook.getIssue().getNumber())
        .toString();

    List<Card> cards = trello.search(searchString).getCards().stream()
        .filter(c -> c.getDesc().startsWith(searchString))
        .collect(Collectors.toList());
    if(cards.size() == 0) {
      // Create a new card
      System.out.println("Could not find card. Creating new one.");

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

      trello.createNewCard(card, searchString);
      System.out.println("Created new card for "+searchString);
    } else {
      Card card = cards.get(0);
      System.out.println(card.getName());
    }

  }


}
