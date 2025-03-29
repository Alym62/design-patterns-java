package com.github.alym62.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.show();
        image.show();
        image.show();
        image.show();
        image.show();
    }
}
