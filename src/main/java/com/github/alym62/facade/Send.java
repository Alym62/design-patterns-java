package com.github.alym62.facade;

public class Send {
    public void sendProduct(String productId, String userId) {
        System.out.println("Produto: " + productId + " enviado para o usuário - " + userId);
    }
}
