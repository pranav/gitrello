package io.pranav.gitrello.github;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GithubMilestone {
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("labels_url")
    private String labelsUrl;
    private int id;
    private int number;
    private String title;
    private String description;
    private int openIssues;
    private int closedIssues;
    private String state;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("due_on")
    private String dueOn;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("closed_at")
    private String closedAt;

    public GithubMilestone() {
        // Jackson
    }

    public GithubMilestone(String url,
                           String htmlUrl,
                           String labelsUrl,
                           int id,
                           int number,
                           String title,
                           String description,
                           int openIssues,
                           int closedIssues,
                           String state,
                           String createdAt,
                           String dueOn,
                           String updatedAt,
                           String closedAt) {
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.labelsUrl = labelsUrl;
        this.id = id;
        this.number = number;
        this.title = title;
        this.description = description;
        this.openIssues = openIssues;
        this.closedIssues = closedIssues;
        this.state = state;
        this.createdAt = createdAt;
        this.dueOn = dueOn;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
    }

    public String getUrl() {
        return url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
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

    public String getDescription() {
        return description;
    }

    public int getOpenIssues() {
        return openIssues;
    }

    public int getClosedIssues() {
        return closedIssues;
    }

    public String getState() {
        return state;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getDueOn() {
        return dueOn;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getClosedAt() {
        return closedAt;
    }
}
