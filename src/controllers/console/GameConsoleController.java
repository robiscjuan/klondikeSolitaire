package controllers.console;

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

		GameEntity gameEntity = new GameEntity();

		while (gameEntity.getState() != StateModel.EXIT) {
			GameView gameView = new GameView(gameEntity);
			gameView.show();

			MenuView menu = new MenuView();
			menu.show();

			String opcion = ioController.read();
			ioController.writeNewLine(opcion);

			gameEntity.setState(StateModel.GAMING);
		}

		ioController.writeNewLine("Gracias por jugar. Juan Robisco");
		System.exit(0);
	}

}
