package controllers.console.Actions;

import java.util.Stack;

import models.entities.CardEntity;
import models.entities.GameEntity;

public class ActionStairToStairController extends ActionController {

	@Override
	public void doAction(GameEntity game) {
		this.dialogView.askOriginStair();
		String originStairNumber = this.ioController.read();

		this.dialogView.askHowManyCards();
		String howManyCards = this.ioController.read();

		this.dialogView.askDestinationStair();
		String destinationStairNumber = this.ioController.read();

		if (this.errorController.isValidStair(originStairNumber)
				&& this.errorController.isValidStair(destinationStairNumber)) {

			Stack<CardEntity> originStack = game.getStair(Integer.parseInt(originStairNumber) - 1);
			Stack<CardEntity> destinationStack = game.getStair(Integer.parseInt(destinationStairNumber) - 1);

			if (this.errorController.isValidNumberOfCards(howManyCards, originStack)
					&& this.errorController.isValidMovementStairToStair(originStack.peek(), destinationStack)) {
				
				 Stack<CardEntity> cardTransport = new Stack<>();
				 
			        for (int cardCont = 0; cardCont < Integer.parseInt(howManyCards); cardCont++) {
			        	cardTransport.push(originStack.pop());
			        }
			        while (!cardTransport.isEmpty()) {
			        	destinationStack.push(cardTransport.pop());
			        }
			        
			}
		}
	}

}
