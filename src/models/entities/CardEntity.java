package models.entities;

import models.utils.SuitModel;

public class CardEntity {
	private int number;
	private SuitModel suit;
	private boolean visible;

	public CardEntity(int number, SuitModel suit, Boolean visible) {
		this.number = number;
		this.suit = suit;
		this.visible = visible;
	}
	
	
}
