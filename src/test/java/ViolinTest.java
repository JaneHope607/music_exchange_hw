import instruments.InstrumentType;
import instruments.Trumpet;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin(InstrumentType.STRINGS, "Wood", "Brown", 780.00, 1180.00, "Fiddle");
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.STRINGS, violin.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", violin.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown", violin.getColour());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(780.00, violin.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(1180.00, violin.getSellPrice(), 0.01);
    }

    @Test
    public void canGetTrumpetType() {
        assertEquals("Fiddle", violin.getViolinType());
    }

    @Test
    public void canPlay() {
        assertEquals("This is a violin song", violin.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(400.00, violin.calculateMarkup(), 0.01);
    }
}
