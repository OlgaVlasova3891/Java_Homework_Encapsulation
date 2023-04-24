package ru.netology.javaqa.javamvnencapsulation.service;

public class Radio {
    private int currentRadioStation; // Создали поле, в котором будет храниться информация о радиоканалах
    private int currentVolume; // Создали поле, в котором будет храниться информация о звуке
    private int radioStationsQuantity = 10;

    public Radio() {
    }

    public Radio(int radioStationsQuantity) {
        this.radioStationsQuantity = radioStationsQuantity;
    }

    public int getRadioStationsQuantity() {
        return radioStationsQuantity;
    }


    public void setRadioStationsQuantity(int newRadioStationsQuantity) {
        if (newRadioStationsQuantity < 10) {
            return;
        }
        if (newRadioStationsQuantity > 10) {
            return;
        }
        radioStationsQuantity = newRadioStationsQuantity;
    }

        public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int increaseChannel() {

        if (currentRadioStation < 9) {
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
            currentRadioStation = 9;
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











