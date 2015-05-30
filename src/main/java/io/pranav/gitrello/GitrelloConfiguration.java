package io.pranav.gitrello;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class GitrelloConfiguration extends Configuration {

  @NotEmpty public String trelloApiKey;
  @NotEmpty public String trelloApiSecret;

  @JsonProperty
  public String getTrelloApiKey() {
    return trelloApiKey;
  }

  @JsonProperty
  public void setTrelloApiKey(String trelloApiKey) {
    this.trelloApiKey = trelloApiKey;
  }

  @JsonProperty
  public String getTrelloApiSecret() {
    return trelloApiSecret;
  }

  @JsonProperty
  public void setTrelloApiSecret(String trelloApiSecret) {
    this.trelloApiSecret = trelloApiSecret;
  }
}
