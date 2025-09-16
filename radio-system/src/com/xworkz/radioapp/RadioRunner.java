package com.xworkz.radioapp;

import com.xworkz.radioapp.radio.Radio;
import com.xworkz.radioapp.radio.impl.OldRadio;

public class RadioRunner {
    public static void main(String[] args) {
        Radio radio = new OldRadio();
        radio.increaseVolume();
        radio.decreaseVolume();
    }
}
