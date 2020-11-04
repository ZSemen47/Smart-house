package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Conditioner {
    private String name;
    private int currentTemperature;
    private int maxTemperature;
    private int minTemperature;


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