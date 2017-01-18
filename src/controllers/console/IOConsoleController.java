package controllers.console;

import java.util.Scanner;

import controllers.IOController;

public class IOConsoleController implements IOController {

	@Override
	public void writeNewLine(String string) {
		System.out.println(string);
	}

	@Override
	public void write(String string) {
		System.out.print(string);
	}

	@Override
	public String read() {
		String inputText = "";
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			return scanner.nextLine();
		} else {
			return "";
		}
	}

}
