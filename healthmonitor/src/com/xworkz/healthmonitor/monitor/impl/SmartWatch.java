package com.xworkz.healthmonitor.monitor.impl;

import com.xworkz.healthmonitor.monitor.HealthMonitor;

public class SmartWatch implements HealthMonitor {
    @Override
    public void trackHeartRate() {
        System.out.println("track Heart Rate");
    }

    @Override
    public void monitorSleep() {
        System.out.println("monitor Sleep");

    }

    @Override
    public void countSteps() {
        System.out.println("count steps");
    }
}
