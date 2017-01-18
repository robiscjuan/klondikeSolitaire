package controllers.console;

import controllers.CardController;
import controllers.ControllerFactory;
import controllers.ErrorController;
import controllers.GameController;
import controllers.IOController;

public class ControllerFactoryConsole extends ControllerFactory {
	private CardController cardController;
	private ErrorController errorController;
	private IOController ioController;
	private GameController gameController;

	public ControllerFactoryConsole() {
		this.cardController = new CardController();
		this.errorController = new ErrorController();
		this.ioController = new IOController();
		this.gameController = new GameConsoleController();
	}

	@Override
	public CardController getCardController() {
		if (cardController == null) {
			this.cardController = new CardController();
		}
		return this.cardController;
	}

	@Override
	public ErrorController gerErrorController() {
//TODO revisar si error controller debería estar aquí
		if (errorController == null) {
			// errorController = new ErrorController();
		}
		return this.errorController;
	}

	@Override
	public IOController getIOController() {
		if (ioController == null) {
			this.ioController = new IOController();
		}
		return this.ioController;
	}

	@Override
	public GameController getGameController() {
		if (gameController == null) {
			this.gameController = new GameConsoleController();
		}
		return this.gameController;
	}

}
