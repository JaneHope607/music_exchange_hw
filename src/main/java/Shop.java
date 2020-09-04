import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private double till;

    public Shop(double till) {
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void canAddItem(ISell item) {
        this.stock.add(item);
    }
}