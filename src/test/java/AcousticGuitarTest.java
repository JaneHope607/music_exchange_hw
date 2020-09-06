import instruments.AcousticGuitar;
import instruments.ElectricGuitar;
import instruments.GuitarType;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcousticGuitarTest {

    AcousticGuitar acousticGuitar;

    @Before
    public void before() {
        acousticGuitar = new AcousticGuitar(InstrumentType.STRINGS, "Wood", "Blue", 100.00, 150.00, GuitarType.ACOUSTIC);
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.STRINGS, acousticGuitar.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", acousticGuitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Blue", acousticGuitar.getColour());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(100.00, acousticGuitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(150.00, acousticGuitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetGuitarType() {
        assertEquals(GuitarType.ACOUSTIC, acousticGuitar.getGuitarType());
    }

    @Test
    public void canPlay() {
        assertEquals("Rocky band music", acousticGuitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50.00, acousticGuitar.calculateMarkup(), 0.01);
    }
}
