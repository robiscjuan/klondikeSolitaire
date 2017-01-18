package controllers.console;

import java.util.Stack;

import controllers.ErrorController;
import models.entities.CardEntity;
import models.utils.ErrorModel;
import views.console.ErrorView;

public class ErrorConsoleController implements ErrorController {

	// TODO llamar a cada new ErrorView() pasando el modelo de error

	@Override
	public Boolean isValidOption(String option) {
		if (option.matches("[1-9]{1}")) {
			return true;
		} else {
			new ErrorView(ErrorModel.INVALID_OPTION).show();
			return false;
		}
	}

	@Override
	public Boolean isValidStack(Stack<CardEntity> stack) {
		if (!stack.isEmpty()) {
			return true;
		} else {
			new ErrorView(ErrorModel.EMPTY_STACK).show();
			return false;
		}
	}

	@Override
	public Boolean isValidTurnUp(CardEntity card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isValidMovementStairToStair(CardEntity cardOrigin, CardEntity cardDestination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isValidMovementWasteToSuit(CardEntity cardOrigin, CardEntity cardDestination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isValidMovementWasteToStair(CardEntity cardOrigin, CardEntity cardDestination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isValidMovementStairToSuit(CardEntity cardOrigin, CardEntity cardDestination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isValidMovementSuitToStair(CardEntity cardOrigin, CardEntity cardDestination) {
		// TODO Auto-generated method stub
		return null;
	}

}
