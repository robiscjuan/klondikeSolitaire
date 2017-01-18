package views.console;

import controllers.ControllerFactory;
import controllers.console.ControllerFactoryConsole;

public abstract class MainView {
	
	protected ControllerFactory factory = new ControllerFactoryConsole();

	protected abstract void updateControllers();
	
}
