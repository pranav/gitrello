package io.pranav.gitrello.github;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.github.GithubUser.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class GithubUser {
    private final String login;
    private final int id;
    private final String avatarUrl;
    private final String gravatarId;
    private final String url;
    private final String htmlUrl;
    private final String followersUrl;
    private final String gistsUrl;
    private final String starredUrl;
    private final String subscriptionsUrl;
    private final String organizationsUrl;
    private final String reposUrl;
    private final String eventsUrl;
    private final String receivedEventsUrl;
    private final String type;
    private final boolean siteAdmin;

    public GithubUser(Builder builder) {
        this.login = builder.login;
        this.id = builder.id;
        this.avatarUrl = builder.avatarUrl;
        this.gravatarId = builder.gravatarId;
        this.url = builder.url;
        this.htmlUrl = builder.htmlUrl;
        this.followersUrl = builder.followersUrl;
        this.gistsUrl = builder.gistsUrl;
        this.starredUrl = builder.starredUrl;
        this.subscriptionsUrl = builder.subscriptionsUrl;
        this.organizationsUrl = builder.organizationsUrl;
        this.reposUrl = builder.reposUrl;
        this.eventsUrl = builder.eventsUrl;
        this.receivedEventsUrl = builder.receivedEventsUrl;
        this.type = builder.type;
        this.siteAdmin = builder.siteAdmin;
    }

  public String getLogin() {
    return login;
  }

  public int getId() {
    return id;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public String getGravatarId() {
    return gravatarId;
  }

  public String getUrl() {
    return url;
  }

  public String getHtmlUrl() {
    return htmlUrl;
  }

  public String getFollowersUrl() {
    return followersUrl;
  }

  public String getGistsUrl() {
    return gistsUrl;
  }

  public String getStarredUrl() {
    return starredUrl;
  }

  public String getSubscriptionsUrl() {
    return subscriptionsUrl;
  }

  public String getOrganizationsUrl() {
    return organizationsUrl;
  }

  public String getReposUrl() {
    return reposUrl;
  }

  public String getEventsUrl() {
    return eventsUrl;
  }

  public String getReceivedEventsUrl() {
    return receivedEventsUrl;
  }

  public String getType() {
    return type;
  }

  public boolean isSiteAdmin() {
    return siteAdmin;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @JsonPOJOBuilder(withPrefix = "set")
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {

    private String login;
    private int id;
    private String avatarUrl;
    private String gravatarId;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String gistsUrl;
    private String starredUrl;
    private String subscriptionsUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String eventsUrl;
    private String receivedEventsUrl;
    private String type;
    private boolean siteAdmin;

    public Builder setLogin(String login) {
      this.login = login;
      return this;
    }

    public Builder setId(int id) {
      this.id = id;
      return this;
    }

    public Builder setAvatarUrl(String avatarUrl) {
      this.avatarUrl = avatarUrl;
      return this;
    }

    public Builder setGravatarId(String gravatarId) {
      this.gravatarId = gravatarId;
      return this;
    }

    public Builder setUrl(String url) {
      this.url = url;
      return this;
    }

    public Builder setHtmlUrl(String htmlUrl) {
      this.htmlUrl = htmlUrl;
      return this;
    }

    public Builder setFollowersUrl(String followersUrl) {
      this.followersUrl = followersUrl;
      return this;
    }

    public Builder setGistsUrl(String gistsUrl) {
      this.gistsUrl = gistsUrl;
      return this;
    }

    public Builder setStarredUrl(String starredUrl) {
      this.starredUrl = starredUrl;
      return this;
    }

    public Builder setSubscriptionsUrl(String subscriptionsUrl) {
      this.subscriptionsUrl = subscriptionsUrl;
      return this;
    }

    public Builder setOrganizationsUrl(String organizationsUrl) {
      this.organizationsUrl = organizationsUrl;
      return this;
    }

    public Builder setReposUrl(String reposUrl) {
      this.reposUrl = reposUrl;
      return this;
    }

    public Builder setEventsUrl(String eventsUrl) {
      this.eventsUrl = eventsUrl;
      return this;
    }

    public Builder setReceivedEventsUrl(String receivedEventsUrl) {
      this.receivedEventsUrl = receivedEventsUrl;
      return this;
    }

    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    public Builder setSiteAdmin(boolean siteAdmin) {
      this.siteAdmin = siteAdmin;
      return this;
    }

    public GithubUser build() {
      return new GithubUser(this);
    }
  }

}
