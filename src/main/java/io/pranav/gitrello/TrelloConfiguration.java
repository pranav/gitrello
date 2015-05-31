package io.pranav.gitrello;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class TrelloConfiguration {

  @NotEmpty @JsonProperty public String trelloApiKey;
  @NotEmpty @JsonProperty public String trelloApiSecret;

  public String getTrelloApiKey() {
    return trelloApiKey;
  }

  public void setTrelloApiKey(String trelloApiKey) {
    this.trelloApiKey = trelloApiKey;
  }

  public String getTrelloApiSecret() {
    return trelloApiSecret;
  }

  public void setTrelloApiSecret(String trelloApiSecret) {
    this.trelloApiSecret = trelloApiSecret;
  }
}
