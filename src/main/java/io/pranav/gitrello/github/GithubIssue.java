package io.pranav.gitrello.github;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GithubIssue {
    private String url;
    @JsonProperty("labels_url")
    private String labelsUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    private int id;
    private int number;
    private String title;
    private GithubUser user;
    private List<GithubLabel> labels;
    private String state;
    private boolean locked;
    private  GithubUser assignee;
    private GithubMilestone milestone;
    private int comments;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("closed_at")
    private String closedAt;
    private String body;
    private GithubLabel label;
    private GithubRepository repository;
    private GithubUser sender;

    public GithubIssue() {
        // Jackson
    }

    public GithubIssue(String url,
                       String labelsUrl,
                       String commentsUrl,
                       String eventsUrl,
                       int id,
                       int number,
                       String title,
                       GithubUser user,
                       List<GithubLabel> labels,
                       String state,
                       boolean locked,
                       GithubUser assignee,
                       GithubMilestone milestone,
                       int comments,
                       String createdAt,
                       String updatedAt,
                       String closedAt,
                       String body,
                       GithubLabel label,
                       GithubRepository repository,
                       GithubUser sender) {
        this.url = url;
        this.labelsUrl = labelsUrl;
        this.commentsUrl = commentsUrl;
        this.eventsUrl = eventsUrl;
        this.id = id;
        this.number = number;
        this.title = title;
        this.user = user;
        this.labels = labels;
        this.state = state;
        this.locked = locked;
        this.assignee = assignee;
        this.milestone = milestone;
        this.comments = comments;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.body = body;
        this.label = label;
        this.repository = repository;
        this.sender = sender;
    }

    public String getUrl() {
        return url;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public GithubUser getUser() {
        return user;
    }

    public List<GithubLabel> getLabels() {
        return labels;
    }

    public String getState() {
        return state;
    }

    public boolean isLocked() {
        return locked;
    }

    public GithubUser getAssignee() {
        return assignee;
    }

    public GithubMilestone getMilestone() {
        return milestone;
    }

    public int getComments() {
        return comments;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getClosedAt() {
        return closedAt;
    }

    public String getBody() {
        return body;
    }

    public GithubLabel getLabel() {
        return label;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public GithubUser getSender() {
        return sender;
    }
}
