package io.pranav.gitrello;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.pranav.gitrello.resources.GithubIssueResource;


public class GitrelloApplication extends Application<GitrelloConfiguration>{

  private GuiceBundle<GitrelloConfiguration> guiceBundle;

  public static void main(String[] args) throws Exception {
    new GitrelloApplication().run(args);
  }

  @Override
  public String getName() {
    return "gitrello";
  }

  @Override
  public void initialize(Bootstrap<GitrelloConfiguration> bootstrap) {
    guiceBundle = GuiceBundle.<GitrelloConfiguration>newBuilder()
        .addModule(new GitrelloModule())
        .enableAutoConfig(getClass().getPackage().getName())
        .setConfigClass(GitrelloConfiguration.class)
        .build();

    bootstrap.addBundle(guiceBundle);
  }

  @Override
  public void run(GitrelloConfiguration configuration, Environment environment) {
    environment.getObjectMapper().setPropertyNamingStrategy(
      PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
  }
}
