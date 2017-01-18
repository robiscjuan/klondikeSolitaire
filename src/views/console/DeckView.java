package views.console;

import java.util.Stack;

import models.entities.CardEntity;

public class DeckView extends MainView{

	private Stack<CardEntity> deck;
	
	public DeckView(Stack<CardEntity> deck) {
		super();
        this.deck = deck;
    }
	
	@Override
	public void show() {
		
		  this.ioController.write("Baraja: ");
		  
	      if (deck.isEmpty()) {
	    	  ioController.writeNewLine("<vacío>");
	      } else {
	          new CardView(deck.peek()).show();
	      }
	}

}
