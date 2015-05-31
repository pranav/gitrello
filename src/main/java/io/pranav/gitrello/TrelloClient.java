package io.pranav.gitrello;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import io.pranav.gitrello.trello.Board;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;

public class TrelloClient {
  private static final String TRELLO_API = "https://api.trello.com/1/";
  private static final String MY_BOARDS = "me/boards/";
  private static final String BOARD = "boards/";

  private final String key;
  private final String token;
  private final Client client;

  @Inject
  public TrelloClient(GitrelloConfiguration configuration, Client client) {
    key = configuration.getTrelloConfiguration().getKey();
    token = configuration.getTrelloConfiguration().getToken();
    this.client = client;
  }

  public Board[] getBoards() throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    return mapper.readValue(get(MY_BOARDS), Board[].class);
  }

  public Board getBoard(String id) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    return mapper.readValue(get(BOARD + id), Board.class);
  }

  private String get(String endpoint) {
    Response res = client.target(TRELLO_API + endpoint)
        .queryParam("key", key)
        .queryParam("token", token)
        .request(MediaType.APPLICATION_JSON)
        .get();
    return res.readEntity(String.class);
  }

}
