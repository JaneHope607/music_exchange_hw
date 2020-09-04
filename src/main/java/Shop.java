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

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public double getTill() {
        return this.till;
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public double calculateProfit() {
        double totalProfit = 0;
        for (ISell item : this.stock) {
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }
}