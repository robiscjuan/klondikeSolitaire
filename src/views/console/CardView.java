package views.console;

import models.entities.CardEntity;

public class CardView extends MainView {

	private CardEntity card;

	public CardView(CardEntity card) {
		super();
		this.card = card;
	}

	public void show() {
		if (card.isTurnedUp()) {
			ioController.write("[" + card.getValue() + "," + card.getSuit().toString().charAt(0) + "]");
		} else {
			ioController.write("[X,X]");
		}
	}
}
