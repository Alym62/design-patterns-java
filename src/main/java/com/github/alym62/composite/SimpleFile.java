package com.github.alym62.composite;

public class SimpleFile implements File {
    private String name;

    public SimpleFile(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Arquivo simples: " + name);
    }
}
