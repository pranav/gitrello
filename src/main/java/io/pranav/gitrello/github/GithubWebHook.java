package io.pranav.gitrello.github;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import io.pranav.gitrello.github.GithubWebHook.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class GithubWebHook {
  private final String action;
  private final GithubIssue issue;
  private final GithubRepository repository;
  private final GithubUser sender;

  public GithubWebHook(Builder builder) {
    this.action = builder.action;
    this.issue = builder.issue;
    this.repository = builder.repository;
    this.sender = builder.sender;
  }

  public String getAction() {
    return action;
  }

  public GithubIssue getIssue() {
    return issue;
  }

  public GithubRepository getRepository() {
    return repository;
  }

  public GithubUser getSender() {
    return sender;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @JsonPOJOBuilder(withPrefix = "set")
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {
    private String action;
    private GithubIssue issue;
    private GithubRepository repository;
    private GithubUser sender;

    public Builder setAction(String action) {
      this.action = action;
      return this;
    }

    public Builder setIssue(GithubIssue issue) {
      this.issue = issue;
      return this;
    }

    public Builder setRepository(GithubRepository repository) {
      this.repository = repository;
      return this;
    }

    public Builder setSender(GithubUser sender) {
      this.sender = sender;
      return this;
    }

    public GithubWebHook build() {
      return new GithubWebHook(this);
    }
  }
}
