package ru.netology.radioman.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void shouldSetZeroStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBorderStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextStationBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextStation();

        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setPreviousStationOverMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevStation();

        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setPreviousStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void sholdSetVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(8);

        int expected = 8;
        int actual = volume.getSoundVolume();
    }

    @Test
    public void sholdSetVolumeOverMax() {
        Radio volume = new Radio();
        volume.setSoundVolume(101);

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setSoundVolume(-1);

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {
        Radio volume = new Radio();
        volume.setSoundVolume(100);

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(0);

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(9);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeOverMax() {
        Radio volume = new Radio();
        volume.setSoundVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeFromZero() {
        Radio volume = new Radio();
        volume.setSoundVolume(0);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolume() {
        Radio volume = new Radio();
        volume.setSoundVolume(4);

        volume.decreaseVolume();

        int expected = 3;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolumeFromZero() {
        Radio volume = new Radio();
        volume.setSoundVolume(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolumeFromMax() {
        Radio volume = new Radio();
        volume.setSoundVolume(100);

        volume.decreaseVolume();

        int expected = 99;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}