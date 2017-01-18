package controllers.console.Actions;

import java.util.Stack;

import models.entities.CardEntity;
import models.entities.GameEntity;

public class ActionWasteToStairController extends ActionController {

	@Override
	public void doAction(GameEntity game) {
		if (this.errorController.isValidStack(game.getWaste())) {

			Stack<CardEntity> originStack = game.getWaste();

			
			this.dialogView.askDestinationStair();
			String stairNumber = this.ioController.read();
			
			if (this.errorController.isValidStair(stairNumber)) {
				Stack<CardEntity> destinationStack = game.getStair(Integer.parseInt(stairNumber) - 1);

				if (this.errorController.isValidMovementWasteToStair(originStack.peek(), destinationStack)) {
					destinationStack.push(originStack.pop());

				}
			}
		}

	}
}
