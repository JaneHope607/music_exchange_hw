package instruments;

public class Guitar extends Instrument {

    private String guitarType;

    public Guitar(String type, String material, String colour, double buyPrice, double sellPrice, String guitarType) {
        super(type, material, colour, buyPrice, sellPrice);
        this.guitarType = guitarType;
    }
}
