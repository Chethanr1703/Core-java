package com.xworkz.nurseapp;

import com.xworkz.nurseapp.nurse.Nurse;
import com.xworkz.nurseapp.nurse.impl.NurseImpl;

public class NurseRunner {
    public static void main(String[] args) {
        Nurse nurse = new NurseImpl();
        nurse.assistDoctor();
        nurse.giveInjection();
    }
}
