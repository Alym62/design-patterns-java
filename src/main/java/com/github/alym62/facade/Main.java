package com.github.alym62.facade;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Send send = new Send();
        Stock stock = new Stock();

        EcommerceFacade facade = new EcommerceFacade(stock, payment, send);
        facade.processOrder(UUID.randomUUID().toString(), UUID.randomUUID().toString());
    }
}
