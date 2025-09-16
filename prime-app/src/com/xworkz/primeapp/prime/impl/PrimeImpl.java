package com.xworkz.primeapp.prime.impl;

import com.xworkz.primeapp.prime.Prime;

public class PrimeImpl implements Prime     {
    @Override
    public void playVideo() {
        System.out.println(" Video is now playing");
    }

    @Override
    public void pauseVideo() {
        System.out.println(" Video has been paused");
    }

    @Override
    public void setQuality() {
        System.out.println("Video quality set to HD");
    }
}
