package com.xworkz.lightapp.switchs.impl;

import com.xworkz.lightapp.switchs.Switches;

public class HalogenImpl implements Switches {
    @Override
    public void on() {
        System.out.println("Halogen light is turned on");
    }

    @Override
    public void off() {
        System.out.println("Halogen light is turned off");
    }
}
