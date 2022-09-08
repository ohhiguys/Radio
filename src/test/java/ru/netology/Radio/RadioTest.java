package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testUserRadio() {
        Radio user = new Radio(20);

        user.setCurrentStation(15);

        Assertions.assertEquals(15, user.getCurrentStation());
    }

    @Test
    public void nextUserStation() {
        Radio user = new Radio(35);

        user.setCurrentStation(28);
        user.pressNextStation();

        Assertions.assertEquals(29, user.getCurrentStation());
    }

    @Test
    public void prevUserStation() {
        Radio user = new Radio(40);

        user.setCurrentStation(18);
        user.pressPrevStation();

        Assertions.assertEquals(17, user.getCurrentStation());
    }

    @Test
    public void shouldGetMaxStation() {
        Radio station = new Radio();

        Assertions.assertEquals(9, station.getMaxStation());
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

        Assertions.assertEquals(1, station.getCurrentStation());
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

        Assertions.assertEquals(9, station.getCurrentStation());
    }

    @Test
    public void shouldGetLastStation() {
        Radio station = new Radio();

        Assertions.assertEquals(9, station.getMaxStation());
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
