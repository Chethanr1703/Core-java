package com.xworkz.amazonapp.amazonvalidator;

import com.xworkz.amazonapp.amazonregistor.AmazonRegistor;

public class AmazonValidator {
    AmazonRegistor amazonRegistor;
    public boolean isDetialsValid(AmazonRegistor amazonRegistor){

        boolean isDetailsValid=false;
        boolean isFirstNameValid=false;
        boolean isLastNameValid=false;
        boolean isPhoneNumberValid=false;
        boolean isPasswordValid= false;
        boolean isConfirmPasswordValid= false;
        boolean isbothPasswordValid=false;

        if(amazonRegistor.getFirstName()!=null){
            isFirstNameValid=true;
        }else{
            System.out.println("the first Name is not valid");
        }
        if(amazonRegistor.getLastName()!=null){
            isLastNameValid=true;
        }
        else{
            System.out.println("the last Name is not valid");
        }
        if(amazonRegistor.getPhoneNumber()!=0){
            isPhoneNumberValid=true;
        }else{
            System.out.println("the Phone number is not valid");
        }
        if(amazonRegistor.getPassword()!=null){
            isPasswordValid=true;
        }
        else{
            System.out.println("the password is not valid");
        }
        if(amazonRegistor.getConfirmPassword()!=null){
            isConfirmPasswordValid=true;
        }
        else{
            System.out.println("the Confirm Password is not valid");
        }
        if (amazonRegistor.getPassword()==amazonRegistor.getConfirmPassword()){
            System.out.println("password and confirm password is matched");
            isbothPasswordValid=true;
        }
        else{
            System.out.println("both password is not matched");
        }
        if(isFirstNameValid&&isLastNameValid&&isPhoneNumberValid&&isPasswordValid&&isConfirmPasswordValid&&isbothPasswordValid){
            this.amazonRegistor=amazonRegistor;
            isDetailsValid=true;
        }
        else{
            System.out.println("amazon registor is not valid");
        }
        return  isDetailsValid;

    }
    public void displayUser(){
        System.out.println("the First name is  "+amazonRegistor.getFirstName());
        System.out.println("the last name is  "+amazonRegistor.getLastName());
        System.out.println("the phone number is   "+amazonRegistor.getPhoneNumber());
        System.out.println("the password is  "+amazonRegistor.getPassword());
        System.out.println("the confirm password is "+amazonRegistor.getConfirmPassword());

    }
}
