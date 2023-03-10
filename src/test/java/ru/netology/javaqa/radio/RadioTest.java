package ru.netology.javaqa.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberRadioStation() { // выбор текущей радиостанции
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberRadioStation() { // выбор максимальной радиостанции
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumberRadioStation() { // выбор минимальной радиостанции
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMaxNumberRadioStation() { // выбор радиостанции выше максимума
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessMinNumberRadioStation() { // выбор радиостанции меньше минимума
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() { // переключение радиостанции press "next"
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);
        radio.nextRadioStation();

        int expected = 6;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationAfter9() { // переключение радиостанции press "next" on 9 station
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() { // переключение радиостанции press "prev"
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);
        radio.previousRadioStation();

        int expected = 4;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationAt0() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);
        radio.previousRadioStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundLevel() { // Проверка текущего уровня звука
        Radio vol = new Radio();
        vol.setSoundVolume(25);

        int actual = 25;
        int expected = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetSoundAboveTheLevel() {  // Проверка уровня звука выше предела
        Radio vol = new Radio();
        vol.setSoundVolume(101);

        int actual = 0;
        int expected = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundBelowTheLevel() { // Проверка уровня звука ниже предела
        Radio vol = new Radio();
        vol.setSoundVolume(-1);


        int expected = 0;
        int actual = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxSoundLevel() { // Проверка максимальной громкости
        Radio vol = new Radio();
        vol.setSoundVolume(100);

        int expected = 100;
        int actual = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinSoundLevel() { // Проверка минимальной громкости
        Radio vol = new Radio();
        vol.setSoundVolume(0);

        int expected = 0;
        int actual = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUp() { // Проверка увеличения громкости звука
        Radio vol = new Radio();
        vol.setSoundVolume(60);
        vol.increaseVolume();

        int expected = 61;
        int actual = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDown() { // Проверка уменьшения громкости звука
        Radio vol = new Radio();
        vol.setSoundVolume(80);
        vol.reduceVolume();

        int expected = 79;
        int actual = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() { // Проверка увеличения громкости звука выше максимума
        Radio vol = new Radio();
        vol.setSoundVolume(101);

        int expected = 0;
        int actual = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLessMin() {
        Radio vol = new Radio();
        vol.setSoundVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDownWithMin() { // Проверка уменьшения громкости звука при минимальном значении
        Radio vol = new Radio();
        vol.setSoundVolume(0);
        vol.reduceVolume();

        int expected = 0;
        int actual = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUpWithMax() { // Проверка увеличения громкости звука при максимальном значении
        Radio vol = new Radio();
        vol.setSoundVolume(100);
        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}