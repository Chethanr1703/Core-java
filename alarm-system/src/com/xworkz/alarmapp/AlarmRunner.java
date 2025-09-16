package com.xworkz.alarmapp;

import com.xworkz.alarmapp.alarm.Alarm;
import com.xworkz.alarmapp.alarm.impl.Clockimpl;

public class AlarmRunner {
    public static void main(String[] args) {
        Alarm alarm = new Clockimpl();
        alarm.setTime();
        alarm.stop();
        alarm.trigger();
    }
}
