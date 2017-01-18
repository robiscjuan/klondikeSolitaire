package controllers;

import java.util.Stack;

import models.entities.CardEntity;
import models.utils.ErrorModel;

public interface ErrorController {

	public abstract ErrorModel validateOption();

	public abstract ErrorModel validateAction(CardEntity cardOrigin, CardEntity cardDestination);

	public abstract ErrorModel validateStack(Stack<CardEntity> stack);

	public abstract ErrorModel validateTurnUp(CardEntity card);

}
