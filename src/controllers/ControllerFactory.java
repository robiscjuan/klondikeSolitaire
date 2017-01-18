package controllers;

public interface ControllerFactory {

public abstract ErrorController gerErrorController();
public abstract IOController getIOController();
public abstract GameController getGameController();

}
