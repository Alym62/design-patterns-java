package com.github.alym62.adapter;

public class PaypalAdapter implements PaymentGateway {
    private Paypal paypal;

    public PaypalAdapter(Paypal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(double amount) {
        paypal.sendPayment(amount);
        System.out.println("Pagando com paypal >>> R$ " + amount);
    }
}
