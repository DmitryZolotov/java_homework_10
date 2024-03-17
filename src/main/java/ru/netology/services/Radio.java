package ru.netology.services;

public class Radio {

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation = 0;
            return;
        }
        if (newCurrentStation > 9) {
            currentStation = 9;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation >= 9) {
            currentStation = 0;
            return;
        }
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }



    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            currentVolume = 100;
            return;
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
            return;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
