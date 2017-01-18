package views.console;

import java.util.Stack;

import models.entities.CardEntity;

public class WasteView extends MainView{

	//El juego tracional es con 3 cartas en el descarte.
	private static final int CARDS_IN_WASTE = 3;
	
    private Stack<CardEntity> waste;

    public WasteView(Stack<CardEntity> waste) {
        this.waste = waste;
    }
    
	@Override
	public void show() {
		
		this.ioController.write("Descarte: ");
		
        if (waste.isEmpty()) {
        	this.ioController.writeNewLine("<vac�o>");
        } else {
            Stack<CardEntity> cards = new Stack<>();
            
            //No puedo usar peek porque tengo que mostrar m�s de una carta
            //As� que tengo que sacar las cartas de la pila y luego volver a meterlas
            
            while (!waste.isEmpty() && cards.size() < CARDS_IN_WASTE) {
                cards.push(waste.pop());
            }
            
            while (!cards.isEmpty()) {
            	CardEntity card = cards.pop();
                new CardView(card).show();
                waste.push(card);
            }
            
            this.ioController.writeNewLine("");
        }
		
	}

}
