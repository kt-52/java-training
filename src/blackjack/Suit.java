package blackjack;

enum Suit {
  SPADES("S"),
  HEARTS("H"),
  CLUBS("C"),
  DIAMONDS("D"),
  ;

  final String symbol;

  Suit(String symbol) {
    this.symbol = symbol;
  }
}
