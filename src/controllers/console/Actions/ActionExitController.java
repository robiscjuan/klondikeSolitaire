package controllers.console.Actions;

import models.entities.GameEntity;
import models.utils.StateModel;

public class ActionExitController extends ActionController {

	@Override
	public void doAction(GameEntity game) {
		game.setState(StateModel.EXIT);
	}

}
