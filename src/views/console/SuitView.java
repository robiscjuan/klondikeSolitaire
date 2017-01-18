package views.console;

import java.util.Stack;

import models.entities.CardEntity;
import models.utils.CardSuitModel;

public class SuitView extends MainView {

	private Stack<CardEntity> suit;

	private CardSuitModel suitModel;

	public SuitView(Stack<CardEntity> suit, CardSuitModel suitModel) {
		this.suit = suit;
		this.suitModel = suitModel;
	}

	@Override
	public void show() {
		this.ioController.write("Palo " + this.suitModel + ": ");

		if (suit.isEmpty()) {
			this.ioController.writeNewLine("<vacío>");
		} else {
			new CardView(suit.peek()).show();
			this.ioController.writeNewLine("");
		}

	}
}
