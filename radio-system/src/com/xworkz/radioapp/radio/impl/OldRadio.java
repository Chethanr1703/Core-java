package com.xworkz.radioapp.radio.impl;

import com.xworkz.radioapp.radio.Radio;

public class OldRadio implements Radio {
    @Override
    public void increaseVolume() {
        System.out.println("increaseing volume");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("decreaseing volume");
    }
}
