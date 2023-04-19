package ru.netology.javaqa.javamvnencapsulation.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void getRadioChannel() {
        Radio radio = new Radio();
        radio.currentRadioStation = 5;
        int expected = 5;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationLowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationLowMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentRadioStationUpMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationUpMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseChannel() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        int expected = 8;
        int actual = radio.increaseChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseChannelMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 0;
        int actual = radio.increaseChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseChannel() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        int expected = 6;
        int actual = radio.decreaseChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseChannelMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 9;
        int actual = radio.decreaseChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 56;
        int expected = 57;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        int expected = 100;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 53;
        int expected = 52;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}


