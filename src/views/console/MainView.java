package views.console;

import controllers.ControllerFactory;
import controllers.IOController;
import controllers.console.ControllerFactoryConsole;

public abstract class MainView {
	
	protected ControllerFactory factory = new ControllerFactoryConsole();
	protected IOController ioController;
	
	protected MainView(){
		this.updateControllers();
	}
	
	protected void updateControllers(){
		ioController = this.factory.getIOController();
	}
	
	public abstract void show();
}
