package views.console;


public class CardView {
    private final Card card;

    private IO io = new IO();

    public CardView(Card card) {
        this.card = card;
    }

    public void show() {
        if (card.isFaceUp()) {
            io.write("[" + card.getValue() + "," + card.getSuit().toString().charAt(0) + "]");
        } else {
            io.write("[X,X]");
        }
    }
}
