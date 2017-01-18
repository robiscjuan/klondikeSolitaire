package controllers.console.Actions;

import controllers.ErrorController;
import controllers.IOController;
import controllers.console.ControllerFactoryConsole;
import models.entities.GameEntity;
import views.utils.DialogView;

public abstract class ActionController {

	protected IOController ioController;
	protected ErrorController errorController;
	protected DialogView dialogView;

	protected ActionController() {
		this.ioController = new ControllerFactoryConsole().getIOController();
		this.errorController = new ControllerFactoryConsole().gerErrorController();
		this.dialogView = new DialogView();
	}

	public abstract void doAction(GameEntity game);
}
