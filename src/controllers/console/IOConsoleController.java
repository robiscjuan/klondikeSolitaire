package controllers.console;

import controllers.IOController;

public class IOConsoleController implements IOController  {
	
	public void write(String string){
		System.out.println(string);
	}
	
}
