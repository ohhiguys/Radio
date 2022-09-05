package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void userRadio() {
        Radio user = new Radio(156);

        Assertions.assertEquals(156, user.getAmountStations());
    }

    @Test
    public void shouldGetMaxStation() {
        Radio station = new Radio();

        Assertions.assertEquals(10, station.getMaxStation());
    }

    @Test
    public void shouldGetMinStation() {
        Radio station = new Radio();

        Assertions.assertEquals(0, station.getMinStation());
    }

    @Test
    public void shouldSwitchNextStation() {
        Radio station = new Radio();

        station.setCurrentStation(4);
        station.pressNextStation();

        Assertions.assertEquals(5, station.getCurrentStation());
    }

    @Test
    public void shouldNotSwitchOverNextStation() {
        Radio station = new Radio();

        station.setCurrentStation(10);
        station.pressNextStation();

        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldSwitchUnderPreviousStation() {
        Radio station = new Radio();

        station.setCurrentStation(7);
        station.pressPrevStation();

        Assertions.assertEquals(6, station.getCurrentStation());
    }

    @Test
    public void shouldNotSwitchPreviousStation() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.pressPrevStation();

        Assertions.assertEquals(10, station.getCurrentStation());
    }

    @Test
    public void shouldGetLastStation() {
        Radio station = new Radio();

        Assertions.assertEquals(10, station.getMaxStation());
    }

    @Test
    public void shouldGetFirstStation() {
        Radio station = new Radio();

        Assertions.assertEquals(0, station.getMinStation());
    }

    @Test
    public void shouldGetMaxVolume() {
        Radio station = new Radio();

        Assertions.assertEquals(100, station.getMaxVolume());
    }

    @Test
    public void shouldGetMinVolume() {
        Radio station = new Radio();

        Assertions.assertEquals(0, station.getMinVolume());
    }

    @Test
    public void shouldSwitchLouderVolume() {
        Radio station = new Radio();

        station.setCurrentVolume(4);
        station.increaseVolume();

        Assertions.assertEquals(5, station.getCurrentVolume());
    }

    @Test
    public void shouldNotSwitchOverMaxVolume() {
        Radio station = new Radio();

        station.setCurrentVolume(100);
        station.increaseVolume();

        Assertions.assertEquals(100, station.getCurrentVolume());
    }

    @Test
    public void shouldSwitchQuietlyVolume() {
        Radio station = new Radio();

        station.setCurrentVolume(4);
        station.dicreaseVolume();

        Assertions.assertEquals(3, station.getCurrentVolume());
    }

    @Test
    public void shouldNotSwitchUnderMinVolume() {
        Radio station = new Radio();

        station.setCurrentVolume(0);
        station.dicreaseVolume();

        Assertions.assertEquals(0, station.getCurrentVolume());
    }
}
