package io.pranav.gitrello.resources;


import com.google.inject.Inject;
import io.pranav.gitrello.GitrelloConfiguration;
import io.pranav.gitrello.TrelloClient;
import io.pranav.gitrello.github.GithubWebHook;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;


@Path("gitrello/github/issue")
public class GithubIssueResource {

  private final TrelloClient client;

  @Inject
  public GithubIssueResource(TrelloClient client) {
    this.client = client;
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void receiveGithubIssueWebHook(GithubWebHook githubWebHook) throws IOException {
    System.out.println(client.getBoards());
    //Response res = client.target("http://en.wikipedia.org/wiki/IP_address").request(MediaType.TEXT_HTML).get();
    //System.out.println(res.readEntity(String.class));
  }


}
