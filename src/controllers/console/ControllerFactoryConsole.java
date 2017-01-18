package controllers.console;

import controllers.ControllerFactory;
import controllers.ErrorController;
import controllers.GameController;
import controllers.IOController;

public class ControllerFactoryConsole implements ControllerFactory {

	private ErrorController errorController;
	
	private IOController ioController;
	
	private GameController gameController;

	@Override
	public ErrorController gerErrorController() {
		if (errorController == null) {
			this.errorController = new ErrorConsoleController();
		}
		return this.errorController;
	}

	@Override
	public IOController getIOController() {
		if (ioController == null) {
			this.ioController = new IOConsoleController();
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
