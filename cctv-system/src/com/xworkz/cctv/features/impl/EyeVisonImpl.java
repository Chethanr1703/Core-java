package com.xworkz.cctv.features.impl;

import com.xworkz.cctv.features.Cctv;

public class EyeVisonImpl  implements Cctv {

    @Override
    public void startRecording() {
        System.out.println("recording started");
    }

    @Override
    public void stopRecording() {
        System.out.println("recording stopped");

    }

    @Override
    public void enableMotionDetection() {
        System.out.println("motion detection enabled");

    }
}
