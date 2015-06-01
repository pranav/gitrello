package io.pranav.gitrello;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import io.pranav.gitrello.github.GithubComment;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;

public class GithubClient {
  private Client client;
  private ObjectMapper mapper = new ObjectMapper();

  @Inject
  public GithubClient(Client client) {
    this.client = client;
  }

  public List<GithubComment> getGithubComments(String endpoint) throws IOException {
    return mapper.readValue(get(endpoint), new TypeReference<List<GithubComment>>(){});
  }

  private String get(String endpoint) {
    Response res = client.target(endpoint)
        .request(MediaType.APPLICATION_JSON)
        .get();
    return res.readEntity(String.class);
  }
}
