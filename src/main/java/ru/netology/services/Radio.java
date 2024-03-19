package ru.netology.services;

public class Radio {

    private int countStation = 20;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;


    public Radio(int countStation) {
        this.countStation = countStation;
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

    ///////////////////////////////////////////////////////////////////////////////////////////////

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            currentStation = minStation;
            return;
        }
        if (newCurrentStation > maxStation) {
            currentStation = maxStation;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if ((currentStation + 1) < maxStation) {
            currentStation = currentStation + 1;
        }
        if ((currentStation + 1) > maxStation) {
            currentStation = minStation;
        }
        return;
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        if ((currentStation - 1) < minStation) {
            currentStation = maxStation;
        }
        return;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

}
