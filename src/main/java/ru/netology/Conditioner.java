package ru.netology;

public class Conditioner {
    private String name;
    private int currentTemperature;
    private int maxTemperature;
    private int minTemperature;

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            currentTemperature = maxTemperature;
            return currentTemperature;
        }
        return this.currentTemperature++;
    }

    public int decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            currentTemperature = minTemperature;
            return currentTemperature;
        }
        return this.currentTemperature--;
    }
}