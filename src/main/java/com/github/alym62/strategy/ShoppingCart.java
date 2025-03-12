package com.github.alym62.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItems(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    private double calculateTotalItems() {
        return items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public void checkout() {
        double total = calculateTotalItems();
        if (total > 0) paymentStrategy.pay(total);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
