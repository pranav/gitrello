package io.pranav.gitrello.github;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.github.GithubComment.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class GithubComment {
  private final String url;
  private final int id;
  private final GithubUser user;
  private final String body;

  public GithubComment(Builder builder) {
    url = builder.url;
    id = builder.id;
    user = builder.user;
    body = builder.body;
  }

  public String getUrl() {
    return url;
  }

  public int getId() {
    return id;
  }

  public GithubUser getUser() {
    return user;
  }

  public String getBody() {
    return body;
  }

  public String toTrelloCommentString() {
    return new StringBuilder()
        .append(getUser().getLogin())
        .append(": ")
        .append(getBody())
        .toString();
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @JsonPOJOBuilder(withPrefix = "set")
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {
    private String url;
    private int id;
    private GithubUser user;
    private String body;

    public Builder setUrl(String url) {
      this.url = url;
      return this;
    }

    public Builder setId(int id) {
      this.id = id;
      return this;
    }

    public Builder setUser(GithubUser user) {
      this.user = user;
      return this;
    }

    public Builder setBody(String body) {
      this.body = body;
      return this;
    }

    public GithubComment build() {
      return new GithubComment(this);
    }
  }
}
