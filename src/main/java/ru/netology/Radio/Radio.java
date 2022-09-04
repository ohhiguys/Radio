package ru.netology.Radio;

public class Radio {
    public int maxStation = 9;
    public int minStation = 0;
    public int currentStation;
    public int maxVolume = 10;
    public int minVolume = 0;
    public int currentVolume;

    public Radio (int maxStation,
                  int minStation,
                  int currentStation,
                  int maxVolume,
                  int minVolume,
                  int currentVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public Radio() {

    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void pressNextStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }
    public void pressPrevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        }
        else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume +1;
        }
    }

    public void dicreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}