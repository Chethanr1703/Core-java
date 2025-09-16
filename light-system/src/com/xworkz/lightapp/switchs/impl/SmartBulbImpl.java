package com.xworkz.lightapp.switchs.impl;

import com.xworkz.lightapp.switchs.Switches;

public class SmartBulbImpl implements Switches {
    @Override
    public void on() {
        System.out.println("Smart Bulbs light is turned on");
    }

    @Override
    public void off() {
        System.out.println("Smart Bulbs light is turned on");

    }
}
