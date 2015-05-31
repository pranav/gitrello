package io.pranav.gitrello;


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
    return new JerseyClientBuilder().build();
  }

}
