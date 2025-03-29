package com.github.alym62.proxy;

public class ProxyImage implements Image {
    private HeavyImage heavyImage;
    private String file;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void show() {
        if (heavyImage == null) {
            this.heavyImage = new HeavyImage(file);
        }

        this.heavyImage.show();
    }
}
