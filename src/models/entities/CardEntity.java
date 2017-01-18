package models.entities;

import models.utils.CardSuitModel;
import models.utils.CardValueModel;

public class CardEntity {
	private CardSuitModel suit;
	private CardValueModel value;
	private boolean visibility;

	public CardEntity(CardValueModel value, CardSuitModel suit, Boolean visibility) {
		this.value = value;
		this.suit = suit;
		this.visibility = visibility;
	}
	
	public void turnUp(){
		this.visibility = true;
	}
	
	public void turnDown(){
		this.visibility = false;
	}

}
