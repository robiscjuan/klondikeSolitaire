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
			this.ioController.writeNewLine("<vacío>");
		} else {
			for (CardEntity card : stair) {
				//La ultima carta de la escalera siempre está girada, por eso la segunda condición
				if (card.isTurnedUp() || card == stair.lastElement()) {
					new CardView(card).show();
				} else {
					this.ioController.write("[");
				}
			}
		}

	}

}
