package io.pranav.gitrello;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import io.pranav.gitrello.github.GithubWebHook;
import io.pranav.gitrello.trello.Board;
import io.pranav.gitrello.trello.BoardList;
import io.pranav.gitrello.trello.Card;
import io.pranav.gitrello.trello.CommentCard;
import io.pranav.gitrello.trello.Search;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;

public class TrelloClient {
  private static final String TRELLO_API = "https://api.trello.com/1/";
  private static final String MY_BOARDS = TRELLO_API + "members/me/boards/";
  private static final String BOARD = TRELLO_API + "boards/";
  private static final String SEARCH = TRELLO_API + "search/";
  private static final String CARDS = TRELLO_API + "cards/";

  private final String key;
  private final String token;
  private final Client client;
  private final ObjectMapper mapper = new ObjectMapper();

  @Inject
  public TrelloClient(GitrelloConfiguration configuration, Client client) {
    key = configuration.getTrelloConfiguration().getKey();
    token = configuration.getTrelloConfiguration().getToken();
    this.client = client;
  }

  public static String getGithubIssueIdentifier(GithubWebHook githubWebHook) {
    return new StringBuilder()
        .append(githubWebHook.getRepository().getOwner().getLogin())
        .append("/")
        .append(githubWebHook.getRepository().getName())
        .append("/")
        .append(githubWebHook.getIssue().getNumber())
        .append("/")
        .toString();
  }

  public Card createNewCard(Card card, String githubIssueIdentifier) throws IOException {
    String description = new StringBuilder(githubIssueIdentifier)
        .append("\n\n")
        .append(card.getDesc())
        .toString();

    Form form = new Form()
        .param("name", card.getName())
        .param("desc", description)
        .param("due", card.getDue())
        .param("idList", card.getIdList())
        .param("urlSource", "null");
    String rawJson = post(CARDS, form);
    return mapper.readValue(rawJson, Card.class);
  }

  public Search search(String searchString) throws IOException {
    Response res = client.target(SEARCH)
        .queryParam("key", key)
        .queryParam("token", token)
        .queryParam("query", searchString)
        .request(MediaType.APPLICATION_JSON)
        .get();
    return mapper.readValue(res.readEntity(String.class), Search.class);
  }

  public List<Board> getBoards() throws IOException {
    return mapper.readValue(get(MY_BOARDS), new TypeReference<List<Board>>(){});
  }

  public Board getBoard(String id) throws IOException {
    return mapper.readValue(get(BOARD + id), Board.class);
  }

  public List<BoardList> getBoardLists(String boardId) throws IOException {
    return mapper.readValue(get(BOARD + boardId + "/lists"), new TypeReference<List<BoardList>>(){});
  }

  public CommentCard postComment(String cardId, String comment) throws IOException {
    Form form = new Form().param("text", comment);
    return mapper.readValue(post(CARDS + cardId + "/actions/comments", form), CommentCard.class);
  }

  public List<CommentCard> getCommentCardsForCard(String cardId) throws IOException {
    Response res = client.target(CARDS + cardId)
        .queryParam("key", key)
        .queryParam("token", token)
        .queryParam("actions", "commentCard")
        .request(MediaType.APPLICATION_JSON)
        .get();
    Card card = mapper.readValue(res.readEntity(String.class), Card.class);
    return card.getCommentCards();
  }

  private String get(String endpoint) {
    Response res = client.target(endpoint)
        .queryParam("key", key)
        .queryParam("token", token)
        .request(MediaType.APPLICATION_JSON)
        .get();
    return res.readEntity(String.class);
  }

  private String post(String endpoint, Form form) {
    form.param("key", key)
        .param("token", token);
    Response res = client.target(endpoint)
        .request(MediaType.APPLICATION_JSON)
        .post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE));
    return res.readEntity(String.class);
  }

}
