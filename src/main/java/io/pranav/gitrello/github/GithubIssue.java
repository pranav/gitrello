package io.pranav.gitrello.github;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.github.GithubIssue.Builder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class GithubIssue {
    private final String url;
    private final String labelsUrl;
    private final String commentsUrl;
    private final String eventsUrl;
    private final int id;
    private final int number;
    private final String title;
    private final GithubUser user;
    private final List<GithubLabel> labels;
    private final String state;
    private final boolean locked;
    private final GithubUser assignee;
    private final GithubMilestone milestone;
    private final int comments;
    private final String createdAt;
    private final String updatedAt;
    private final String closedAt;
    private final String body;
    private final GithubLabel label;
    private final GithubRepository repository;
    private final GithubUser sender;

    public GithubIssue(Builder builder) {
        this.url = builder.url;
        this.labelsUrl = builder.labelsUrl;
        this.commentsUrl = builder.commentsUrl;
        this.eventsUrl = builder.eventsUrl;
        this.id = builder.id;
        this.number = builder.number;
        this.title = builder.title;
        this.user = builder.user;
        this.labels = builder.labels;
        this.state = builder.state;
        this.locked = builder.locked;
        this.assignee = builder.assignee;
        this.milestone = builder.milestone;
        this.comments = builder.comments;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.closedAt = builder.closedAt;
        this.body = builder.body;
        this.label = builder.label;
        this.repository = builder.repository;
        this.sender = builder.sender;
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

    public static Builder newBuilder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "set")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        private String url;
        private String labelsUrl;
        private String commentsUrl;
        private String eventsUrl;
        private int id;
        private int number;
        private String title;
        private GithubUser user;
        private List<GithubLabel> labels;
        private String state;
        private boolean locked;
        private GithubUser assignee;
        private GithubMilestone milestone;
        private int comments;
        private String createdAt;
        private String updatedAt;
        private String closedAt;
        private String body;
        private GithubLabel label;
        private GithubRepository repository;
        private GithubUser sender;

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setLabelsUrl(String labelsUrl) {
            this.labelsUrl = labelsUrl;
            return this;
        }

        public Builder setCommentsUrl(String commentsUrl) {
            this.commentsUrl = commentsUrl;
            return this;
        }

        public Builder setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
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

        public Builder setUser(GithubUser user) {
            this.user = user;
            return this;
        }

        public Builder setLabels(List<GithubLabel> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setLocked(boolean locked) {
            this.locked = locked;
            return this;
        }

        public Builder setAssignee(GithubUser assignee) {
            this.assignee = assignee;
            return this;
        }

        public Builder setMilestone(GithubMilestone milestone) {
            this.milestone = milestone;
            return this;
        }

        public Builder setComments(int comments) {
            this.comments = comments;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
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

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setLabel(GithubLabel label) {
            this.label = label;
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

        public GithubIssue build() {
            return new GithubIssue(this);
        }
    }
}
