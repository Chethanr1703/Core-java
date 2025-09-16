package com.xworkz.nurseapp.nurse.impl;

import com.xworkz.nurseapp.nurse.Nurse;

public class NurseImpl implements Nurse {

    @Override
    public void assistDoctor() {
        System.out.println("Nurse is assisting the doctor");
    }

    @Override
    public void giveInjection() {
        System.out.println("Nurse gave an injection");
    }
}
