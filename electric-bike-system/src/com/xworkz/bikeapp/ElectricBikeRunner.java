package com.xworkz.bikeapp;

import com.xworkz.bikeapp.electric.ElectricBike;
import com.xworkz.bikeapp.electric.impl.ElectricBikeImpl;

public class ElectricBikeRunner {
    public static void main(String[] args) {
        ElectricBike bike = new ElectricBikeImpl();
        bike.startRide();
        bike.applyBrake();
        bike.stopRide();
    }

}
