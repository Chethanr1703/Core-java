package com.xworkz.googleapp.validate;

import com.xworkz.googleapp.gmail.Gmail;

public class GmailValidator {
    Gmail gmail;
    public boolean isGmailValidated(Gmail gmail){

        boolean isGmailValid= false;
        boolean isFirstNameValid=false;
        boolean isLastNameValid=false;
        boolean isDobValid=false;
        boolean isGenderValid = false;
        boolean isPasswordValid= false;
        boolean isConfirmPasswordValid= false;
        boolean isbothPasswordValid=false;

        if(gmail.getFirstName()!=null){
            isFirstNameValid=true;
        }
        else{
            System.out.println("the first Name is not valid");
        }
        if(gmail.getLastName()!=null){
            isLastNameValid=true;
        }
        else{
            System.out.println("the last Name is not valid");
        }
        if(gmail.getDob()!=null){
            isDobValid=true;
        }
        else{
            System.out.println("the DOB is not valid");
        }
        if(gmail.getGender()!=' '){
            isGenderValid=true;
        }
        else{
            System.out.println("the gender is not valid");
        }
        if(gmail.getPassword()!=null){
            isPasswordValid=true;
        }
        else{
            System.out.println("the password is not valid");
        }
        if(gmail.getConfirmPassword()!=null){
            isConfirmPasswordValid=true;
        }
        else{
            System.out.println("the Confirm Password is not valid");
        }
        if (gmail.getPassword()==gmail.getConfirmPassword()){
            System.out.println("password and confirm password is matched");
            isbothPasswordValid=true;
        }
        else{
            System.out.println("both password is not matched");
        }
        if(isFirstNameValid&&isLastNameValid&&isDobValid&&isGenderValid&&isPasswordValid&&isConfirmPasswordValid&&isbothPasswordValid){
            this.gmail=gmail;
            isGmailValid=true;
        }else{
            System.out.println("the gamil is not valid ");
        }
        return isGmailValid;

    }
    public void displayUser(){
        System.out.println("the First name is  "+gmail.getFirstName());
        System.out.println("the last name is  "+gmail.getLastName());
        System.out.println("the dob is   "+gmail.getDob());
        System.out.println("the gender is   "+ gmail.getGender());
        System.out.println("the password is  "+gmail.getPassword());
        System.out.println("the confirm password is "+gmail.getConfirmPassword());

    }
}
