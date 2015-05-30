package io.pranav.gitrello.github;

public class GithubWebHook {
    private String action;
    private GithubIssue issue;
    private GithubRepository repository;
    private GithubUser sender;

    public GithubWebHook(String action,
                         GithubIssue issue,
                         GithubRepository repository,
                         GithubUser sender) {
        this.action = action;
        this.issue = issue;
        this.repository = repository;
        this.sender = sender;
    }

    public GithubWebHook() {
        // Jackson
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

    public GithubUser getGithubSender() {
        return sender;
    }
}
