package com.github.alym62.prototype;

public class Main {
    public static void main(String[] args) {
        GameSettings prototypeSettings = new GameSettings(50, 90, "Normal");
        System.out.println(prototypeSettings.hashCode());

        GameSettings playerSettings = prototypeSettings.clone();
        System.out.println(playerSettings.hashCode());

        playerSettings.setDifficulty("Fácil");

        System.out.println("Player settings difficulty: " + playerSettings.getDifficulty());
        System.out.println("Player settings volume: " + playerSettings.getVolume());
    }
}
