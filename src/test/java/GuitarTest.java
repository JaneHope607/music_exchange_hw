import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentType.STRINGS, "Wood", "Red", 100.00, 150.00, "acoustic");
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.STRINGS, guitar.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(100.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(150.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetGuitarType() {
        assertEquals("acoustic", guitar.getGuitarType());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum strum", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50.00, guitar.calculateMarkup(), 0.01);
    }
}
