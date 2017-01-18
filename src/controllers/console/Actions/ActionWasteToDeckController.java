package controllers.console.Actions;

import models.entities.GameEntity;

public class ActionWasteToDeckController extends ActionController {

	@Override
	public void doAction(GameEntity game) {
		if (this.errorController.isValidStack(game.getWaste())
				&& this.errorController.isValidEmptyDeck(game.getDeck())) {
			while (!game.getWaste().isEmpty()) {
				game.getDeck().push(game.getWaste().pop());
				game.getDeck().peek().turnDown();
			}
		}
	}

}
