package ru.netology.Radio;

public class Radio {
    public int currentStation;
    public int maxStation = 9;
    public int minStation = 0;
    public int currentVolume;
    public int maxVolume = 10;
    public int minVolume = 0;


    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation() {
        currentStation = 9;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation() {
        currentStation = 0;
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

    public void setMaxVolume() {
        currentVolume = 10;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume() {
        currentVolume = 0;
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