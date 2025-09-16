package com.xworkz.alarmapp.alarm.impl;

import com.xworkz.alarmapp.alarm.Alarm;

public class Clockimpl implements Alarm {
    @Override
    public void setTime() {
        System.out.println("set time");
    }

    @Override
    public void trigger() {
        System.out.println("set triggrer");
    }

    @Override
    public void stop() {
        System.out.println("stop alarm");
    }
}
