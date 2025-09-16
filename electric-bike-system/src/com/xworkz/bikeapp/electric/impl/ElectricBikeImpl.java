package com.xworkz.bikeapp.electric.impl;

import com.xworkz.bikeapp.electric.ElectricBike;

public class ElectricBikeImpl implements ElectricBike {
    @Override
    public void startRide() {
        System.out.println("Electric bike ride started");
    }

    @Override
    public void stopRide() {
        System.out.println("Electric bike ride stopped");
    }

    @Override
    public void applyBrake() {
        System.out.println("Brake applied on electric bike");
    }
}
