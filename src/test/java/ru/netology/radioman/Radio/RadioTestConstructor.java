package ru.netology.radioman.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTestConstructor {

    @Test
    public void shouldSetMyCountStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);

        int expected = 15;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBorderMyCountStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(19);

        int expected = 19;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroMyCountStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(19);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setPreviousStation() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(24);

        radio.prevStation();

        int expected = 23;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }
}