package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

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



    public void increaseRadioStationOnNumber() {
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation;

        }
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
    }

    public void increaseNextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
            return;
        }
        currentRadioStation = 0;

    }

    public void increasePrevRadioStation() {

        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolumeMore() {
        if (currentVolume >= 10) {
            currentVolume = 10;
        } else {
            currentVolume = currentVolume + 1;
        }
        ;
    }

    public void increaseVolumeLess() {
        if (currentVolume < 10 && currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }

}