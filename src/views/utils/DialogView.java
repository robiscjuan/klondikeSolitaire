package views.utils;

import controllers.IOController;
import controllers.console.ControllerFactoryConsole;

public class DialogView {
	private IOController ioController;

	public DialogView() {
		this.ioController = new ControllerFactoryConsole().getIOController();
	}

	public void askOriginStair() {
		this.ioController.writeNewLine("De qu� escalera? [1-7]: ");
	}

	public void askDestinationStair() {
		this.ioController.writeNewLine("A qu� escalera? [1-7]: ");
	}

	public void askHowManyCards() {
		this.ioController.writeNewLine("Cuantas cartas? ");
	}

	public void askOriginSuit() {
		this.ioController.writeNewLine("De qu� palo? [1-4]: ");
	}

}
