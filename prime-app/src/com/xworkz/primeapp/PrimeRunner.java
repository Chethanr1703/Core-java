package com.xworkz.primeapp;

import com.xworkz.primeapp.prime.Prime;
import com.xworkz.primeapp.prime.impl.PrimeImpl;

public class PrimeRunner {
    public static void main(String[] args) {
        Prime primeVideo = new PrimeImpl();
        primeVideo.playVideo();
        primeVideo.pauseVideo();
        primeVideo.setQuality();
    }
}
