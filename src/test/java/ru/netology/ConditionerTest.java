package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {
    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());

    }
    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals( 19, conditioner.getCurrentTemperature());
    }
}