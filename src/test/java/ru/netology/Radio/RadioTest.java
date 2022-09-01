package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetMaxStation() {
        Radio station = new Radio();

        station.setMaxStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio station = new Radio();

        station.setMinStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchOverLastStation() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.pressNextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchOverFirstStation() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.pressPrevStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchOverTheLimitStation() {
        Radio station = new Radio();

        station.setCurrentStation(10);
        station.getMaxStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchUnderTheLimitStation() {
        Radio station = new Radio();

        station.setCurrentStation(-1);
        station.getMinStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio station = new Radio();

        station.setCurrentStation(8);
        station.pressNextStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStation() {
        Radio station = new Radio();

        station.setCurrentStation(4);
        station.pressPrevStation();

        int expected = 3;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio vol = new Radio();

        vol.setMaxVolume();

        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio vol = new Radio();

        vol.setMinVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseOverMaxVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(11);
        vol.getMaxVolume();

        int expected = 10;
        int actual = vol.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDicreaseUnderMinVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(-1);
        vol.getMinVolume();

        int expected = 0;
        int actual = vol.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToLouderVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(6);
        vol.increaseVolume();

        int expected = 7;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchToLouderVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(10);
        vol.increaseVolume();

        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToQuietlyVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(4);
        vol.dicreaseVolume();

        int expected = 3;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchToQuietlyVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(0);
        vol.dicreaseVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
