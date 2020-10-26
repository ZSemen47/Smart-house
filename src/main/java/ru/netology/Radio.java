package ru.netology;

public class Radio {
    private int currentStationNumber;
    private int maxCurrentStation;
    private int minCurrentStation;
    private int soundVolume;
    private int maxSoundVolume;
    private int minSoundVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }
    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
    }

    public void setMaxCurrentStation(int maxCurrentStation) {
        this.maxCurrentStation = maxCurrentStation;
    }

    public void setMinCurrentStation(int minCurrentStation) {
        this.minCurrentStation = minCurrentStation;
    }

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

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

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
}
