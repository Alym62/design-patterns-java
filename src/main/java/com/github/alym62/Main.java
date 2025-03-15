package com.github.alym62;

import com.github.alym62.singleton.DatabaseConnection;
import com.github.alym62.strategy.CreditCardPayment;
import com.github.alym62.strategy.Item;
import com.github.alym62.strategy.PaypalPayment;
import com.github.alym62.strategy.ShoppingCart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        // Executando strategy
        executeStrategy();

        // Executando singleton
        executeSingleton();
    }

    private static void executeStrategy() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item = new Item(255.98);
        shoppingCart.addItems(item);

        shoppingCart.setPaymentStrategy(new PaypalPayment("email@email.com"));
        shoppingCart.checkout();

        shoppingCart.setPaymentStrategy(new CreditCardPayment("Aly", 123456, 123,
                LocalDateTime.of(LocalDate.of(2030, Month.APRIL, 20), LocalTime.now())));
        shoppingCart.checkout();
    }

    private static void executeSingleton() {
        int numberOfThreads = 3;
        CountDownLatch readyLatch = new CountDownLatch(numberOfThreads);
        CountDownLatch startLatch = new CountDownLatch(1);

        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(() -> {
                readyLatch.countDown();
                try {
                    startLatch.await();
                    DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
                    System.out.println("Instance: >>> " + databaseConnection.hashCode());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
    }
}