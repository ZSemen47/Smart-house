package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldInitFields() {
        assertEquals(10, radio.getCurrentStationNumber());
        assertEquals(10, radio.getMaxCurrentStation());
        assertEquals(0, radio.getMinCurrentStation());
        assertEquals(100, radio.getMaxSoundVolume());
        assertEquals(0, radio.getMinSoundVolume());
    }

    @Test
    public void nextStation() {
        radio.setCurrentStationNumber(9);
        radio.nextStation();
        assertEquals(10, radio.getCurrentStationNumber());
    }

    @Test
    public void nextStationMoreLimit() {
        radio.setCurrentStationNumber(10);;
        radio.nextStation();
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void prevStation() {
        radio.setCurrentStationNumber(6);
        radio.prevStation();
        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    public void prevStationLessLimit() {
        radio.setCurrentStationNumber(0);
        radio.prevStation();
        assertEquals(10, radio.getCurrentStationNumber());
    }

    @Test
    public void switchStation() {
        radio.setCurrentStationNumber(5);
        radio.switchStation();
        assertEquals(5, radio.getCurrentStationNumber());
    }



    @Test
    public void increaseSound() {
        radio.setSoundVolume(99);
        radio.increaseSoundVolume();
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    public void increaseSoundMoreLimit() {
        radio.setSoundVolume(100);
        radio.increaseSoundVolume();
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    public void decreaseSound() {
        radio.setSoundVolume(1);
        radio.decreaseSoundVolume();
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void decreaseSoundLessLimit() {
        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();
        assertEquals(0, radio.getSoundVolume());
    }
}
