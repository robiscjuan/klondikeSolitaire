package views.console;

import controllers.IOController;

public class MenuView extends MainView{
	private IOController ioController;
	
	
	@Override
	protected void updateControllers() {
		ioController = this.factory.getIOController();
	}
	
	 public void show() {
	        ioController.write("---------------------------");
	        ioController.write("1. Mover de baraja a descarte");
	        ioController.write("2. Mover de descarte a baraja");
	        ioController.write("3. Mover de descarte a palo");
	        ioController.write("4. Mover de descarte a escalera");
	        ioController.write("5. Mover de escalera a palo");
	        ioController.write("6. Mover de escalera a escalera");
	        ioController.write("7. Mover de palo a escalera");
	        ioController.write("8. Voltear en escalera");
	        ioController.write("9. Salir");
	    }

}
