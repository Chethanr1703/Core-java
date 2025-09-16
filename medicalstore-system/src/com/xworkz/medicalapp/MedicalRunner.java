package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medical.Medical;
import com.xworkz.medicalapp.medical.impl.MedicalImpl;

public class MedicalRunner {
    public static void main(String[] args) {
        Medical medical = new MedicalImpl();
        medical.getMedicine();
        medical.bill();
    }
}
