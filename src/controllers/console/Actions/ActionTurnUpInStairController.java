package controllers.console.Actions;

import java.util.Stack;

import models.entities.CardEntity;
import models.entities.GameEntity;

public class ActionTurnUpInStairController extends ActionController {

	@Override
	public void doAction(GameEntity game) {
		this.dialogView.askOriginStair();
		String stairNumber = this.ioController.read();

		if (this.errorController.isValidStair(stairNumber)) {
			Stack<CardEntity> stair = game.getStair(Integer.parseInt(stairNumber) - 1);
			if (this.errorController.isValidStack(stair)) {
				if (this.errorController.isValidTurnUp(stair.peek()))
					stair.peek().turnUp();
			}
		}
	}
}
