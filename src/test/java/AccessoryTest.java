import Accessories.Accessory;
import instruments.AcousticGuitar;
import instruments.GuitarType;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before() {
        accessory = new Accessory("Guitar Strings", 6.00, 10.00, InstrumentType.STRINGS);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Guitar Strings", accessory.getDescription());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(6.00, accessory.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(10.00, accessory.getSellPrice(), 0.01);
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.STRINGS, accessory.getType());
    }
}
