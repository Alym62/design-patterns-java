package com.github.alym62.builder;

public class Main {
    public static void main(String[] args) {
        Product product = new Product.Builder()
                .name("Iphone")
                .price(3590.95)
                .category("Telefone")
                .quantityStock(100)
                .build();

        System.out.println(product);
    }
}
