package com.xworkz.medicalapp.medical.impl;

import com.xworkz.medicalapp.medical.Medical;

public class MedicalImpl implements Medical {

    @Override
    public void getMedicine() {
        System.out.println("got the medicine");
    }

    @Override
    public void bill() {
        System.out.println("bill created");
    }
}
