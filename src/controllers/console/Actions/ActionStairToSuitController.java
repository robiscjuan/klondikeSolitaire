package controllers.console.Actions;

import java.util.Stack;

import models.entities.CardEntity;
import models.entities.GameEntity;

public class ActionStairToSuitController extends ActionController {

	@Override
	public void doAction(GameEntity game) {

		this.dialogView.askOriginStair();
		String stairNumber = this.ioController.read();

		if (this.errorController.isValidStair(stairNumber)) {
			if (this.errorController.isValidStack(game.getStair(Integer.parseInt(stairNumber) - 1))) {

				Stack<CardEntity> originStack = game.getStair(Integer.parseInt(stairNumber) - 1);
				Stack<CardEntity> destinationStack = game.getSuit(originStack.peek().getSuit());

				if (this.errorController.isValidMovementStairToSuit(originStack.peek(), destinationStack)) {
					destinationStack.push(originStack.pop());
				}
			}
		}
	}
}
