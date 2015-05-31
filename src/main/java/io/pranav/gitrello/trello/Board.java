package io.pranav.gitrello.trello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.trello.Board.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class Board {
  private final String id;
  private final String name;
  private final boolean closed;
  private final String idOrganization;

  public Board(Builder builder) {
    id = builder.id;
    name = builder.name;
    closed = builder.closed;
    idOrganization = builder.idOrganization;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public boolean isClosed() {
    return closed;
  }

  public String getIdOrganization() {
    return idOrganization;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @JsonPOJOBuilder(withPrefix = "set")
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {
    private String id;
    private String name;
    private boolean closed;
    private String idOrganization;

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setClosed(boolean closed) {
      this.closed = closed;
      return this;
    }

    public Builder setIdOrganization(String idOrganization) {
      this.idOrganization = idOrganization;
      return this;
    }

    public Board build() {
      return new Board(this);
    }
  }
}
