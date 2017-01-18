package models.utils;

public enum CardSuitModel {

    DIAMONDS("oros", ColorModel.RED),
    HEARTS("copas", ColorModel.RED),
    PIKES("espadas", ColorModel.BLACK),
    CLOVERS("bastos", ColorModel.BLACK);

    private String value;
    private ColorModel color;

    CardSuitModel(String value, ColorModel color) {
        this.value = value;
        this.color = color;
    }

 
    public boolean isEqual(CardSuitModel cardSuit) {
        return this.value == cardSuit.value;
    }
    
    @Override
    public String toString() {
        return value;
    }
}
