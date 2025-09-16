package com.xworkz.cctv;

import com.xworkz.cctv.features.Cctv;
import com.xworkz.cctv.features.impl.EyeVisonImpl;

public class CctvRunner {
    public static void main(String[] args) {
        Cctv eyeVision = new EyeVisonImpl();
        eyeVision.startRecording();
        eyeVision.enableMotionDetection();
        eyeVision.stopRecording();
    }
}
