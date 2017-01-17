package models;

import java.util.Stack;

import models.entities.CardEntity;

public abstract class CardStack {
	//TODO Realmente se necesitan las subclases? Deben tener funciones específicas 
	protected Stack<CardEntity> cardStack;
	
	public CardStack(){
		this.cardStack = new Stack<CardEntity>();
	}
	
	public abstract CardEntity getCard();
	
	public abstract void setCard();
	
}
