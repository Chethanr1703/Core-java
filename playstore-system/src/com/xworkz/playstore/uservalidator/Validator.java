package com.xworkz.playstore.uservalidator;

import com.xworkz.playstore.user.User;

public class Validator {
    public boolean isInfoValid(User user){
        boolean isInfoValid=false;

        boolean isIdvalid=false;
        boolean isFirstValid=false;
        boolean isLastValid=false;
        boolean isDobValid=false;
        boolean isGenderValid=false;
        boolean isAgeValid=false;
        boolean isPhonenoValid=false;
        boolean isEmailValid=false;
        boolean isAddresValid=false;
        boolean isCountryValid=false;
        boolean isStateValid=false;
        boolean isCityValid=false;
        boolean isPinCodeValid=false;
        boolean isPasswordValid =false;
        boolean isCpassword=false;
        boolean ispassAndCvalid=false;

        if(user.getUserId()>0){
            isIdvalid=true;
        }else{
            System.out.println("the id of the user is not valid");
        }
        if(user.getFirstName()!=null && !user.getFirstName().isEmpty()){
            isFirstValid=true;
        }else{
            System.out.println("the firstName of the user is not valid");
        }
        if(user.getLastName()!=null && !user.getLastName().isEmpty()){
            isLastValid=true;
        }else{
            System.out.println("the last name of the user is not valid");
        }
        if(user.getAge()>16){
            isAgeValid=true;
        }else{
            System.out.println("the age of the user is not valid");
        }
        if(user.getDob()!=null && !user.getDob().isEmpty()){
            isDobValid=true;
        }else{
            System.out.println("the dob of the user is not valid");
        }
        if(user.getGender()!=' '){
            isGenderValid=true;
        }else{
            System.out.println("the gender of the user is not valid");
        }
        if(user.getPhoneNumber()!=0 && user.getPhoneNumber().toString().length()==10){
            isPhonenoValid=true;
        }else{
            System.out.println("the phone number of the user is not valid");
        }
        if(user.getEmail()!=null && !user.getEmail().isEmpty()){
            isEmailValid=true;
        }else{
            System.out.println("the email of the user is not valid");
        }
        if(user.getAddress()!=null && !user.getAddress().isEmpty()){
            isAddresValid=true;
        }else{
            System.out.println("the address of the user is not valid");
        }
        if(user.getCountry()!=null && !user.getCountry().isEmpty()){
            isCountryValid=true;
        }else{
            System.out.println("the country of the user is not valid");
        }
        if(user.getState()!=null && !user.getState().isEmpty()){
            isStateValid=true;
        }else{
            System.out.println("the state of the user is not valid");
        }
        if(user.getCity()!=null && !user.getCity().isEmpty()){
            isCityValid=true;
        }else{
            System.out.println("the city of the user is not valid");
        }
        if(user.getPincode()>0){
            isPinCodeValid=true;
        }else{
            System.out.println("the pincode is not valid");
        }
        if(user.getPassword()!=null && !user.getPassword().isEmpty()){
            isPasswordValid=true;
        }else{
            System.out.println("the password of the user is not valid");
        }
        if(user.getConfirmPassword()!=null && !user.getConfirmPassword().isEmpty()){
            isCpassword=true;
        }else{
            System.out.println("the confirm password of the user is not valid");
        }
        if(user.getPassword()== user.getConfirmPassword()){
            ispassAndCvalid=true;
        }else{
            System.out.println("the confirm password of the user is not valid");
        }

        if(isIdvalid && isFirstValid && isLastValid && isDobValid && isGenderValid && isAgeValid && isPhonenoValid && isEmailValid && isAddresValid && isCountryValid && isStateValid && isCityValid && isPinCodeValid && isPasswordValid && isCpassword && ispassAndCvalid){
            isInfoValid=true;
        }else{
            System.out.println("the information of the user is not valid");
        }
return isInfoValid;
    }
}
