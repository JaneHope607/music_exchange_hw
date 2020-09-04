import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before() {
        shop = new Shop(250.00);
    }

    @Test
    public void canGetStockCount() {
        assertEquals(0, shop.getStockCount());
    }
}
