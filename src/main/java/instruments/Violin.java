package instruments;

public class Violin extends Instrument {

    private String violinType;
    private int strings;

    public Violin(String type, String material, String colour, double buyPrice, double sellPrice, String violinType) {
        super(type, material, colour, buyPrice, sellPrice);
        this.violinType = violinType;
    }
}
