package io.pranav.gitrello.github;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.github.GithubLabel.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class GithubLabel {
    private final String url;
    private final String name;
    private final String color;

    public GithubLabel(Builder builder) {
        this.url = builder.url;
        this.name = builder.name;
        this.color = builder.color;
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

    public static Builder newBuilder() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "set")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {
        private String url;
        private String name;
        private String color;

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public GithubLabel build() {
            return new GithubLabel(this);
        }
    }
}
