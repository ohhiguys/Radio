package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio station = new Radio(10, 0, 4, 100, 0, 4);

    @Test
    public void check() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        Assertions.assertEquals(4, station.getCurrentStation());
    }

    @Test
    public void shouldSwitchNextStation() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        station.pressNextStation();

        Assertions.assertEquals(5, station.getCurrentStation());
    }

    @Test
    public void shouldSwitchPreviousStation() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        station.pressPrevStation();

        Assertions.assertEquals(3, station.getCurrentStation());
    }

    @Test
    public void shouldSetLastStation() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        Assertions.assertEquals(10, station.getMaxStation());
    }

    @Test
    public void shouldSetFirstStation() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        Assertions.assertEquals(0, station.getMinStation());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio station = new Radio(10, 0, 4, 100, 0, 4);

        Assertions.assertEquals(100, station.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
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
