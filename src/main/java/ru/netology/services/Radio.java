package ru.netology.services;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            setCurrentStation(0);
            return;
        }
        if (newCurrentStation > 9) {
            setCurrentStation(9);
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            setCurrentVolume(0);
            return;
        }
        if (newCurrentVolume > 100) {
            setCurrentVolume(100);
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        int nextStation = currentStation +1;
        if (nextStation < 9) {
            setCurrentStation(nextStation);
        }
        if (nextStation > 9) {
            setCurrentStation(0);
        }
        return;
    }

    public void prev() {
        int prevStation = currentStation - 1;
        if (currentStation > 0) {
            setCurrentStation(prevStation);
        }
        if (prevStation < 0) {
            setCurrentStation(9);
        }
        return;
    }

    public void increaseVolume() {
        int nextVolume = currentVolume + 1;
        if (currentVolume == 100) {
            setCurrentVolume(100);
        }
        if (currentVolume < 100) {
            setCurrentVolume(nextVolume);
        }
        return;
    }

    public void decreaseVolume() {
        int prevVolume = currentVolume - 1;
        if (currentVolume <= 0) {
            setCurrentVolume(0);
        }
        if (currentVolume > 0) {
            setCurrentVolume(prevVolume);
        }
        return;
    }

}
