package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.setMaxCurrentStation(9);
        radio.setMinCurrentStation(1);
        radio.nextStation();
        assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    public void nextStationMoreLimit() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        radio.setMaxCurrentStation(9);
        radio.setMinCurrentStation(1);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStationNumber());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(6);
        radio.setMaxCurrentStation(9);
        radio.setMinCurrentStation(1);
        radio.prevStation();
        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    public void prevStationLessLimit() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.setMaxCurrentStation(9);
        radio.setMinCurrentStation(1);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void increaseSound() {
        Radio radio = new Radio();
        radio.setSoundVolume(5);
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.increaseSoundVolume();
        assertEquals(6, radio.getSoundVolume());
    }

    @Test
    public void increaseSoundMoreLimit() {
        Radio radio = new Radio();
        radio.setSoundVolume(10);
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.increaseSoundVolume();
        assertEquals(10, radio.getSoundVolume());
    }

    @Test
    public void decreaseSound() {
        Radio radio = new Radio();
        radio.setSoundVolume(5);
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.decreaseSoundVolume();
        assertEquals(4, radio.getSoundVolume());
    }

    @Test
    public void decreaseSoundLessLimit() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.decreaseSoundVolume();
        assertEquals(0, radio.getSoundVolume());
    }
}
