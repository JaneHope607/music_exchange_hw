package instruments;

public abstract class Instrument {

    private String type;
    private String material;
    private String colour;
    private int stock;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String type, String material, String colour, int stock, double buyPrice, double sellPrice) {
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.stock = stock;
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

    public int getStock() {
        return stock;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
