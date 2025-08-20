package com.xworkz.kcet.applicationvalidator;

import com.xworkz.kcet.cetapplication.CetApplication;

public class CetApplicationValidator {
    CetApplication cetApplication;

    public boolean cetApplicationValidator(CetApplication cetApplication){
        boolean isApplicationValidated=false;
        boolean isFirstnameValidated=false;
        boolean isLastNameValidated= false;
        boolean isDobValid =false;
        boolean isEmailValid =false;
        boolean isGenderValid=false;
        boolean isAgeValid =false;
        boolean isPhoneNumberValid= false;

        if (cetApplication.getFirstName()!=null){
            isFirstnameValidated=true;
        }
        else{
            System.out.println("the first name is not valid ");
        }
        if(cetApplication.getLastName()!=null){
            isLastNameValidated=true;
        }
        else{
            System.out.println("the last name is not valid ");
        }
        if(cetApplication.getDob()!=null){
            isDobValid=true;
        }
        else{
            System.out.println("the  dob is not valid ");
        }
        if(cetApplication.getEmail()!=null){
            isEmailValid=true;
        }
        else{
            System.out.println("the email is not valid ");
        }
        if(cetApplication.getGender()!=' '){
            isGenderValid=true;
        }
        else{
            System.out.println("the gender is not valid ");
        }
        if(cetApplication.getAge()!=0){
            isAgeValid=true;
        }
        else{
            System.out.println("the age is not valid ");
        }
        if(cetApplication.getPhoneNumber()!=0){
            isPhoneNumberValid=true;
        }
        else{
            System.out.println("the phone number is not valid ");
        }
        if(isFirstnameValidated&&isLastNameValidated&&isDobValid&&isEmailValid&&isGenderValid&&isAgeValid&&isPhoneNumberValid){
            this.cetApplication=cetApplication;
            isApplicationValidated=true;
        }else{
            System.out.println("cet application is not done");
        }
        return isApplicationValidated;
    }
    public void displayDetails(){
        System.out.println("the first name of the user is  "+cetApplication.getFirstName());
        System.out.println("the last name of the user is  "+cetApplication.getLastName());
        System.out.println("the dob of the user is  "+cetApplication.getDob());
        System.out.println("the email of the user is  "+cetApplication.getEmail());
        System.out.println("the gender of the user is  "+cetApplication.getGender());
        System.out.println("the age of the user is  "+cetApplication.getAge());
        System.out.println("the Phone number of the user is  "+cetApplication.getPhoneNumber());
    }

}
