package com.xworkz.perfumeapp;

import com.xworkz.perfumeapp.fragranceemitter.FragranceEmitter;
import com.xworkz.perfumeapp.fragranceemitter.impl.FogPerfume;

public class PerfumeRunner {
    public static void main(String[] args) {
        FragranceEmitter fragranceEmitter = new FogPerfume();
        fragranceEmitter.spray();
        fragranceEmitter.refill();
        fragranceEmitter.checkFragrance();
    }
}
