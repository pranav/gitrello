package io.pranav.gitrello;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class TrelloConfiguration {

  @NotEmpty @JsonProperty private String key;
  @NotEmpty @JsonProperty private String token;
  @NotEmpty @JsonProperty private String email;

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
