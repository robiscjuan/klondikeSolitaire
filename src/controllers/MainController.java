package controllers;

import controllers.console.ControllerFactoryConsole;

public class MainController {
	public static void main (String [] args){
		new MainController().run();
	}

	public void run(){
		GameController gameController = new ControllerFactoryConsole().getGameController();
		gameController.startGame();
	};
}
