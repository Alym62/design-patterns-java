package com.github.alym62.facade;

public class EcommerceFacade {
    private final Stock stock;
    private final Payment payment;
    private final Send send;

    public EcommerceFacade(Stock stock, Payment payment, Send send) {
        this.stock = stock;
        this.payment = payment;
        this.send = send;
    }

    public void processOrder(String productId, String userId) {
        if (this.stock.check(productId) && this.payment.process(userId))
            send.sendProduct(productId, userId);
        else
            System.out.println("Ops! Não foi possível enviar o produto: " + productId);
    }
}
