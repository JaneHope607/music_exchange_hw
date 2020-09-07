import instruments.ElectricGuitar;
import instruments.GuitarType;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    ElectricGuitar electricGuitar;

    @Before
    public void before() {
        electricGuitar = new ElectricGuitar(InstrumentType.STRINGS, "Wood", "Red", 375.00, 675.00, GuitarType.ELECTRIC);
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.STRINGS, electricGuitar.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", electricGuitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", electricGuitar.getColour());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(375.00, electricGuitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(675.00, electricGuitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetGuitarType() {
        assertEquals(GuitarType.ELECTRIC, electricGuitar.getGuitarType());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum strum", electricGuitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(300.00, electricGuitar.calculateMarkup(), 0.01);
    }
}
