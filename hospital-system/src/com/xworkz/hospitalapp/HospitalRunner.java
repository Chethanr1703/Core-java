package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {

        Patient firstPatient =new Patient();
        firstPatient.setPatientId(101);
        firstPatient.setPatientName("baba");
        firstPatient.setPhoneNumber(7896524123l);
        firstPatient.setTreatedBy("Madan balal");
        firstPatient.setDiseaseName("Fever");

        Hospital hospital =new Hospital();
        boolean isAdded=hospital.isAddPatientToHospital(firstPatient);
        if(isAdded==true){
            hospital.getPatientInfo();
        }else {
            System.out.println("patient info is not valid");
        }

        Patient secondPatient =new Patient();
        secondPatient.setPatientId(102);
        secondPatient.setPatientName("bala");
        secondPatient.setPhoneNumber(7896524123l);
        secondPatient.setTreatedBy("Dr Nachikethan ");
        secondPatient.setDiseaseName("Fever");

         hospital =new Hospital();
         isAdded=hospital.isAddPatientToHospital(secondPatient);
        if(isAdded==true){
            hospital.getPatientInfo();
        }else {
            System.out.println("patient info is not valid");
        }

    }
}
