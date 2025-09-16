package com.xworkz.farmerapp;

import com.xworkz.farmerapp.farmer.Farmer;
import com.xworkz.farmerapp.impl.FarmerImpl;

public class FarmerRunner {

    public static void main(String[] args) {
        Farmer farmer = new FarmerImpl();
        farmer.selectField();
        farmer.sowSeeds();
        farmer.harvestCrop();
    }
}
