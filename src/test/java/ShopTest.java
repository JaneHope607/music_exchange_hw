import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ElectricGuitar electricGuitar;
    Piano piano;
    Violin violin;
    Trumpet trumpet;

    @Before
    public void before() {
        shop = new Shop(250.00);
        piano = new Piano(InstrumentType.KEYBOARD, "Wood", "Black", 700.00, 1200.00, "electric");
        electricGuitar = new ElectricGuitar(InstrumentType.STRINGS, "Wood", "Red", 375.00, 675.00, GuitarType.ELECTRIC);
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
        shop.addItem(electricGuitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveItem() {
        shop.addItem(electricGuitar);
        shop.removeItem(electricGuitar);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculateProfit() {
        shop.addItem(electricGuitar);
        shop.addItem(piano);
        shop.addItem(violin);
        shop.addItem(trumpet);
        assertEquals(1650.00, shop.calculateProfit(), 0.01);
    }
}
