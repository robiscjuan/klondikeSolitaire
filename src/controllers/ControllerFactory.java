package controllers;

public abstract class ControllerFactory {

public abstract CardController getCardController();
public abstract ErrorController gerErrorController();
public abstract IOController getIOController();
public abstract GameController getGameController();

}
