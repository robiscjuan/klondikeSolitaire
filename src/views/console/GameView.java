package views.console;

import models.entities.GameEntity;
import models.utils.CardSuitModel;

public class GameView extends MainView {
	private GameEntity game;

	public GameView(GameEntity game) {
		super();
		this.game = game;
	}

	@Override
	public void show() {
		ioController.writeNewLine("---------------------------");
		ioController.writeNewLine("---------------------------");
		new DeckView(this.game.getDeck()).show();
		new WasteView(this.game.getWaste()).show();
		new SuitView(this.game.getSuit(CardSuitModel.DIAMONDS), CardSuitModel.DIAMONDS).show();
		new SuitView(this.game.getSuit(CardSuitModel.HEARTS), CardSuitModel.HEARTS).show();
		new SuitView(this.game.getSuit(CardSuitModel.PIKES), CardSuitModel.PIKES).show();
		new SuitView(this.game.getSuit(CardSuitModel.CLOVERS), CardSuitModel.CLOVERS).show();
		for (int stairsCont = 0; stairsCont < this.game.getNumStairs(); stairsCont++) {
			new StairView(this.game.getStair(stairsCont), stairsCont).show();
		}
	}

}
