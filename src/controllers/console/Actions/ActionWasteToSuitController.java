package controllers.console.Actions;

import java.util.Stack;

import models.entities.CardEntity;
import models.entities.GameEntity;

public class ActionWasteToSuitController extends ActionController  {

	@Override
	public void doAction(GameEntity game) {
if(this.errorController.isValidStack(game.getWaste())){
	
	Stack<CardEntity> originStack =  game.getWaste();
	Stack<CardEntity> destinationStack =  game.getSuit(game.getWaste().peek().getSuit());

	if(this.errorController.isValidMovementWasteToSuit(originStack.peek(),destinationStack)){
		destinationStack.push(originStack.pop());

	}
}
	}

}
