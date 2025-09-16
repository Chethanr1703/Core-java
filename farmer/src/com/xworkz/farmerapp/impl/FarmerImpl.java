package com.xworkz.farmerapp.impl;

import com.xworkz.farmerapp.farmer.Farmer;

public class FarmerImpl implements Farmer {
    @Override
    public void selectField() {
        System.out.println("select field");
    }

    @Override
    public void sowSeeds() {
        System.out.println("sow seeds");
    }

    @Override
    public void harvestCrop() {
        System.out.println("harvest crop");
    }
}
