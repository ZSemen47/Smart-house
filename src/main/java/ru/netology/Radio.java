package ru.netology;

public class Radio {
    private int currentStationNumber;
    private int maxCurrentStation;
    private int minCurrentStation;
    private int soundVolume;
    private int maxSoundVolume;
    private int minSoundVolume;

    public Radio(int currentStationNumber, int maxCurrentStation, int minCurrentStation, int soundVolume, int maxSoundVolume, int minSoundVolume) {
        this.currentStationNumber = currentStationNumber;
        this.maxCurrentStation = maxCurrentStation;
        this.minCurrentStation = minCurrentStation;
        this.soundVolume = soundVolume;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
    }

    // Methods for radioStation
    public int nextStation() {
        if (currentStationNumber == maxCurrentStation) {
            currentStationNumber = minCurrentStation;
            return currentStationNumber;
        }
        return this.currentStationNumber++;
    }

    public int prevStation() {
        if (currentStationNumber == minCurrentStation) {
            currentStationNumber = maxCurrentStation;
            return currentStationNumber;
        }
        return this.currentStationNumber--;
    }


    // Methods for Volume
    public void increaseSoundVolume() {
        if (soundVolume == maxSoundVolume) {
            return;
        }
        this.soundVolume++;
    }

    public void decreaseSoundVolume() {
        if (soundVolume == minSoundVolume) {
            return;
        }
        this.soundVolume--;
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
