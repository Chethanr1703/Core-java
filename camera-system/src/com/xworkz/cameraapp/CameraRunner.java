package com.xworkz.cameraapp;

import com.xworkz.cameraapp.camera.Camera;
import com.xworkz.cameraapp.camera.cameraImpl.SonyCamera;

public class CameraRunner {
    public static void main(String[] args) {
        System.out.println("main started");


        Camera camera = new SonyCamera();
        camera.capturePhote();
        camera.videoShoot();


        System.out.println("main ended");
    }
}
