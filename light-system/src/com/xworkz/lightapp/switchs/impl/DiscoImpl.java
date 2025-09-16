package com.xworkz.lightapp.switchs.impl;

import com.xworkz.lightapp.switchs.Switches;

public class DiscoImpl implements Switches {
    @Override
    public void on() {
        System.out.println("Disco light is turned on");
    }

    @Override
    public void off() {
        System.out.println("Disco light is turned off");

    }
}
