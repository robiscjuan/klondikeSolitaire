package views.console;

import java.util.Stack;

import models.entities.CardEntity;

public class StairView extends MainView {

	private Stack<CardEntity> stair;

	private int stairNumber;

	public StairView(Stack<CardEntity> stair, int stairNumber) {
		super();
		this.stair = stair;
		this.stairNumber = stairNumber;
	}

	@Override
	public void show() {

		this.ioController.write("Escalera " + (stairNumber + 1) + ": ");

		if (stair.isEmpty()) {
			this.ioController.writeNewLine("<vac�o>");
		} else {
			for (CardEntity card : stair) {
				//La ultima carta de la escalera siempre est� girada, por eso la segunda condici�n
				if (card.isTurnedUp() || card == stair.lastElement()) {
					new CardView(card).show();
				} else {
					this.ioController.write("[");
				}
			}
		}

	}

}
