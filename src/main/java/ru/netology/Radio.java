package ru.netology;

public class Radio {
    String name;
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        //int maxStation = getMaxStation();
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
            return;
        }
        setCurrentStation(currentStation + 1);
    }

    public void prev() {
        //int minStation = getMinStation();
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
            return;
        }
        setCurrentStation(currentStation - 1);
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {
        setCurrentVolume(currentVolume + 1);
    }

    public void volumeDown() {
        setCurrentVolume(currentVolume - 1);
    }
}


