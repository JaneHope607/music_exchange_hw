package instruments;

public class Violin extends Instrument {

    private String violinType;
    private int strings;

    public Violin(InstrumentType type, String material, String colour, double buyPrice, double sellPrice, String violinType) {
        super(type, material, colour, buyPrice, sellPrice);
        this.violinType = violinType;
    }

    public String getViolinType() {
        return violinType;
    }

    public int getStrings() {
        return strings;
    }

    public String play() {
        return "This is a violin song";
    }
}
