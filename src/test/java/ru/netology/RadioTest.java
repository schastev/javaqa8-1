package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.next();
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    public void nextGoesOverMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation());
        radio.next();
        assertEquals(radio.getMinStation() + 1, radio.getCurrentStation());
    }

    @Test
    public void prevTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.prev();
        assertEquals(radio.getMaxStation() - 1, radio.getCurrentStation());

    }

    @Test
    public void prevGoesOverMinTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinStation());
        radio.prev();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationTest() {
        Radio radio = new Radio();
        int newStation = 4;
        radio.setCurrentStation(newStation);
        assertEquals(newStation, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationDoesNotSetAboveMaxTest() {
        Radio radio = new Radio();
        int newStation = radio.getMaxStation() + 1;
        radio.setCurrentStation(newStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationDoesNotSetBelowMinTest() {
        Radio radio = new Radio();
        int newStation = radio.getMinStation() - 1;
        radio.setCurrentStation(newStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void volumeUpTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.volumeUp();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void volumeUpDoesNotGoAboveMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.volumeUp();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    public void volumeDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeDownDoesNotGoBelowMinTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        radio.volumeDown();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTest() {
        Radio radio = new Radio();
        int newVolume = 4;
        radio.setCurrentVolume(newVolume);
        assertEquals(newVolume, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDoesNotSetAboveMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDoesNotSetBelowMinTest() {
        Radio radio = new Radio();
        int newVolume = radio.getMinVolume();
        radio.setCurrentVolume(radio.getMinVolume());
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

}