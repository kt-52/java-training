package blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class CardDeck {
  private static final List<Card> STANDARD_52_CARD_DECK;
  static {
    STANDARD_52_CARD_DECK = Arrays.stream(Rank.values())
        .flatMap(rank -> Arrays.stream(Suit.values()).map(suit -> new Card(rank, suit)))
        .collect(Collectors.toUnmodifiableList());
  }

  private final Stack<Card> stack = new Stack<>();

  public CardDeck() {
    this.refresh();
  }

  private void refresh() {
    this.stack.clear();
    var shuffled = new ArrayList<>(STANDARD_52_CARD_DECK);
    Collections.shuffle(shuffled);
    this.stack.addAll(shuffled);
  }

  public Card deal() {
    if (this.stack.empty()) {
      this.refresh();
    }
    return this.stack.pop();
  }
}
