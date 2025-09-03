package com.xworkz.apollotech;

import com.xworkz.apollotech.hospital.Hospital;
import com.xworkz.apollotech.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1,"baba","mumbai",75,'M',"cold");
        Patient patient2 = new Patient(2,"ali  baba","goa",57,'M',"fever");
        Patient patient3 = new Patient(3,"guru baba","bangalore",55,'M',"cold and fever");

        Hospital hospital = new Hospital();
        hospital.isPatientAdded(patient1);


        hospital.isPatientAdded(patient2);
        hospital.isPatientAdded(patient3);


        hospital.displayInfo();




    }
}
