package controllers.console;

import java.util.HashMap;
import java.util.Map;

import controllers.ControllerFactory;
import controllers.ErrorController;
import controllers.GameController;
import controllers.IOController;
import controllers.console.Actions.*;
import models.entities.GameEntity;
import models.utils.StateModel;
import views.console.GameView;
import views.console.MenuView;

public class GameConsoleController implements GameController {

	private ControllerFactory controllerFactory;
	private IOController ioController;
	private ErrorController errorController;

	private GameEntity gameEntity;
	private GameView gameView;

	private MenuView menu;

	private Map<String, ActionController> actionsMap;

	public GameConsoleController() {
		controllerFactory = new ControllerFactoryConsole();
		ioController = controllerFactory.getIOController();
		errorController = controllerFactory.gerErrorController();

		gameEntity = new GameEntity();

		gameView = new GameView(gameEntity);
		menu = new MenuView();

		actionsMap = new HashMap<String, ActionController>();

		this.initializeActionsMap();
	}

	@Override
	public void startGame() {

		gameEntity.setState(StateModel.GAMING);

		// TODO DO while
		while (gameEntity.getState() != StateModel.EXIT) {

			gameView.show();
			menu.show();

			String option = ioController.read();
			if (errorController.isValidOption(option)) {
				this.actionsMap.get(option).doAction(this.gameEntity);
			}
		}

		ioController.writeNewLine("Gracias por jugar. Desarrollado por Juan Robisco");
		System.exit(0);
	}

	private void initializeActionsMap() {
		this.actionsMap.put("1", new ActionDeckToWasteController());

		this.actionsMap.put("2", new ActionWasteToDeckController());

		this.actionsMap.put("3", new ActionWasteToSuitController());

		this.actionsMap.put("4", new ActionWasteToStairController());

		this.actionsMap.put("5", new ActionStairToSuitController());

		this.actionsMap.put("6", new ActionStairToStairController());

		this.actionsMap.put("7", new ActionSuitToStairController());

		this.actionsMap.put("8", new ActionTurnUpInStairController());

		this.actionsMap.put("9", new ActionExitController());

	}

}
