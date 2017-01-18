package models.utils;

public enum ErrorModel {
	INVALID_OPTION("La opción debe ser entre 1 y 9 inclusives"),
	INVALID_STAIR("La escalera debe ser entre 1 y 7 inclusives"),
	INVALID_SUIT("El palo debe ser entre 1 y 4 inclusives"),
	NOT_ALLOWED_MOVE("Movimiento inválido"),
	EMPTY_STACK("Pila vacía"),
	NOT_EMPTY_DECK("La baraja no está vacía"),
	ALREADY_TURNED_UP("Carta ya descubierta"),
	INVALID_NUM_OF_CARD("El numero de cartas seleccionado no es válido");

	private String value;

	ErrorModel(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ERROR!!! " + value;
	}
}
