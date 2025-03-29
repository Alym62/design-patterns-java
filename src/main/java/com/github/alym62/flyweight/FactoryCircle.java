package com.github.alym62.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryCircle {
    private Map<String, Circle> circleMap = new HashMap<>();

    public Circle getCircle(String color) {
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Criando círculo com a cor: " + color);
        }

        return circle;
    }
}
