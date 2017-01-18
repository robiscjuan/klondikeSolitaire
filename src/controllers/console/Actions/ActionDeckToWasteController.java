package controllers.console.Actions;

import models.entities.GameEntity;

public class ActionDeckToWasteController extends ActionController {
private static final int CARD_NUMBER_AT_WASTE = 3;
	@Override
	public void doAction(GameEntity game) {
		if(this.errorController.isValidStack(game.getDeck())){
			for (int i = 0; i < CARD_NUMBER_AT_WASTE && !game.getDeck().isEmpty(); i++) {
				game.getWaste().push(game.getDeck().pop());
				game.getWaste().peek().turnUp();
	        }
		}
	}

}
