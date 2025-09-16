package com.xworkz.lightapp.switchs.impl;

import com.xworkz.lightapp.switchs.Switches;

public class LEDImpl implements Switches {

    @Override
    public void on() {
        System.out.println("Led is turned on");
    }

    @Override
    public void off() {
        System.out.println("Led is turned off");
    }
}
