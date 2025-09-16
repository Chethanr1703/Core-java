package com.xworkz.fitnessapp;

import com.xworkz.fitnessapp.recorder.Recorder;
import com.xworkz.fitnessapp.recorder.impl.FitnessBand;

public class RecorderRunner {
    public static void main(String[] args) {
        Recorder recorder = new FitnessBand();
        recorder .recordWorkout();
        recorder.measureCalories();
        recorder.trackSleepPattern();
    }
}
