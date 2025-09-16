package com.xworkz.tvapp.tv.impl;

import com.xworkz.tvapp.tv.Tv;

public class SmartTvimpl implements Tv {
    @Override
    public void turnOn() {
        System.out.println("Smart TV is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is now OFF.");
    }

    @Override
    public void changeChannel() {
        System.out.println("Smart TV channel is changed");
    }
}
