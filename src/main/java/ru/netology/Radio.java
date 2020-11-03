package ru.netology;

public class Radio {
    private int currentStationNumber = 10;
    private int maxCurrentStation = 10;
    private int minCurrentStation = 0;
    private int soundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    // Methods for radioStation
    public int nextStation() {
        if (currentStationNumber == maxCurrentStation) {
            currentStationNumber = minCurrentStation;
            return currentStationNumber;
            }
        return this.currentStationNumber ++;
    }
    public int prevStation() {
        if (currentStationNumber == minCurrentStation) {
            currentStationNumber = maxCurrentStation;
            return currentStationNumber;
            }
        return this.currentStationNumber --;
    }

    public int switchStation() {
        return currentStationNumber;
    }


    // Methods for Volume
    public void increaseSoundVolume() {
        if (soundVolume == maxSoundVolume) {
            return;
        }
        this.soundVolume ++;
    }
    public void decreaseSoundVolume() {
        if (soundVolume == minSoundVolume) {
            return;
        }
        this.soundVolume --;
    }

    // Getters + Setters
    public int getMinSoundVolume() {
        return minSoundVolume;
    }
    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }
    public int getMinCurrentStation() {
        return minCurrentStation;
    }
    public int getMaxCurrentStation() {
        return maxCurrentStation;
    }
    public int getCurrentStationNumber() {
        return currentStationNumber;
    }
    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

}
