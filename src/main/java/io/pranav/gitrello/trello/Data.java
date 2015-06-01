package io.pranav.gitrello.trello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.trello.Data.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class Data {
  // Yeah I know how bad this class is named
  public final String text;

  public Data(Builder builder) {
    this.text = builder.text;
  }

  public String getText() {
    return text;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @JsonPOJOBuilder(withPrefix = "set")
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {

    private String text;

    public Builder setText(String text) {
      this.text = text;
      return this;
    }

    public Data build() {
      return new Data(this);
    }
  }

}
