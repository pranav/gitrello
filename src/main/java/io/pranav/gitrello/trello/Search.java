package io.pranav.gitrello.trello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.pranav.gitrello.trello.Search.Builder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
public class Search {
  private final List<Card> cards;
  private final List<Board> boards;

  public Search(Builder builder) {
    cards = builder.cards;
    boards = builder.boards;
  }

  public List<Card> getCards() {
    return cards;
  }

  public List<Board> getBoards() {
    return boards;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @JsonPOJOBuilder(withPrefix = "set")
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {
    private List<Card> cards;
    private List<Board> boards;

    public Builder setCards(List<Card> cards) {
      this.cards = cards;
      return this;
    }

    public Builder setBoards(List<Board> boards) {
      this.boards = boards;
      return this;
    }

    public Search build() {
      return new Search(this);
    }
  }
}
