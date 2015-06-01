package io.pranav.gitrello.trello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.trello.BoardList.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class BoardList {
  private final String id;
  private final String name;
  private final boolean closed;
  private final String idBoard;
  private final int pos;

  public BoardList(Builder builder) {
    id = builder.id;
    name = builder.name;
    closed = builder.closed;
    idBoard = builder.idBoard;
    pos = builder.pos;
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

  public String getIdBoard() {
    return idBoard;
  }

  public int getPos() {
    return pos;
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
    private String idBoard;
    private int pos;

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

    public Builder setIdBoard(String idBoard) {
      this.idBoard = idBoard;
      return this;
    }

    public Builder setPos(int pos) {
      this.pos = pos;
      return this;
    }

    public BoardList build() {
      return new BoardList(this);
    }
  }
}
