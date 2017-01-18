package models.entities;

import models.CardStack;

public class Stair extends CardStack{

	@Override
	public CardEntity getCard() {
		//Todo manejar las excepciones de pila vacia
		return this.cardStack.pop();
	}

	@Override
	public void setCard() {
		// TODO Auto-generated method stub
		
	}

}
