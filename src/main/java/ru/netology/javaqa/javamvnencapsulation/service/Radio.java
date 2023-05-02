package ru.netology.javaqa.javamvnencapsulation.service;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;

    public Radio() {

        maxRadioStation = 9;
    }

    public Radio(int maxRadioStation) {

        this.maxRadioStation = maxRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int increaseChannel() {

        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }

    public int decreaseChannel() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;

        } else {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int decreaseVolume() {

        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }
}











