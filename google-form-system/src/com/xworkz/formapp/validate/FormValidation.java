package com.xworkz.formapp.validate;

import com.xworkz.formapp.form.FormRegister;

public class FormValidation {
    FormRegister formRegister;
    public boolean isFormValid(FormRegister formRegister){

        boolean isFormValid= false;
        boolean isGivenNameValid=false;
        boolean isSurNameValid =false;
        boolean isDobValid= false;
        boolean isPhoneNumberValid= false;
        boolean isGenderValid= false;
        boolean isAgeValid=false;
        boolean isQualificationValid=false;

        if(formRegister.getGivenName()!=null){
            isGivenNameValid=true;
        }else{
            System.out.println("Given Name is not valid");
        }

        if(formRegister.getSurName()!=null){
            isSurNameValid=true;
        }else{
            System.out.println("Sur Name is not valid");
        }
        if(formRegister.getDob()!=null){
            isDobValid=true;
        }else{
            System.out.println("Given DOB is not valid");
        }
        if (formRegister.getPhoneNumber()!=0){
            isPhoneNumberValid=true;
        }else{
            System.out.println("Given Phone number is not valid");
        }
        if(formRegister.getGender()!=null){
            isGenderValid=true;
        }else{
            System.out.println("Given gender is not valid");
        }
        if(formRegister.getAge()!=0){
            isAgeValid=true;
        }else{
            System.out.println("Given Age is not valid");
        }
        if(formRegister.getQualification()!=null){
            isQualificationValid=true;
        }else{
            System.out.println("Given Qualification is not valid");
        }
        if(isGivenNameValid&&isSurNameValid&&isDobValid&&isPhoneNumberValid&&isGenderValid&&isAgeValid&&isQualificationValid){
           this.formRegister=formRegister;
            isFormValid=true;
        }
        else{
            System.out.println("Given Form is not valid");
        }
        return isFormValid;
    }
}
