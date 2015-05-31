package io.pranav.gitrello.resources;


import com.google.inject.Inject;
import io.pranav.gitrello.GitrelloConfiguration;
import io.pranav.gitrello.github.GithubWebHook;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("gitrello/github/issue")
public class GithubIssueResource {

  private final GitrelloConfiguration configuration;
  private final Client client;

  @Inject
  public GithubIssueResource(GitrelloConfiguration configuration, Client client) {
    this.configuration = configuration;
    this.client = client;
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void receiveGithubIssueWebHook(GithubWebHook githubWebHook) {
    Response res = client.target("http://en.wikipedia.org/wiki/IP_address").request(MediaType.TEXT_HTML).get();
    System.out.println(res.readEntity(String.class));
  }


}
