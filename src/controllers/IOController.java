package controllers;

public interface IOController {
	public abstract void writeNewLine(String string);
	
	public abstract void write(String string);
	
	public abstract String read();

}
