package instruments;

public class Trumpet extends Instrument {

    private String trumpetType;
    private int numberOfValves;

    public Trumpet(InstrumentType type, String material, String colour, double buyPrice, double sellPrice, int numberOfValves, String trumpetType) {
        super(type, material, colour, buyPrice, sellPrice);
        this.numberOfValves = numberOfValves;
        this.trumpetType = trumpetType;
    }

    public String getTrumpetType() {
        return trumpetType;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "Toot toot toot";
    }
}
