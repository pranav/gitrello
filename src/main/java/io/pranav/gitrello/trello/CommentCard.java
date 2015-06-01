package io.pranav.gitrello.trello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.trello.CommentCard.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class CommentCard {
  private final String id;
  private final String type;
  private final String date;
  private final String idMemberCreator;
  private final Data data;

  public CommentCard(Builder builder) {
    id = builder.id;
    type = builder.type;
    date = builder.date;
    idMemberCreator = builder.idMemberCreator;
    data = builder.data;
  }

  public String getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public String getDate() {
    return date;
  }

  public String getIdMemberCreator() {
    return idMemberCreator;
  }

  public Data getData() {
    return data;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @JsonPOJOBuilder(withPrefix = "set")
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {
    private String id;
    private String type;
    private String date;
    private String idMemberCreator;
    private Data data;

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public Builder setType(String type) {
      this.type = type;
      return this;
    }

    public Builder setDate(String date) {
      this.date = date;
      return this;
    }

    public Builder setIdMemberCreator(String idMemberCreator) {
      this.idMemberCreator = idMemberCreator;
      return this;
    }

    public Builder setData(Data data) {
      this.data = data;
      return this;
    }

    public CommentCard build() {
      return new CommentCard(this);
    }
  }
}
