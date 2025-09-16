package com.xworkz.healthmonitor;

import com.xworkz.healthmonitor.monitor.HealthMonitor;
import com.xworkz.healthmonitor.monitor.impl.SmartWatch;

public class HealthRunner {
    public static void main(String[] args) {
        HealthMonitor healthMonitor= new SmartWatch();
        healthMonitor.monitorSleep();
        healthMonitor.countSteps();
        healthMonitor.trackHeartRate();
    }
}
