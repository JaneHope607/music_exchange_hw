import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;

    @Before
    public void before() {
        shop = new Shop(250.00);
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
}
