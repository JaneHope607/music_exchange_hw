package instruments;

public abstract class Instrument {

    private String type;
    private String material;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String type, String material, String colour, double buyPrice, double sellPrice) {
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
