package controllers;

import controllers.console.ControllerFactoryConsole;
import controllers.console.GameConsoleController;
import controllers.console.IOConsoleController;
import models.entities.CardEntity;
import models.entities.GameEntity;
import models.utils.CardSuitModel;
import models.utils.CardValueModel;
import views.console.DeckView;
import views.console.GameView;
import views.console.MenuView;

public class MainController {
	//TODO VER SI NO SER�A MEJOR SACAR ESTO A LA RAIZ, Y QUE ELLA LLAMASE A GAME
	public static void main (String [] args){
		new MainController().run();
	}

	public void run(){
		GameController gameController = new ControllerFactoryConsole().getGameController();
		gameController.startGame();
	};
}