package com.github.alym62.prototype;

public class GameSettings implements Cloneable {
    private int brightness;
    private int volume;
    private String difficulty;

    public GameSettings(int brightness, int volume, String difficulty) {
        this.brightness = brightness;
        this.volume = volume;
        this.difficulty = difficulty;
    }

    @Override
    protected GameSettings clone() {
        try {
            return (GameSettings) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
