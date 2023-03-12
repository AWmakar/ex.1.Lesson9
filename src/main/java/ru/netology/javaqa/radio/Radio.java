package ru.netology.javaqa.radio;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;

    private int radioStationNumber = minRadioStation;
    private int soundVolume = minSoundVolume;

    public Radio(int quantity) {
        maxRadioStation = minRadioStation + quantity - 1;
    }

    public Radio() {

    }

    public int getMaxRadioStation() {

        return maxRadioStation;
    }

    public int getMinRadioStation() {

        return minRadioStation;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStation) {
            return;
        }
        if (newRadioStationNumber > maxRadioStation) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void nextRadioStation() {
        int next = radioStationNumber + 1;
        if (next > maxRadioStation) {
            radioStationNumber = minRadioStation;
        } else {
            next = radioStationNumber + 1;
        }

        setRadioStationNumber(next);
    }

    public void previousRadioStation() {
        int prev = radioStationNumber - 1;
        if (prev < minRadioStation) {
            radioStationNumber = maxRadioStation;
        } else {
            prev = radioStationNumber - 1;
        }
        setRadioStationNumber(prev);
    }

    public int getSoundVolume() {
        return soundVolume;
    }


    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minRadioStation) {
            return;
        }
        if (newSoundVolume > maxSoundVolume) {

            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {

        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void reduceVolume() {
        if (soundVolume > minSoundVolume) {
            soundVolume = soundVolume - 1;
        }
    }

}