package models.utils;

public enum CardValueModel {
    ACE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    KNAVE("J"),
    QUEEN("Q"),
    KING("K");
	
	private String value;
	
    CardValueModel(String value) {
        this.value = value;
    }
}
