package com.example;

import java.util.ArrayList;
import java.util.List;

public class CustomerBill {
    private final List<Integer> drinks = new ArrayList<>();
    private BillingStrategy strategy;

    public CustomerBill(BillingStrategy strategy) {
        this.setStrategy(strategy);
    }

    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(int price, int quantity) {
        this.drinks.add(this.strategy.getActPrice(price * quantity));
    }

    public int getBill() {
        int sum = this.drinks.stream().reduce(0, Integer::sum);
        this.drinks.clear();
        return sum;
    }
}
