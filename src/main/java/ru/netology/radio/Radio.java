package ru.netology.radio;

import java.security.PublicKey;

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentRadioStation = minRadioStation;
    private int currentVolume = minVolume;

    public Radio () {
        this.minRadioStation = getMinRadioStation();
        this.maxRadioStation = getMaxRadioStation();

    }

    public Radio (int quantity) {
        maxRadioStation = minRadioStation + quantity - 1;
    }


    public int getCurrentRadioStation () {
        return currentRadioStation;
    }
    public int getMinRadioStation() {
        return minRadioStation;
    }
    public int getMaxRadioStation() {
        return maxRadioStation;
    }


    public void setCurrentRadioStation(int NewCurrentRadioStation) {
        if (NewCurrentRadioStation < minRadioStation) {
            return;
        }
        if (NewCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = NewCurrentRadioStation;
    }

    public void setCurrentRadioStationOnNumber (int numberRadioStation) {
        currentRadioStation = numberRadioStation;
    }

    public void increaseRadioStationOnNumber () {
        if (currentRadioStation <= maxRadioStation) {
            currentRadioStation = currentRadioStation;

        }
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
    }

    public void increaseNextRadioStation() {
        if (currentRadioStation < maxRadioStation && currentRadioStation >= minRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        }
        else {
            currentRadioStation = minRadioStation;
        }


    }

    public void increasePrevRadioStation() {

        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        else {
            currentRadioStation = currentRadioStation -1;
        }



    }


    public int getCurrentVolume () {
        return currentVolume;
    }
    public void setCurrentVolume (int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolumeMore () {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < maxVolume && currentVolume >= minVolume) {
            currentVolume = currentVolume +1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = 0;
        }
    }

    public void increaseVolumeLess () {
        if (currentVolume <= maxVolume && currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
    }

}