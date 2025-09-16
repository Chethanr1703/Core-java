package com.xworkz.fitnessapp.recorder.impl;

import com.xworkz.fitnessapp.recorder.Recorder;

public class FitnessBand implements Recorder {
    @Override
    public void recordWorkout() {
        System.out.println("record work out");
    }

    @Override
    public void measureCalories() {
        System.out.println("measure calories");
    }

    @Override
    public void trackSleepPattern() {
        System.out.println(" track sleep");
    }
}
