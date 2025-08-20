package com.xworkz.hospitalapp.patientvalidator;

import com.xworkz.hospitalapp.patient.Patient;

public class PatientValidator {
    public boolean isPatientDetailsValid(Patient patientDetails){
        boolean isDeatilsValid=false;

        boolean isIdValid=false;
        boolean isNameValid=false;
        boolean isPhoneNumberValid=false;
        boolean istreatedByValid=false;
        boolean isDeseaseNameValid=false;


        if (patientDetails.getPatientId() > 0) {
            isIdValid=true;
        }else{
            System.out.println("the given id is not valid");
        }
        if(patientDetails.getPatientName()!=null && !patientDetails.getPatientName().isEmpty()){
            isNameValid=true;
        }
        else{
            System.out.println("the given Name is not valid");
        }
        if(patientDetails.getPhoneNumber()>0){
            isPhoneNumberValid=true;
        }
        else{
            System.out.println("the given phone number is not valid");
        }
        if(patientDetails.getTreatedBy()!=null &&!patientDetails.getTreatedBy().isEmpty()){
            istreatedByValid=true;
        }else{
            System.out.println("the given treated by name  is not valid");
        }
        if(patientDetails.getDiseaseName()!=null && !patientDetails.getDiseaseName().isEmpty()){
            isDeseaseNameValid=true;
        }else{
            System.out.println("the given Disease Name is not valid");
        }
        if(isIdValid&&isNameValid&&isPhoneNumberValid&&istreatedByValid&&isDeseaseNameValid){
            isDeatilsValid=true;
        }else{
            System.out.println("the given  details is not valid");
        }

return isDeatilsValid;
    }
}
