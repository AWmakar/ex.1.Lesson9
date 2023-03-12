package ru.netology.javaqa.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
// import org.junit.jupiter.params.provider.CsvSource;

import java.util.Locale;

public class RadioTest {


    @Test // тест на конструктор принимающий желаемое количество радиостанций
    public void testSound() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(29, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(0, radio.getRadioStationNumber());
    }

    @ParameterizedTest // Тест текущей радиостанции
    @CsvFileSource(files = "src/test/resources/CurrentNumberStation.csv")

    public void shouldSetCurrentNumberRadioStation(int expected, int i) {
        Radio radio = new Radio();
        radio.setRadioStationNumber(i);
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // тест на переключение радиостанции вперед
    @CsvFileSource(files = "src/test/resources/nextRadio.csv")
    public void shouldSetNextRadioStation(int expected, int i) {
        Radio radio = new Radio();
        radio.setRadioStationNumber(i);
        radio.nextRadioStation();
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest  // тест на переключение предыдущей радиостанции
    @CsvFileSource(files = "src/test/resources/prevRadio.csv")
    public void shouldSetPrevRadioStation(int expected, int i) {
        Radio radio = new Radio();
        radio.setRadioStationNumber(i);
        radio.previousRadioStation();
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // тест текущей громкости
    @CsvFileSource(files = "src/test/resources/currentVolume.csv")
    public void shouldSetCurrentVolume(int expected, int i) {
        Radio vol = new Radio();
        vol.setSoundVolume(i);

        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // тест увеличесния громкости
    @CsvFileSource(files = "src/test/resources/soundUp.csv")
    public void soundUp(int expected, int i) {
        Radio vol = new Radio();
        vol.setSoundVolume(i);
        vol.increaseVolume();
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // тест уменьшения громкости
    @CsvFileSource(files = "src/test/resources/soundDown.csv")
    public void soundDown(int expected, int i) {
        Radio vol = new Radio();
        vol.setSoundVolume(i);
        vol.reduceVolume();
        int actual = vol.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


}