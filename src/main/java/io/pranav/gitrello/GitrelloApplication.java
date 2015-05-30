package io.pranav.gitrello;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.pranav.gitrello.resources.GithubIssueResource;


public class GitrelloApplication extends Application<GitrelloConfiguration>{

    public static void main(String[] args) throws Exception {
        new GitrelloApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<GitrelloConfiguration> bootstrap) {

    }

    @Override
    public void run(GitrelloConfiguration configuration, Environment environment) {
        final GithubIssueResource githubIssueResource = new GithubIssueResource();
        environment.jersey().register(githubIssueResource);

    }
}
