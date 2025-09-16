package com.xworkz.cameraapp.camera.cameraImpl;

import com.xworkz.cameraapp.camera.Camera;

public class SonyCamera implements Camera {
    @Override
    public void capturePhote() {
        System.out.println("taking photo");
    }

    @Override
    public void videoShoot() {
        System.out.println("taking video");
    }
}
