package io.pranav.gitrello.github;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.github.GithubRepository.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class GithubRepository {
    private final int id;
    private final String name;
    private final String fullName;
    private final GithubUser owner;
    private final boolean privateRepo;
    private final String htmlUrl;
    private final String description;
    private final boolean fork;
    private final String url;
    private final String forksUrl;
    private final String keysUrl;
    private final String collaboratorsUrl;
    private final String teams_url;
    private final String hooksUrl;
    private final String issueEventsUrl;
    private final String assigneesUrl;
    private final String branchesUrl;
    private final String gitTagsUrl;
    private final String gitRefsUrl;
    private final String treesUrl;
    private final String statusesUrl;
    private final String languagesUrl;
    private final String stargazersUrl;
    private final String contributorsUrl;
    private final String subscribersUrl;
    private final String subsciptionUrl;
    private final String commitsUrl;
    private final String gitCommitsUrl;
    private final String commentsUrl;
    private final String issueCommenturl;
    private final String contentsUrl;
    private final String compareUrl;
    private final String mergesUrl;
    private final String archiveUrl;
    private final String downloadsUrl;
    private final String issuesUrl;
    private final String milestonesUrl;
    private final String notificationsUrl;
    private final String labelsUrl;
    private final String releasesUrl;
    private final String createdAt;
    private final String updatedAt;
    private final String pushedAt;
    private final String gitUrl;
    private final String sshUrl;
    private final String cloneUrl;
    private final String svnUrl;
    private final String homepage;
    private final int size;
    private final int stargazersCount;
    private final int watchersCount;
    private final String language;
    private final boolean hasIssues;
    private final boolean hasDownloads;
    private final boolean hasWiki;
    private final boolean hasPages;
    private final int forksCount;
    private final String mirrorUrl;
    private final int openIssuesCount;
    private final int forks;
    private final int openIssues;
    private final int watchers;
    private final String default_branch;

    public GithubRepository(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.fullName = builder.fullName;
        this.owner = builder.owner;
        this.privateRepo = builder.privateRepo;
        this.htmlUrl = builder.htmlUrl;
        this.description = builder.description;
        this.fork = builder.fork;
        this.url = builder.url;
        this.forksUrl = builder.forksUrl;
        this.keysUrl = builder.keysUrl;
        this.collaboratorsUrl = builder.collaboratorsUrl;
        this.teams_url = builder.teams_url;
        this.hooksUrl = builder.hooksUrl;
        this.issueEventsUrl = builder.issueEventsUrl;
        this.assigneesUrl = builder.assigneesUrl;
        this.branchesUrl = builder.branchesUrl;
        this.gitTagsUrl = builder.gitTagsUrl;
        this.gitRefsUrl = builder.gitRefsUrl;
        this.treesUrl = builder.treesUrl;
        this.statusesUrl = builder.statusesUrl;
        this.languagesUrl = builder.languagesUrl;
        this.stargazersUrl = builder.stargazersUrl;
        this.contributorsUrl = builder.contributorsUrl;
        this.subscribersUrl = builder.subscribersUrl;
        this.subsciptionUrl = builder.subsciptionUrl;
        this.commitsUrl = builder.commitsUrl;
        this.gitCommitsUrl = builder.gitCommitsUrl;
        this.commentsUrl = builder.commentsUrl;
        this.issueCommenturl = builder.issueCommenturl;
        this.contentsUrl = builder.contentsUrl;
        this.compareUrl = builder.compareUrl;
        this.mergesUrl = builder.mergesUrl;
        this.archiveUrl = builder.archiveUrl;
        this.downloadsUrl = builder.downloadsUrl;
        this.issuesUrl = builder.issuesUrl;
        this.milestonesUrl = builder.milestonesUrl;
        this.notificationsUrl = builder.notificationsUrl;
        this.labelsUrl = builder.labelsUrl;
        this.releasesUrl = builder.releasesUrl;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.pushedAt = builder.pushedAt;
        this.gitUrl = builder.gitUrl;
        this.sshUrl = builder.sshUrl;
        this.cloneUrl = builder.cloneUrl;
        this.svnUrl = builder.svnUrl;
        this.homepage = builder.homepage;
        this.size = builder.size;
        this.stargazersCount = builder.stargazersCount;
        this.watchersCount = builder.watchersCount;
        this.language = builder.language;
        this.hasIssues = builder.hasIssues;
        this.hasDownloads = builder.hasDownloads;
        this.hasWiki = builder.hasWiki;
        this.hasPages = builder.hasPages;
        this.forksCount = builder.forksCount;
        this.mirrorUrl = builder.mirrorUrl;
        this.openIssuesCount = builder.openIssuesCount;
        this.forks = builder.forks;
        this.openIssues = builder.openIssues;
        this.watchers = builder.watchers;
        this.default_branch = builder.default_branch;
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

    public static Builder newBuilder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "set")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        private int id;
        private String name;
        private String fullName;
        private GithubUser owner;
        private boolean privateRepo;
        private String htmlUrl;
        private String description;
        private boolean fork;
        private String url;
        private String forksUrl;
        private String keysUrl;
        private String collaboratorsUrl;
        private String teams_url;
        private String hooksUrl;
        private String issueEventsUrl;
        private String assigneesUrl;
        private String branchesUrl;
        private String gitTagsUrl;
        private String gitRefsUrl;
        private String treesUrl;
        private String statusesUrl;
        private String languagesUrl;
        private String stargazersUrl;
        private String contributorsUrl;
        private String subscribersUrl;
        private String subsciptionUrl;
        private String commitsUrl;
        private String gitCommitsUrl;
        private String commentsUrl;
        private String issueCommenturl;
        private String contentsUrl;
        private String compareUrl;
        private String mergesUrl;
        private String archiveUrl;
        private String downloadsUrl;
        private String issuesUrl;
        private String milestonesUrl;
        private String notificationsUrl;
        private String labelsUrl;
        private String releasesUrl;
        private String createdAt;
        private String updatedAt;
        private String pushedAt;
        private String gitUrl;
        private String sshUrl;
        private String cloneUrl;
        private String svnUrl;
        private String homepage;
        private int size;
        private int stargazersCount;
        private int watchersCount;
        private String language;
        private boolean hasIssues;
        private boolean hasDownloads;
        private boolean hasWiki;
        private boolean hasPages;
        private int forksCount;
        private String mirrorUrl;
        private int openIssuesCount;
        private int forks;
        private int openIssues;
        private int watchers;
        private String default_branch;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setOwner(GithubUser owner) {
            this.owner = owner;
            return this;
        }

        public Builder setPrivateRepo(boolean privateRepo) {
            this.privateRepo = privateRepo;
            return this;
        }

        public Builder setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setFork(boolean fork) {
            this.fork = fork;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setForksUrl(String forksUrl) {
            this.forksUrl = forksUrl;
            return this;
        }

        public Builder setKeysUrl(String keysUrl) {
            this.keysUrl = keysUrl;
            return this;
        }

        public Builder setCollaboratorsUrl(String collaboratorsUrl) {
            this.collaboratorsUrl = collaboratorsUrl;
            return this;
        }

        public Builder setTeams_url(String teams_url) {
            this.teams_url = teams_url;
            return this;
        }

        public Builder setHooksUrl(String hooksUrl) {
            this.hooksUrl = hooksUrl;
            return this;
        }

        public Builder setIssueEventsUrl(String issueEventsUrl) {
            this.issueEventsUrl = issueEventsUrl;
            return this;
        }

        public Builder setAssigneesUrl(String assigneesUrl) {
            this.assigneesUrl = assigneesUrl;
            return this;
        }

        public Builder setBranchesUrl(String branchesUrl) {
            this.branchesUrl = branchesUrl;
            return this;
        }

        public Builder setGitTagsUrl(String gitTagsUrl) {
            this.gitTagsUrl = gitTagsUrl;
            return this;
        }

        public Builder setGitRefsUrl(String gitRefsUrl) {
            this.gitRefsUrl = gitRefsUrl;
            return this;
        }

        public Builder setTreesUrl(String treesUrl) {
            this.treesUrl = treesUrl;
            return this;
        }

        public Builder setStatusesUrl(String statusesUrl) {
            this.statusesUrl = statusesUrl;
            return this;
        }

        public Builder setLanguagesUrl(String languagesUrl) {
            this.languagesUrl = languagesUrl;
            return this;
        }

        public Builder setStargazersUrl(String stargazersUrl) {
            this.stargazersUrl = stargazersUrl;
            return this;
        }

        public Builder setContributorsUrl(String contributorsUrl) {
            this.contributorsUrl = contributorsUrl;
            return this;
        }

        public Builder setSubscribersUrl(String subscribersUrl) {
            this.subscribersUrl = subscribersUrl;
            return this;
        }

        public Builder setSubsciptionUrl(String subsciptionUrl) {
            this.subsciptionUrl = subsciptionUrl;
            return this;
        }

        public Builder setCommitsUrl(String commitsUrl) {
            this.commitsUrl = commitsUrl;
            return this;
        }

        public Builder setGitCommitsUrl(String gitCommitsUrl) {
            this.gitCommitsUrl = gitCommitsUrl;
            return this;
        }

        public Builder setCommentsUrl(String commentsUrl) {
            this.commentsUrl = commentsUrl;
            return this;
        }

        public Builder setIssueCommenturl(String issueCommenturl) {
            this.issueCommenturl = issueCommenturl;
            return this;
        }

        public Builder setContentsUrl(String contentsUrl) {
            this.contentsUrl = contentsUrl;
            return this;
        }

        public Builder setCompareUrl(String compareUrl) {
            this.compareUrl = compareUrl;
            return this;
        }

        public Builder setMergesUrl(String mergesUrl) {
            this.mergesUrl = mergesUrl;
            return this;
        }

        public Builder setArchiveUrl(String archiveUrl) {
            this.archiveUrl = archiveUrl;
            return this;
        }

        public Builder setDownloadsUrl(String downloadsUrl) {
            this.downloadsUrl = downloadsUrl;
            return this;
        }

        public Builder setIssuesUrl(String issuesUrl) {
            this.issuesUrl = issuesUrl;
            return this;
        }

        public Builder setMilestonesUrl(String milestonesUrl) {
            this.milestonesUrl = milestonesUrl;
            return this;
        }

        public Builder setNotificationsUrl(String notificationsUrl) {
            this.notificationsUrl = notificationsUrl;
            return this;
        }

        public Builder setLabelsUrl(String labelsUrl) {
            this.labelsUrl = labelsUrl;
            return this;
        }

        public Builder setReleasesUrl(String releasesUrl) {
            this.releasesUrl = releasesUrl;
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

        public Builder setPushedAt(String pushedAt) {
            this.pushedAt = pushedAt;
            return this;
        }

        public Builder setGitUrl(String gitUrl) {
            this.gitUrl = gitUrl;
            return this;
        }

        public Builder setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }

        public Builder setCloneUrl(String cloneUrl) {
            this.cloneUrl = cloneUrl;
            return this;
        }

        public Builder setSvnUrl(String svnUrl) {
            this.svnUrl = svnUrl;
            return this;
        }

        public Builder setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setStargazersCount(int stargazersCount) {
            this.stargazersCount = stargazersCount;
            return this;
        }

        public Builder setWatchersCount(int watchersCount) {
            this.watchersCount = watchersCount;
            return this;
        }

        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder setHasIssues(boolean hasIssues) {
            this.hasIssues = hasIssues;
            return this;
        }

        public Builder setHasDownloads(boolean hasDownloads) {
            this.hasDownloads = hasDownloads;
            return this;
        }

        public Builder setHasWiki(boolean hasWiki) {
            this.hasWiki = hasWiki;
            return this;
        }

        public Builder setHasPages(boolean hasPages) {
            this.hasPages = hasPages;
            return this;
        }

        public Builder setForksCount(int forksCount) {
            this.forksCount = forksCount;
            return this;
        }

        public Builder setMirrorUrl(String mirrorUrl) {
            this.mirrorUrl = mirrorUrl;
            return this;
        }

        public Builder setOpenIssuesCount(int openIssuesCount) {
            this.openIssuesCount = openIssuesCount;
            return this;
        }

        public Builder setForks(int forks) {
            this.forks = forks;
            return this;
        }

        public Builder setOpenIssues(int openIssues) {
            this.openIssues = openIssues;
            return this;
        }

        public Builder setWatchers(int watchers) {
            this.watchers = watchers;
            return this;
        }

        public Builder setDefault_branch(String default_branch) {
            this.default_branch = default_branch;
            return this;
        }

        public GithubRepository build() {
            return new GithubRepository(this);
        }
    }
}
