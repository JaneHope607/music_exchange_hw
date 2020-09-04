package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private String guitarType;

    public Guitar(String type, String material, String colour, double buyPrice, double sellPrice, String guitarType) {
        super(type, material, colour, buyPrice, sellPrice);
        this.guitarType = guitarType;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public String play() {
        return "Strum strum";
    }
}
