package controllers;

import java.util.Stack;

import models.entities.CardEntity;


public interface ErrorController {

	public abstract Boolean isValidOption(String opcion);

	public abstract Boolean isValidAction(CardEntity cardOrigin, CardEntity cardDestination);

	public abstract Boolean isValidStack(Stack<CardEntity> stack);

	public abstract Boolean isValidTurnUp(CardEntity card);

}
