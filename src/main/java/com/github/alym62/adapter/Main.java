package com.github.alym62.adapter;

public class Main {
    public static void main(String[] args) {
        Paypal paypal = new Paypal();
        PaymentGateway paymentGateway = new PaypalAdapter(paypal);

        // Paypal
        paymentGateway.pay(3590);

        Stripe stripe = new Stripe();
        paymentGateway = new StripeAdapter(stripe);

        // Stripe
        paymentGateway.pay(2980);
    }
}
