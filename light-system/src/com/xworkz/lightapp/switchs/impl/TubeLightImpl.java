package com.xworkz.lightapp.switchs.impl;

import com.xworkz.lightapp.switchs.Switches;

public class TubeLightImpl implements Switches {
    @Override
    public void on() {
        System.out.println("tube light is turned on");
    }

    @Override
    public void off() {
        System.out.println("tube light is turned off");

    }
}
