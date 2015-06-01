package io.pranav.gitrello;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import org.glassfish.jersey.client.JerseyClientBuilder;

import javax.ws.rs.client.Client;

public class GitrelloModule extends AbstractModule {

  @Override
  protected void configure() {
    // I would put configuration in here, IF I HAD ONE.
  }

  @Provides
  @Named("configuration")
  public GitrelloConfiguration provideGitrelloConfiguration(GitrelloConfiguration configuration) {
    return configuration;
  }

  @Provides
  @Named("client")
  public Client provideJerseyClient() {
    return new JerseyClientBuilder()
        .register(JacksonJsonProvider.class)
        .build();
  }

  @Provides
  @Named("TrelloClient")
  public TrelloClient provideTrelloClient(@Named("configuration") GitrelloConfiguration configuration,
                                          @Named("client") Client client) {
    return new TrelloClient(configuration, client);
  }

  @Provides
  @Named("GithubClient")
  public GithubClient provideGithubClient(@Named("client") Client client) {
    return new GithubClient(client);
  }
}
