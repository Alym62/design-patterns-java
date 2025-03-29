package com.github.alym62.adapter;

public class StripeAdapter implements PaymentGateway {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void pay(double amount) {
        this.stripe.makePayment(amount);
        System.out.println("Pagando com stripe >>> R$ " + amount);
    }
}
