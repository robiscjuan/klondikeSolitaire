package controllers.console;

import controllers.GameController;
import controllers.IOController;
import models.entities.CardEntity;
import models.entities.GameEntity;
import models.utils.CardSuitModel;
import models.utils.CardValueModel;
import views.console.CardView;
import views.console.DeckView;
import views.console.GameView;
import views.console.MenuView;

public class MainConsoleController {
	//TODO VER SI NO SERÍA MEJOR SACAR ESTO A LA RAIZ, Y QUE ELLA LLAMASE A GAME
	public static void main (String [] args){
		new MainConsoleController().run();
	}

	public void run(){
		IOController io= new IOConsoleController();
		
		GameController gameController = new GameConsoleController();
		GameEntity gameEntity = gameController.createGame();
		GameView gameView  = new GameView(gameEntity);
		gameView.show();
		
		MenuView menu  = new MenuView();
		menu.show();
		

		
		String opcion = io.read();
		
		io.writeNewLine(opcion);
		
		//CardView card = new CardView(new CardEntity(CardValueModel.ACE, CardSuitModel.DIAMONDS, true));
		//card.show();
	};
}
