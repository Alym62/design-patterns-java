package com.github.alym62.flyweight;

public class Circle {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw(int x, int y, int raid) {
        System.out.println("Desenhando um círculo de cor " + color + " em (" + x + "," + y + ") com raio " + raid);
    }
}
