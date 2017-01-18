package controllers.console;

import java.util.Stack;

import controllers.ErrorController;
import models.entities.CardEntity;
import models.utils.ErrorModel;

public class ErrorConsoleController implements ErrorController {

	@Override
	public ErrorModel validateOption() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorModel validateAction(CardEntity cardOrigin, CardEntity cardDestination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorModel validateStack(Stack<CardEntity> stack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorModel validateTurnUp(CardEntity card) {
		// TODO Auto-generated method stub
		return null;
	}

}
