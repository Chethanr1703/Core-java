package com.xworkz.instagramapp.registervalidator;

import com.xworkz.instagramapp.register.InstaRegister;

public class InstaRegisterValidator {
    InstaRegister instaRegister;

    public boolean isRegistrationDone(InstaRegister instaRegister){

       boolean isRegistrationDone=false;
       boolean isFullNameValid =false;
       boolean isEmailValid =false;
       boolean isPhoneNumberValid=false;
       boolean isPasswordValid =false;
       boolean isConfirmPassword =false;
       boolean isbothPasswordMatched=false;

       if(instaRegister.getFullName()!=null){
           isFullNameValid=true;
       }else{
           System.out.println("the full name is not valid");
       }
        if(instaRegister.getEmail()!=null){
            isEmailValid=true;
        }else{
            System.out.println("the email is not valid");
        }
        if(instaRegister.getPhoneNumber()!=0){
            isPhoneNumberValid=true;
        }else{
            System.out.println("the phone number is not valid");
        }
        if(instaRegister.getPassword()!=null){
            isPasswordValid=true;
        }else{
            System.out.println("the password is not valid");
        }
        if(instaRegister.getConfirmPassword()!=null){
            isConfirmPassword=true;
        }else{
            System.out.println("the Confirm password is not valid");
        }
        if(instaRegister.getPassword()==instaRegister.getConfirmPassword()){
            isbothPasswordMatched=true;
        }
        if(isFullNameValid&&isEmailValid&&isPhoneNumberValid&&isPasswordValid&&isConfirmPassword&&isbothPasswordMatched){
            this.instaRegister=instaRegister;
            isRegistrationDone =true;
        }else{
            System.out.println("registration is not done");
        }
        return isRegistrationDone;
    }
    public void displayDetails(){
        System.out.println("the full name is   "+instaRegister.getFullName());
        System.out.println("the email is   "+instaRegister.getEmail());
        System.out.println("the phone number is  "+instaRegister.getPhoneNumber());
        System.out.println("the password is  "+instaRegister.getPassword());
        System.out.println("the confirm password is  "+instaRegister.getConfirmPassword());
    }
}
