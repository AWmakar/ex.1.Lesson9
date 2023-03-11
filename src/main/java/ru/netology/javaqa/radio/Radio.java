package ru.netology.javaqa.radio;
public class Radio {
    private int radioStationNumber; // номер текткущей радиостанции
    private int soundVolume; // громкость звука

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void nextRadioStation() {
        int next = radioStationNumber + 1;
        if (next > 9) {
            radioStationNumber = 0;
        } else {
            next = radioStationNumber + 1;
        }

        setRadioStationNumber(next);
    }

    public void previousRadioStation() {
        int prev = radioStationNumber - 1;
        if (prev < 0) {
            radioStationNumber = 9;
        } else {
            prev = radioStationNumber - 1;
        }
        setRadioStationNumber(prev);
    }

    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {

        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void reduceVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }
}