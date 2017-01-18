package controllers.console;

import java.util.Stack;

import controllers.ErrorController;
import models.entities.CardEntity;
import models.utils.CardValueModel;
import models.utils.ErrorModel;
import views.console.ErrorView;

public class ErrorConsoleController implements ErrorController {

	// TODO llamar a cada new ErrorView() pasando el modelo de error

	@Override
	public Boolean isValidOption(String option) {
		if (option.matches("[1-9]{1}")) {
			return true;
		} else {
			new ErrorView(ErrorModel.INVALID_OPTION).show();
			return false;
		}
	}

	@Override
	public Boolean isValidStair(String option) {
		if (option.matches("[1-7]{1}")) {
			return true;
		} else {
			new ErrorView(ErrorModel.INVALID_STAIR).show();
			return false;
		}
	}

	@Override
	public Boolean isValidSuit(String option) {
		if (option.matches("[1-4]{1}")) {
			return true;
		} else {
			new ErrorView(ErrorModel.INVALID_SUIT).show();
			return false;
		}
	}

	@Override
	public Boolean isValidStack(Stack<CardEntity> stack) {
		if (!stack.isEmpty()) {
			return true;
		} else {
			new ErrorView(ErrorModel.EMPTY_STACK).show();
			return false;
		}
	}

	@Override
	public Boolean isValidTurnUp(CardEntity card) {
		if(!card.isTurnedUp()){
			return true;
		}else{
			new ErrorView(ErrorModel.ALREADY_TURNED_UP).show();
			return false;
		}
	}

	@Override
	public Boolean isValidMovementStairToStair(CardEntity cardOrigin, Stack<CardEntity> destinationStack) {

		if (!destinationStack.isEmpty() && !destinationStack.peek().isTurnedUp() || !cardOrigin.isTurnedUp()
				|| destinationStack.isEmpty() && cardOrigin.getValue() != CardValueModel.KING
				|| !destinationStack.isEmpty() && cardOrigin.getSuit().isEqualColor(destinationStack.peek().getSuit())
				|| !destinationStack.isEmpty()
						&& destinationStack.peek().getValue().ordinal() != cardOrigin.getValue().ordinal() + 1) {

			CardEntity destinationCard = this.sanitazeDestinationCard(destinationStack);

			new ErrorView(ErrorModel.NOT_ALLOWED_MOVE, cardOrigin, destinationCard).show();
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Boolean isValidMovementWasteToSuit(CardEntity cardOrigin, Stack<CardEntity> destinationStack) {

		if (destinationStack.isEmpty() && cardOrigin.getValue() != CardValueModel.ACE
				|| !destinationStack.isEmpty() && cardOrigin.getSuit() != destinationStack.peek().getSuit()
				|| !destinationStack.isEmpty()
						&& destinationStack.peek().getValue().ordinal() != cardOrigin.getValue().ordinal() + 1) {

			CardEntity destinationCard = this.sanitazeDestinationCard(destinationStack);

			new ErrorView(ErrorModel.NOT_ALLOWED_MOVE, cardOrigin, destinationCard).show();

			return false;
		} else {
			return true;
		}
	}

	@Override
	public Boolean isValidMovementWasteToStair(CardEntity cardOrigin, Stack<CardEntity> destinationStack) {

		if (destinationStack.isEmpty() && cardOrigin.getValue() != CardValueModel.KING
				|| !destinationStack.isEmpty() && !destinationStack.peek().isTurnedUp()
				|| !destinationStack.isEmpty() && cardOrigin.getSuit().isEqualColor(destinationStack.peek().getSuit())
				|| !destinationStack.isEmpty()
						&& destinationStack.peek().getValue().ordinal() != cardOrigin.getValue().ordinal() + 1) {

			CardEntity destinationCard = this.sanitazeDestinationCard(destinationStack);

			new ErrorView(ErrorModel.NOT_ALLOWED_MOVE, cardOrigin, destinationCard).show();
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Boolean isValidMovementStairToSuit(CardEntity cardOrigin, Stack<CardEntity> destinationStack) {

		if (destinationStack.isEmpty() && cardOrigin.getValue() != CardValueModel.ACE
				|| !destinationStack.isEmpty() && cardOrigin.getSuit() != destinationStack.peek().getSuit()
				|| !destinationStack.isEmpty()
						&& destinationStack.peek().getValue().ordinal() != cardOrigin.getValue().ordinal() + 1) {

			CardEntity destinationCard = this.sanitazeDestinationCard(destinationStack);

			new ErrorView(ErrorModel.NOT_ALLOWED_MOVE, cardOrigin, destinationCard).show();

			return false;
		} else {
			return true;
		}
	}

	@Override
	public Boolean isValidMovementSuitToStair(CardEntity cardOrigin, Stack<CardEntity> destinationStack) {
		if (destinationStack.isEmpty() && cardOrigin.getValue() != CardValueModel.KING
				|| !destinationStack.isEmpty() && !destinationStack.peek().isTurnedUp()
				|| !destinationStack.isEmpty() && cardOrigin.getSuit().isEqualColor(destinationStack.peek().getSuit())
				|| !destinationStack.isEmpty()
						&& destinationStack.peek().getValue().ordinal() != cardOrigin.getValue().ordinal() + 1) {

			CardEntity destinationCard = this.sanitazeDestinationCard(destinationStack);

			new ErrorView(ErrorModel.NOT_ALLOWED_MOVE, cardOrigin, destinationCard).show();

			return false;
		} else {
			return true;
		}
	}

	@Override
	public Boolean isValidEmptyDeck(Stack<CardEntity> stack) {
		if (stack.isEmpty()) {
			return true;
		} else {
			new ErrorView(ErrorModel.NOT_EMPTY_DECK).show();
			return false;
		}
	}

	@Override
	public Boolean isValidNumberOfCards(String opcion, Stack<CardEntity> stack) {
		if (stack.size() < Integer.parseInt(opcion)) {
			new ErrorView(ErrorModel.INVALID_NUM_OF_CARD).show();
			return false;
		} else {
			return true;
		}
	}

	private CardEntity sanitazeDestinationCard(Stack<CardEntity> destinationStack) {
		if (destinationStack.isEmpty())
			return null;
		else {
			return destinationStack.peek();
		}

	}

}
