package controllers.console;

import controllers.GameController;
import models.entities.GameEntity;

public class GameConsoleController implements GameController{
	//TODO poner atributos los modelos de deck, stair,suite y waste
		//TODO instanciar todo lo necesario
	
	@Override
	public GameEntity createGame() {
		return new GameEntity();
	}
	


}
