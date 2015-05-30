package io.pranav.gitrello.github;


public class GithubLabel {
    private String url;
    private String name;
    private String color;

    public GithubLabel(String url, String name, String color) {
        this.url = url;
        this.name = name;
        this.color = color;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
