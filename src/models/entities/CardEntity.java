package models.entities;

import models.utils.CardSuitModel;

public class CardEntity {
	private int number;
	private CardSuitModel suit;
	private CardValue
	private boolean visible;

	public CardEntity(int number, CardSuitModel suit, Boolean visible) {
		this.number = number;
		this.suit = suit;
		this.visible = visible;
	}
	
	
}
