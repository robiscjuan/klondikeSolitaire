package views.console;

import controllers.ControllerFactory;
import controllers.IOController;
import controllers.console.ControllerFactoryConsole;

public abstract class MainView {

	protected ControllerFactory factory;
	protected IOController ioController;

	protected MainView() {
		this.factory = new ControllerFactoryConsole();
		this.updateControllers();
	}

	protected void updateControllers() {
		ioController = this.factory.getIOController();
	}

	public abstract void show();
}
