package controllers;

import java.util.Stack;

import models.entities.CardEntity;

public interface ErrorController {

	public abstract Boolean isValidOption(String opcion);
	
	public abstract Boolean isValidStair(String opcion);
	
	public abstract Boolean isValidSuit(String opcion);

	public abstract Boolean isValidMovementStairToStair(CardEntity cardOrigin, Stack<CardEntity> destinationStack);

	public abstract Boolean isValidMovementWasteToSuit(CardEntity cardOrigin, Stack<CardEntity> destinationStack);

	public abstract Boolean isValidMovementWasteToStair(CardEntity cardOrigin, Stack<CardEntity> destinationStack);

	public abstract Boolean isValidMovementStairToSuit(CardEntity cardOrigin, Stack<CardEntity> destinationStack);

	public abstract Boolean isValidMovementSuitToStair(CardEntity cardOrigin, Stack<CardEntity> destinationStack);

	public abstract Boolean isValidStack(Stack<CardEntity> stack);

	public abstract Boolean isValidEmptyDeck(Stack<CardEntity> stack);

	public abstract Boolean isValidTurnUp(CardEntity card);
	
	public abstract Boolean isValidNumberOfCards(String opcion,Stack<CardEntity> stack);
 

}
