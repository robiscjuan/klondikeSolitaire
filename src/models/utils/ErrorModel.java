package models.utils;

public enum ErrorModel {
	INVALID_OPTION("La opción debe ser entre 1 y 9 inclusives"),
	NOT_ALLOWED_MOVE("No se puede poner"),
	EMPTY_STACK("Pila vacía"),
	NOT_EMPTY_DECK("La baraja no está vacía"),
	ALREADY_TURNED_UP("Carta ya descubierta");

	private String value;

	ErrorModel(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ERROR!!! " + value;
	}
}
