package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStationStation(int NewCurrentRadioStation) {
        if (NewCurrentRadioStation < 0) {
            return;
        }
        if (NewCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = NewCurrentRadioStation;
    }

    public void setCurrentRadioStationOnNumber(int numberRadioStation) {
        currentRadioStation = numberRadioStation;

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

    public void setCurrentVolume(int NewCurrentVolume) {
        if (NewCurrentVolume < 0) {
            return;
        }
        if (NewCurrentVolume > 10) {
            return;
        }
        currentVolume = NewCurrentVolume;
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