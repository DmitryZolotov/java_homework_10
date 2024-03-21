package ru.netology.services;

public class Radio {

    private int countStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int count) {
        countStation = minStation + count;
        maxStation = countStation - 1;
        minStation = 0;
    }

    public Radio() {
        countStation = 10;
    }

    public int getCountStation() {
        return countStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            setCurrentStation(minStation);
            return;
        }
        if (newCurrentStation < minStation) {
            setCurrentStation(maxStation);
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            setCurrentVolume(minVolume);
            return;
        }
        if (newCurrentVolume > maxVolume) {
            setCurrentVolume(maxVolume);
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        int nextStation = currentStation + 1;
        if (nextStation < maxStation) {
            setCurrentStation(nextStation);
        }
        if (nextStation > maxStation) {
            setCurrentStation(minStation);
        }
        return;
    }

    public void prev() {
        int prevStation = currentStation - 1;
        if (prevStation > minStation) {
            setCurrentStation(prevStation);
        }
        if (prevStation < minStation) {
            setCurrentStation(maxStation);
        }
        return;
    }

    public void increaseVolume() {
        int nextVolume = currentVolume + 1;
        if (currentVolume == maxVolume) {
            setCurrentVolume(maxVolume);
        }
        if (currentVolume < maxVolume) {
            setCurrentVolume(nextVolume);
        }
        return;
    }

    public void decreaseVolume() {
        int prevVolume = currentVolume - 1;
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
        }
        if (currentVolume > minVolume) {
            setCurrentVolume(prevVolume);
        }
        return;
    }

}
