package io.pranav.gitrello.github;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.github.GithubMilestone.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class GithubMilestone {
    private final String url;
    private final String htmlUrl;
    private final String labelsUrl;
    private final int id;
    private final int number;
    private final String title;
    private final String description;
    private final int openIssues;
    private final int closedIssues;
    private final String state;
    private final String createdAt;
    private final String dueOn;
    private final String updatedAt;
    private final String closedAt;

    public GithubMilestone(Builder builder) {
        this.url = builder.url;
        this.htmlUrl = builder.htmlUrl;
        this.labelsUrl = builder.labelsUrl;
        this.id = builder.id;
        this.number = builder.number;
        this.title = builder.title;
        this.description = builder.description;
        this.openIssues = builder.openIssues;
        this.closedIssues = builder.closedIssues;
        this.state = builder.state;
        this.createdAt = builder.createdAt;
        this.dueOn = builder.dueOn;
        this.updatedAt = builder.updatedAt;
        this.closedAt = builder.closedAt;
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

    public static Builder newBuilder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "set")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        private String url;
        private String htmlUrl;
        private String labelsUrl;
        private int id;
        private int number;
        private String title;
        private String description;
        private int openIssues;
        private int closedIssues;
        private String state;
        private String createdAt;
        private String dueOn;
        private String updatedAt;
        private String closedAt;

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }

        public Builder setLabelsUrl(String labelsUrl) {
            this.labelsUrl = labelsUrl;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setOpenIssues(int openIssues) {
            this.openIssues = openIssues;
            return this;
        }

        public Builder setClosedIssues(int closedIssues) {
            this.closedIssues = closedIssues;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDueOn(String dueOn) {
            this.dueOn = dueOn;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setClosedAt(String closedAt) {
            this.closedAt = closedAt;
            return this;
        }

        public GithubMilestone build() {
            return new GithubMilestone(this);
        }
    }
}
