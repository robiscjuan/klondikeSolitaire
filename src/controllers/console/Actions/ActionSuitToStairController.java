package controllers.console.Actions;

import java.util.Stack;

import models.entities.CardEntity;
import models.entities.GameEntity;
import models.utils.CardSuitModel;

public class ActionSuitToStairController extends ActionController {

	@Override
	public void doAction(GameEntity game) {
		this.dialogView.askOriginSuit();
		String suitNumber = this.ioController.read();

		this.dialogView.askDestinationStair();
		String stairNumber = this.ioController.read();

		if (this.errorController.isValidSuit(suitNumber) && this.errorController.isValidStair(stairNumber)) {
			Stack<CardEntity> destinationStack = game.getStair(Integer.parseInt(stairNumber) - 1);
			Stack<CardEntity> suit = game.getSuit(CardSuitModel.values()[Integer.parseInt(suitNumber)- 1]);
			if (this.errorController.isValidStack(suit)) {
				if (this.errorController.isValidMovementSuitToStair(suit.peek(), destinationStack)) {
					destinationStack.push(suit.pop());
				}
			}

		}
	}

}
