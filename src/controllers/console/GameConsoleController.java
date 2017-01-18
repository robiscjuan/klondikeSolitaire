package controllers.console;

import controllers.ErrorController;
import controllers.GameController;
import controllers.IOController;
import models.entities.GameEntity;
import models.utils.StateModel;
import views.console.GameView;
import views.console.MenuView;

public class GameConsoleController implements GameController {

	@Override
	public void startGame() {

		IOController ioController = new ControllerFactoryConsole().getIOController();
		ErrorController errorController = new ControllerFactoryConsole().gerErrorController();
		GameEntity gameEntity = new GameEntity();

		while (gameEntity.getState() != StateModel.EXIT) {

			gameEntity.setState(StateModel.GAMING);

			GameView gameView = new GameView(gameEntity);
			gameView.show();

			MenuView menu = new MenuView();
			menu.show();

			String opcion = ioController.read();
			if (errorController.isValidOption(opcion)) {
				ioController.writeNewLine(opcion);
			}
		}

		ioController.writeNewLine("Gracias por jugar. Desarrollado por Juan Robisco");
		System.exit(0);
	}

}
