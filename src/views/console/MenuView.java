package views.console;

public class MenuView extends MainView {

	public MenuView() {
		super();
	}

	@Override
	public void show() {
		ioController.writeNewLine("---------------------------");
		ioController.writeNewLine("1. Mover de baraja a descarte");
		ioController.writeNewLine("2. Mover de descarte a baraja");
		ioController.writeNewLine("3. Mover de descarte a palo");
		ioController.writeNewLine("4. Mover de descarte a escalera");
		ioController.writeNewLine("5. Mover de escalera a palo");
		ioController.writeNewLine("6. Mover de escalera a escalera");
		ioController.writeNewLine("7. Mover de palo a escalera");
		ioController.writeNewLine("8. Voltear en escalera");
		ioController.writeNewLine("9. Salir");
	}

}
