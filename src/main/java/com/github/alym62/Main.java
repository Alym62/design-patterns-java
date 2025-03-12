package com.github.alym62;

import com.github.alym62.strategy.CreditCardPayment;
import com.github.alym62.strategy.Item;
import com.github.alym62.strategy.PaypalPayment;
import com.github.alym62.strategy.ShoppingCart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item = new Item(255.98);
        shoppingCart.addItems(item);

        shoppingCart.setPaymentStrategy(new PaypalPayment("email@email.com"));
        shoppingCart.checkout();

        shoppingCart.setPaymentStrategy(new CreditCardPayment("Aly", 123456, 123,
                LocalDateTime.of(LocalDate.of(2030, Month.APRIL, 20), LocalTime.now())));
        shoppingCart.checkout();
    }
}