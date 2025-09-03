package com.xworkz.apollotech.hospital;

import com.xworkz.apollotech.patient.Patient;


public class Hospital {
    Patient []patients =new Patient[3];
    int index;

    public boolean isPatientAdded(Patient patient){
        boolean isAdded =false;
        if(patient!=null){
            patients[index]=patient;
            index++;
            isAdded=true;
        }else {
            System.out.println("invalid patient");
        }
        return isAdded;
    }

    public void displayInfo() {
        for (Patient patient : patients) {
            System.out.println("the id of the patient " + patient.getPatientId());
            System.out.println("the name of the patient "+patient.getPatientName());
            System.out.println("the address of the patient "+patient.getAddress());
            System.out.println("the age of the patient "+patient.getAge());
            System.out.println("the gender of the patient  "+patient.getGender());
            System.out.println("the disease name of the patient "+patient.getDiseaseName());
            System.out.println("");
        }
    }

}
