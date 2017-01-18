package controllers.console;

import controllers.GameController;
import controllers.IOController;
import models.utils.CardSuitModel;
import views.console.MenuView;

public class MainConsoleController {
	//TODO VER SI NO SERÍA MEJOR SACAR ESTO A LA RAIZ, Y QUE ELLA LLAMASE A GAME
	public static void main (String [] args){
		new MainConsoleController().run();
	}

	public void run(){
		GameController game = new GameConsoleController();
		MenuView menu  = new MenuView();
		menu.show();
	};
}
