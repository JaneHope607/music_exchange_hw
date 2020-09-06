import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Violin violin;
    Trumpet trumpet;

    @Before
    public void before() {
        shop = new Shop(250.00);
        piano = new Piano(InstrumentType.KEYBOARD, "Wood", "Black", 700.00, 1200.00, "electric");
        guitar = new Guitar(InstrumentType.STRINGS, "Wood", "Red", 100.00, 150.00, "acoustic");
        trumpet = new Trumpet(InstrumentType.BRASS, "Wood", "Brown", 550.00, 1000.00, 3, "Piccolo");
        violin = new Violin(InstrumentType.STRINGS, "Wood", "Brown", 780.00, 1180.00, "Fiddle");
    }

    @Test
    public void canGetStockCount() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canGetTill() {
        assertEquals(250.00, shop.getTill(), 0.01);
    }

    @Test
    public void canAddItem() {
        shop.addItem(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveItem() {
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculateProfit() {
        shop.addItem(guitar);
        shop.addItem(piano);
        shop.addItem(violin);
        shop.addItem(trumpet);
        assertEquals(1400.00, shop.calculateProfit(), 0.01);
    }
}
