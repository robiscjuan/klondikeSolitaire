package models.utils;

public enum ErrorModel {
	INVALID_OPTION("La opci�n debe ser entre 1 y 9 inclusives"),
	INVALID_STAIR("La escalera debe ser entre 1 y 7 inclusives"),
	INVALID_SUIT("El palo debe ser entre 1 y 4 inclusives"),
	NOT_ALLOWED_MOVE("Movimiento inv�lido"),
	EMPTY_STACK("Pila vac�a"),
	NOT_EMPTY_DECK("La baraja no est� vac�a"),
	ALREADY_TURNED_UP("Carta ya descubierta"),
	INVALID_NUM_OF_CARD("El numero de cartas seleccionado no es v�lido");

	private String value;

	ErrorModel(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ERROR!!! " + value;
	}
}
