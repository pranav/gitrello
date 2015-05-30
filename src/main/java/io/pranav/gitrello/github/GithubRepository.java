package io.pranav.gitrello.github;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GithubRepository {
    private int id;
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    private GithubUser owner;
    @JsonProperty("private")
    private boolean privateRepo;
    @JsonProperty("html_url")
    private String htmlUrl;
    private String description;
    private boolean fork;
    private String url;
    @JsonProperty("forks_url")
    private String forksUrl;
    @JsonProperty("keys_url")
    private String keysUrl;
    @JsonProperty("collaborators_url")
    private String collaboratorsUrl;
    @JsonProperty("teams_url")
    private String teams_url;
    @JsonProperty("hooks_url")
    private String hooksUrl;
    @JsonProperty("issue_events_url")
    private String issueEventsUrl;
    @JsonProperty("assignees_url")
    private String assigneesUrl;
    @JsonProperty("branches_url")
    private String branchesUrl;
    @JsonProperty("git_tags_url")
    private String gitTagsUrl;
    @JsonProperty("git_refs_url")
    private String gitRefsUrl;
    @JsonProperty("trees_url")
    private String treesUrl;
    @JsonProperty("statuses_url")
    private String statusesUrl;
    @JsonProperty("languages_url")
    private String languagesUrl;
    @JsonProperty("stargazers_url")
    private String stargazersUrl;
    @JsonProperty("contributors_url")
    private String contributorsUrl;
    @JsonProperty("subscribers_url")
    private String subscribersUrl;
    @JsonProperty("subscription_url")
    private String subsciptionUrl;
    @JsonProperty("commits_url")
    private String commitsUrl;
    @JsonProperty("git_commits_url")
    private String gitCommitsUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("issue_comment_url")
    private String issueCommenturl;
    @JsonProperty("contents_url")
    private String contentsUrl;
    @JsonProperty("compare_url")
    private String compareUrl;
    @JsonProperty("merges_url")
    private String mergesUrl;
    @JsonProperty("archive_url")
    private String archiveUrl;
    @JsonProperty("downloads_url")
    private String downloadsUrl;
    @JsonProperty("issues_url")
    private String issuesUrl;
    @JsonProperty("pulls_url")
    private String pullsUrl;
    @JsonProperty("milestones_url")
    private String milestonesUrl;
    @JsonProperty("notifications_url")
    private String notificationsUrl;
    @JsonProperty("labels_url")
    private String labelsUrl;
    @JsonProperty("releases_url")
    private String releasesUrl;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("pushed_at")
    private String pushedAt;
    @JsonProperty("git_url")
    private String gitUrl;
    @JsonProperty("ssh_url")
    private String sshUrl;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("svn_url")
    private String svnUrl;
    private String homepage;
    private int size;
    @JsonProperty("stargazers_count")
    private int stargazersCount;
    @JsonProperty("watchers_count")
    private int watchersCount;
    private String language;
    @JsonProperty("has_issues")
    private boolean hasIssues;
    @JsonProperty("has_downloads")
    private boolean hasDownloads;
    @JsonProperty("has_wiki")
    private boolean hasWiki;
    @JsonProperty("has_pages")
    private boolean hasPages;
    @JsonProperty("forks_count")
    private int forksCount;
    @JsonProperty("mirror_url")
    private String mirrorUrl;
    @JsonProperty("open_issues_count")
    private int openIssuesCount;
    private int forks;
    @JsonProperty("open_ssues")
    private int openIssues;
    private int watchers;
    private String default_branch;

    public GithubRepository() {
        // Jackson
    }

    public GithubRepository(int id,
                            String name,
                            String fullName,
                            GithubUser owner,
                            boolean privateRepo,
                            String htmlUrl,
                            String description,
                            boolean fork,
                            String url,
                            String forksUrl,
                            String keysUrl,
                            String collaboratorsUrl,
                            String teams_url,
                            String hooksUrl,
                            String issueEventsUrl,
                            String assigneesUrl,
                            String branchesUrl,
                            String gitTagsUrl,
                            String gitRefsUrl,
                            String treesUrl,
                            String statusesUrl,
                            String languagesUrl,
                            String stargazersUrl,
                            String contributorsUrl,
                            String subscribersUrl,
                            String subscriptionUrl,
                            String commitsUrl,
                            String gitCommitsUrl,
                            String commentsUrl,
                            String issueCommentUrl,
                            String contentsUrl,
                            String compareUrl,
                            String mergesUrl,
                            String archiveUrl,
                            String downloadsUrl,
                            String issuesUrl,
                            String pullsUrl,
                            String milestonesUrl,
                            String notificationsUrl,
                            String labelsUrl,
                            String releasesUrl,
                            String createdAt,
                            String updatedAt,
                            String pushedAt,
                            String gitUrl,
                            String sshUrl,
                            String cloneUrl,
                            String svnUrl,
                            String homepage,
                            int size,
                            int stargazersCount,
                            int watchersCount,
                            String language,
                            boolean hasIssues,
                            boolean hasDownloads,
                            boolean hasWiki,
                            boolean hasPages,
                            int forksCount,
                            String mirrorUrl,
                            int openIssuesCount,
                            int forks,
                            int openIssues,
                            int watchers,
                            String default_branch) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.owner = owner;
        this.privateRepo = privateRepo;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.forksUrl = forksUrl;
        this.keysUrl = keysUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.teams_url = teams_url;
        this.hooksUrl = hooksUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.assigneesUrl = assigneesUrl;
        this.branchesUrl = branchesUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.treesUrl = treesUrl;
        this.statusesUrl = statusesUrl;
        this.languagesUrl = languagesUrl;
        this.stargazersUrl = stargazersUrl;
        this.contributorsUrl = contributorsUrl;
        this.subscribersUrl = subscribersUrl;
        this.subsciptionUrl = subscriptionUrl;
        this.commitsUrl = commitsUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.commentsUrl = commentsUrl;
        this.issueCommenturl = issueCommentUrl;
        this.contentsUrl = contentsUrl;
        this.compareUrl = compareUrl;
        this.mergesUrl = mergesUrl;
        this.archiveUrl = archiveUrl;
        this.downloadsUrl = downloadsUrl;
        this.issuesUrl = issuesUrl;
        this.pullsUrl = pullsUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.labelsUrl = labelsUrl;
        this.releasesUrl = releasesUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pushedAt = pushedAt;
        this.gitUrl = gitUrl;
        this.sshUrl = sshUrl;
        this.cloneUrl = cloneUrl;
        this.svnUrl = svnUrl;
        this.homepage = homepage;
        this.size = size;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.language = language;
        this.hasIssues = hasIssues;
        this.hasDownloads = hasDownloads;
        this.hasWiki = hasWiki;
        this.hasPages = hasPages;
        this.forksCount = forksCount;
        this.mirrorUrl = mirrorUrl;
        this.openIssuesCount = openIssuesCount;
        this.forks = forks;
        this.openIssues = openIssues;
        this.watchers = watchers;
        this.default_branch = default_branch;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public GithubUser getOwner() {
        return owner;
    }

    public boolean isPrivateRepo() {
        return privateRepo;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFork() {
        return fork;
    }

    public String getUrl() {
        return url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public String getTeams_url() {
        return teams_url;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public String getSubsciptionUrl() {
        return subsciptionUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public String getIssueCommenturl() {
        return issueCommenturl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public String getHomepage() {
        return homepage;
    }

    public int getSize() {
        return size;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }

    public int getWatchersCount() {
        return watchersCount;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isHasIssues() {
        return hasIssues;
    }

    public boolean isHasDownloads() {
        return hasDownloads;
    }

    public boolean isHasWiki() {
        return hasWiki;
    }

    public boolean isHasPages() {
        return hasPages;
    }

    public int getForksCount() {
        return forksCount;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }

    public int getOpenIssuesCount() {
        return openIssuesCount;
    }

    public int getForks() {
        return forks;
    }

    public int getOpenIssues() {
        return openIssues;
    }

    public int getWatchers() {
        return watchers;
    }

    public String getDefault_branch() {
        return default_branch;
    }
}
