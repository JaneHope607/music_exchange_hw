import instruments.InstrumentType;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(InstrumentType.BRASS, "Wood", "Brown", 550.00, 1000.00, 3, "Piccolo");
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", trumpet.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown", trumpet.getColour());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(550.00, trumpet.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(1000.00, trumpet.getSellPrice(), 0.01);
    }

    @Test
    public void canGetTrumpetType() {
        assertEquals("Piccolo", trumpet.getTrumpetType());
    }

    @Test
    public void canGetNumofValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Toot toot toot", trumpet.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(450.00, trumpet.calculateMarkup(), 0.01);
    }
}
