import blackjack.CardDeck;

public class App {
  public static void main(String[] args) throws Exception {
    var deck = new CardDeck();
    while(true) System.out.println(deck.deal());
  }
}
