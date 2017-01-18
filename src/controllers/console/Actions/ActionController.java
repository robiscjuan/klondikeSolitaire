package controllers.console.Actions;

import controllers.ErrorController;
import controllers.console.ControllerFactoryConsole;
import models.entities.GameEntity;

public abstract class ActionController {

	protected ErrorController errorController;
	
	protected ActionController(){
		this.errorController = new ControllerFactoryConsole().gerErrorController();
	}
	
	public abstract void doAction(GameEntity game);
}
