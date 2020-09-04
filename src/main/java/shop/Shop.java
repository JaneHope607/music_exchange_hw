package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private double till;

    public Shop(ArrayList<ISell> stock, double till) {
        this.stock = stock;
        this.till = till;
    }
}
