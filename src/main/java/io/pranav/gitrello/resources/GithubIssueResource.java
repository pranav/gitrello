package io.pranav.gitrello.resources;


import io.pranav.gitrello.github.GithubWebHook;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


@Path("gitrello/github/issue")
public class GithubIssueResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void receiveGithubIssueWebHook(GithubWebHook githubWebHook) {
        System.out.println(githubWebHook.getIssue().getId());

    }
}
