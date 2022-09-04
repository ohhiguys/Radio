package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10, 0, 4, 100, 0, 4);

    @Test
    public void test() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        Assertions.assertEquals(4, station.getCurrentStation());
    }

    @Test
    public void userRadio() {
        Radio user = new Radio(56);

        Assertions.assertEquals(56, user.getAmountStations());
    }

    @Test
    public void shouldSwitchNextStation() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        station.pressNextStation();

        Assertions.assertEquals(5, station.getCurrentStation());
    }

    @Test
    public void shouldNotSwitchOverNextStation() {
        Radio station = new Radio(10, 0, 11, 100, 0, 4);

        station.pressNextStation();

        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void shouldSwitchUnderPreviousStation() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        station.pressPrevStation();

        Assertions.assertEquals(3, station.getCurrentStation());
    }

    @Test
    public void shouldNotSwitchPreviousStation() {
        Radio station = new Radio(10, 0, 0, 100, 0, 4);

        station.pressPrevStation();

        Assertions.assertEquals(10, station.getCurrentStation());
    }

    @Test
    public void shouldGetLastStation() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        Assertions.assertEquals(10, station.getMaxStation());
    }

    @Test
    public void shouldGetFirstStation() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        Assertions.assertEquals(0, station.getMinStation());
    }

    @Test
    public void shouldGetMaxVolume() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        Assertions.assertEquals(100, station.getMaxVolume());
    }

    @Test
    public void shouldGetMinVolume() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        Assertions.assertEquals(0, station.getMinVolume());
    }

    @Test
    public void shouldSwitchLouderVolume() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        station.increaseVolume();

        Assertions.assertEquals(5, station.getCurrentVolume());
    }

    @Test
    public void shouldSwitchQuietlyVolume() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        station.dicreaseVolume();

        Assertions.assertEquals(3, station.getCurrentVolume());
    }
}
