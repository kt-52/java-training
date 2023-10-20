package blackjack;

import java.util.Objects;

final class Card {
  final Rank rank;
  final Suit suit;

  Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  boolean isAce() {
    return this.rank == Rank.ACE;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }

    if (other instanceof Card card) {
      return this.rank == card.rank && this.suit == card.suit;
    }

    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rank, this.suit);
  }

  @Override
  public String toString() {
    return this.suit.symbol + this.rank.symbol;
  }
}
