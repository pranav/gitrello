package io.pranav.gitrello;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.inject.Singleton;
import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Singleton
public class GitrelloConfiguration extends Configuration {

  @Valid
  @NotNull
  private TrelloConfiguration trelloConfiguration = new TrelloConfiguration();

  @Valid
  @NotNull
  private JerseyClientConfiguration httpClient = new JerseyClientConfiguration();

  public TrelloConfiguration getTrelloConfiguration() {
    return trelloConfiguration;
  }

  public void setTrelloConfiguration(TrelloConfiguration trelloConfiguration) {
    this.trelloConfiguration = trelloConfiguration;
  }

  @JsonProperty("httpClient")
  public JerseyClientConfiguration getJerseyClientConfiguration() {
    return httpClient;
  }

  public void setJerseyClientConfiguration(JerseyClientConfiguration httpClient) {
    this.httpClient = httpClient;
  }
}
