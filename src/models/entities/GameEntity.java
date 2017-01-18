package models.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import models.utils.CardSuitModel;
import models.utils.CardValueModel;
import models.utils.StateModel;

public class GameEntity {

	private static final int NUM_STAIRS = 7;

	private StateModel state;

	private Stack<CardEntity> deck;

	private Stack<CardEntity> waste;

	private Map<CardSuitModel, Stack<CardEntity>> suits;

	private List<Stack<CardEntity>> stairs;

	public GameEntity() {
		this.initializeGame();
	}

	private void initializeGame() {
		state = StateModel.INITIAL;

		waste = new Stack<>();

		suits = new HashMap<>();
		for (CardSuitModel value : CardSuitModel.values()) {
			suits.put(value, new Stack<>());
		}

		deck = new Stack<>();
		this.initializeStack();

		stairs = new ArrayList<>();
		for (int i = 0; i < NUM_STAIRS; i++) {
			stairs.add(new Stack<>());
		}
		this.initializeStairs();
	}

	private void initializeStack() {
		// Se meten todas las cartas dentro de la baraja.
		for (CardSuitModel cardSuit : CardSuitModel.values()) {
			for (CardValueModel value : CardValueModel.values()) {
				// El atributo false corresponde a la visibilidad de las cartas.
				deck.push(new CardEntity(value, cardSuit, false));
			}
		}
	}

	private void initializeStairs() {
		Collections.shuffle(deck);
		// Se sacan las cartas de la baraja y se meten en cada escalera.
		// La escalera N tendrá N cartas.
		for (int contStair = 0; contStair < NUM_STAIRS; contStair++) {
			for (int j = NUM_STAIRS; j > contStair; j--) {
				stairs.get(contStair).push(deck.pop());
			}
			// La ultima carta de cada escalera es visible, el resto ocultas.
			stairs.get(contStair).peek().turnUp();
		}
	}

	public void reset() {
		this.initializeGame();
	}

	public boolean isGameOver() {
		// TODO Revisar
		for (CardSuitModel cardSuit : CardSuitModel.values()) {
			if (suits.get(cardSuit).size() != CardValueModel.values().length) {
				return false;
			}
		}
		return true;
	}

	public Stack<CardEntity> getDeck() {
		return deck;
	}

	public Stack<CardEntity> getWaste() {
		return waste;
	}

	public Stack<CardEntity> getSuit(CardSuitModel cardSuit) {
		return suits.get(cardSuit);
	}

	public Stack<CardEntity> getStair(int stairNumber) {
		return stairs.get(stairNumber);
	}

	public StateModel getState() {
		return state;
	}

	public void setState(StateModel state) {
		this.state = state;
	}
}
