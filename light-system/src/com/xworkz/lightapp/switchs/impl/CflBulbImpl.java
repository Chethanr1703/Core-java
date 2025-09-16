package com.xworkz.lightapp.switchs.impl;

import com.xworkz.lightapp.switchs.Switches;

public class CflBulbImpl implements Switches {
    @Override
    public void on() {
        System.out.println("cpl bulb is turned onn ....");
    }

    @Override
    public void off() {
        System.out.println("cpl bulb is turned off ....");


    }
}
