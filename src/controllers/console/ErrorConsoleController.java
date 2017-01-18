package controllers.console;

import java.util.Stack;

import controllers.ErrorController;
import models.entities.CardEntity;
import models.utils.ErrorModel;
import views.console.ErrorView;

public class ErrorConsoleController implements ErrorController {

	// TODO llamar a cada new ErrorView() pasando el modelo de error

	@Override
	public Boolean isValidOption(String opcion) {
		if (opcion.matches("[1-9]{1}")) {
			return true;
		} else {
			new ErrorView(ErrorModel.INVALID_OPTION).show();
			return false;
		}
	}

	@Override
	public Boolean isValidAction(CardEntity cardOrigin, CardEntity cardDestination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isValidStack(Stack<CardEntity> stack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isValidTurnUp(CardEntity card) {
		// TODO Auto-generated method stub
		return null;
	}

}
