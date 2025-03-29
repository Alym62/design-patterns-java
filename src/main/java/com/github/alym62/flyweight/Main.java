package com.github.alym62.flyweight;

public class Main {
    private final static String[] colors = {"Red", "Blue", "Green", "Black"};
    public static void main(String[] args) {
        FactoryCircle factory = new FactoryCircle();

        for (int i = 0; i < 20; i++) {
            Circle circle = factory.getCircle(getColorRandom());
            circle.draw(getXRandom(), getYRandom(), getRaidRandom());
        }
    }

    private static String getColorRandom() {
        return colors[(int)(Math.random()* colors.length)];
    }

    private static int getXRandom() {
        return (int)(Math.random()*100);
    }

    private static int getYRandom() {
        return (int)(Math.random()*100);
    }

    private static int getRaidRandom() {
        return (int)(Math.random()*100);
    }
}
