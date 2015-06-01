package io.pranav.gitrello.trello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.trello.Card.Builder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class Card {
  private final String id;
  private final boolean closed;
  private final String desc;
  private final String due;
  private final String idBoard;
  private final String name;
  private final String idList;
  private final String urlSource;
  @JsonProperty("actions") // Only action we want right now is commentCard
  private final List<CommentCard> commentCards;

  public Card(Builder builder) {
    this.id = builder.id;
    this.closed = builder.closed;
    this.desc = builder.desc;
    this.due = builder.due;
    this.idBoard = builder.idBoard;
    this.name = builder.name;
    this.idList = builder.idList;
    this.urlSource = builder.urlSource;
    this.commentCards = builder.commentCards;
  }

  public String getId() {
    return id;
  }

  public boolean isClosed() {
    return closed;
  }

  public String getDesc() {
    return desc;
  }

  public String getDue() {
    return due;
  }

  public String getIdBoard() {
    return idBoard;
  }

  public String getName() {
    return name;
  }

  public String getIdList() {
    return idList;
  }

  public String getUrlSource() {
    return urlSource;
  }

  public List<CommentCard> getCommentCards() {
    return commentCards;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @JsonPOJOBuilder(withPrefix = "set")
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {
    private String id;
    private boolean closed;
    private String desc;
    private String due;
    private String idBoard;
    private String name;
    private String idList;
    private String urlSource;
    @JsonProperty("actions")
    private List<CommentCard> commentCards;

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public Builder setClosed(boolean closed) {
      this.closed = closed;
      return this;
    }

    public Builder setDesc(String desc) {
      this.desc = desc;
      return this;
    }

    public Builder setDue(String due) {
      this.due = due;
      return this;
    }

    public Builder setIdBoard(String idBoard) {
      this.idBoard = idBoard;
      return this;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setIdList(String idList) {
      this.idList = idList;
      return this;
    }

    public Builder setUrlSource(String idList) {
      this.urlSource = urlSource;
      return this;
    }

    public Builder setCommentCards(List<CommentCard> commentCards) {
      this.commentCards = commentCards;
      return this;
    }

    public Card build() {
      return new Card(this);
    }

  }

}
