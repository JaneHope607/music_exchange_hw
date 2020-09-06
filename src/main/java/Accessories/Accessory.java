package Accessories;

import behaviours.ISell;
import instruments.InstrumentType;

public class Accessory implements ISell {

    String description;
    private double buyPrice;
    private double sellPrice;
    private InstrumentType type;

    public Accessory(String description, double buyPrice, double sellPrice, InstrumentType type) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public InstrumentType getType() {
        return type;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
