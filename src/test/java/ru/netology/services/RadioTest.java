package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public  void shouldSetStationHighLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldSetStationLowLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFromNineToZeroIfNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFromZeroToNineIfPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }














    @Test
    public  void shouldSetVolumeLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldNotIncreaseVolumeAboveHighLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldSetHigherVolumeLevel() {
        Radio radio = new Radio();

        radio.setCurrentVolume(70);
        radio.increaseVolume();

        int expected = 71;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldNotDecreaseVolumeUnderLowLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void shouldSetLowerVolumeLevel() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public  void shouldNotDecreaseVolumeUnderZero() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(0);
//        radio.decreaseVolume();
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }

}
