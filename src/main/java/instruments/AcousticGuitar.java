package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class AcousticGuitar extends Instrument implements IPlay, ISell {

    private GuitarType guitarType;

    public AcousticGuitar(InstrumentType type, String material, String colour, double buyPrice, double sellPrice, GuitarType guitarType) {
        super(type, material, colour, buyPrice, sellPrice);
        this.guitarType = guitarType;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public String play() {
        return "Rocky band music";
    }
}
