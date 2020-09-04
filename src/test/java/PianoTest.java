import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Keyboard", "Wood", "Black", 700.00, 1200.00, "electric");
    }

    @Test
    public void canGetType() {
        assertEquals("Keyboard", piano.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(700.00, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(1200.00, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canGetGuitarType() {
        assertEquals("electric", piano.getPianoType());
    }

    @Test
    public void canPlay() {
        assertEquals("Keys keys plonk", piano.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(500.00, piano.calculateMarkup(), 0.01);
    }
}
