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
		this.gameController = new GameController();
	}

	@Override
	public CardController getCardController() {
		return this.cardController;
	}

	@Override
	public ErrorController gerErrorController() {
		return this.errorController;
	}

	@Override
	public IOController getIOController() {
		return this.ioController;
	}

	@Override
	public GameController getGameController() {
		return this.gameController;
	}

}
