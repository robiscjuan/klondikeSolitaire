package controllers.console;

import controllers.IOController;

public class IOConsoleController implements IOController  {
	
	@Override
	public void writeNewLine(String string) {
		System.out.println(string);		
	}

	@Override
	public void write(String string) {
		System.out.print(string);		
	}
	
}
