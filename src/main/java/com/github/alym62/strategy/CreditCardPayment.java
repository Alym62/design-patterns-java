package com.github.alym62.strategy;

import java.time.LocalDateTime;

public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private Integer cardNumber;
    private Integer cvv;
    private LocalDateTime dateOfExpires;

    public CreditCardPayment(String name, Integer cardNumber, Integer cvv, LocalDateTime dateOfExpires) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpires = dateOfExpires;
    }

    @Override
    public void pay(double amount) {
        if (this.dateOfExpires.isBefore(LocalDateTime.now())) throw new RuntimeException("Ops! Credit card is expired");
        System.out.println("Pay with credit card >>> 💳 $ " + amount);
    }
}
