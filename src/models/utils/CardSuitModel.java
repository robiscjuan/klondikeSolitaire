package models.utils;

public enum CardSuitModel {

    DIAMONDS("oros", CardColorModel.RED),
    HEARTS("copas", CardColorModel.RED),
    PIKES("espadas", CardColorModel.BLACK),
    CLOVERS("bastos", CardColorModel.BLACK);

    private String value;
    private CardColorModel color;

    CardSuitModel(String value, CardColorModel color) {
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
