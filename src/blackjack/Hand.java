package blackjack;

import java.util.ArrayList;

public class Hand {
  private final ArrayList<Card> cards = new ArrayList<>();

  public Hand(Card first, Card second){
    this.add(first);
    this.add(second);
  }

  public void add(Card card) {
    this.cards.add(card);
  }

  public boolean hasAce() {
    return this.cards.stream().anyMatch(Card::isAce);
  }

  public int point() {
    var point = this.cards
        .stream()
        .mapToInt(card -> card.rank.point)
        .sum();

    if (this.hasAce() && point <= 11) {
      return point + 10;
    } else {
      return point;
    }
  }
}
