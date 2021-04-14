package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(43);

    @Test
    public void shouldSetMaxStation() {
        assertEquals(43, radio.getMaxStation());
    }

    @Test
    public void shouldUseDefaultMaxStation() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxStation());
    }
    @Test
    public void nextTest() {
        radio.setCurrentStation(radio.getMaxStation());
        radio.next();
        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    public void nextGoesOverMaxTest() {
        radio.setCurrentStation(radio.getMinStation());
        radio.next();
        assertEquals(radio.getMinStation() + 1, radio.getCurrentStation());
    }

    @Test
    public void prevTest() {
        radio.setCurrentStation(radio.getMaxStation());
        radio.prev();
        assertEquals(radio.getMaxStation() - 1, radio.getCurrentStation());

    }

    @Test
    public void prevGoesOverMinTest() {
        radio.setCurrentStation(radio.getMinStation());
        radio.prev();
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationTest() {
        int newStation = 42;
        radio.setCurrentStation(newStation);
        assertEquals(newStation, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationDoesNotSetAboveMaxTest() {
        int newStation = radio.getMaxStation() + 1;
        radio.setCurrentStation(newStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationDoesNotSetBelowMinTest() {
        int newStation = radio.getMinStation() - 1;
        radio.setCurrentStation(newStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void volumeUpTest() {
        radio.setCurrentVolume(4);
        radio.volumeUp();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void volumeUpDoesNotGoAboveMaxTest() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.volumeUp();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    public void volumeDownTest() {
        radio.setCurrentVolume(1);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeDownDoesNotGoBelowMinTest() {
        radio.setCurrentVolume(radio.getMinVolume());
        radio.volumeDown();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTest() {
        int newVolume = 90;
        radio.setCurrentVolume(newVolume);
        assertEquals(newVolume, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDoesNotSetAboveMaxTest() {
        radio.setCurrentVolume(radio.getMaxVolume());
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDoesNotSetBelowMinTest() {
        radio.setCurrentVolume(radio.getMinVolume());
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

}