package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.patientvalidator.PatientValidator;

public class Hospital {

    Patient patientDetails;

    public boolean isAddPatientToHospital(Patient patientDetails){
        boolean isPatientAdded=false;

        PatientValidator patientValidator=new PatientValidator();

       boolean isValidated = patientValidator.isPatientDetailsValid(patientDetails);

       if(isValidated==true){
           this.patientDetails=patientDetails;
           isPatientAdded=true;
           System.out.println("all fields are valid");

       }else {
           System.out.println("the fields are  not valid");
       }
        return  isPatientAdded;
    }
    public void getPatientInfo(){
        System.out.println("the id of the patient is  "+patientDetails.getPatientId());
        System.out.println("the name of the patient is  "+patientDetails.getPatientName());
        System.out.println("the number of the patient is  "+patientDetails.getPhoneNumber());
        System.out.println("the desease name of the patient is  "+patientDetails.getDiseaseName());
        System.out.println("the treated by  of the patient is  "+patientDetails.getTreatedBy());

    }
}
