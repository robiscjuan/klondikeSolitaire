package models.entities;

import models.utils.SuitModel;

public class CardEntity {
	private int number;
	private SuitModel suit;

	public CardEntity(int number, SuitModel suit) {
		this.number = number;
		this.suit = suit;
	}
	
	
}
