package models.entities;

import models.utils.CardSuitModel;
import models.utils.CardValueModel;

public class CardEntity {
	private CardSuitModel suit;
	private CardValueModel value;
	private boolean turnedUp;

	public CardEntity(CardValueModel value, CardSuitModel suit, Boolean turnedUp) {
		this.value = value;
		this.suit = suit;
		this.turnedUp = turnedUp;
	}

	public void turnUp() {
		this.turnedUp = true;
	}

	public void turnDown() {
		this.turnedUp = false;
	}

	public boolean isTurnedUp() {
		return this.turnedUp;
	}

	public CardValueModel getValue() {
		return value;
	}

	public CardSuitModel getSuit() {
		return suit;
	}
}
