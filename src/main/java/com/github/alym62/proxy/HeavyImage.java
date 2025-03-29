package com.github.alym62.proxy;

public class HeavyImage implements Image {
    private String file;

    public HeavyImage(String file) {
        this.file = file;
        this.loadDisc();
    }

    private void loadDisc() {
        System.out.println("Carregando... " + file);
    }

    @Override
    public void show() {
        System.out.println("Exibindo >>> " + file);
    }
}
