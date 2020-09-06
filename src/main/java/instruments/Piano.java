package instruments;

public class Piano extends Instrument {

    private String pianoType;

    public Piano(InstrumentType type, String material, String colour, double buyPrice, double sellPrice, String pianoType) {
        super(type, material, colour, buyPrice, sellPrice);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    public String play() {
        return "Keys keys plonk";
    }
}
