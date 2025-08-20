package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazonregistor.AmazonRegistor;
import com.xworkz.amazonapp.amazonvalidator.AmazonValidator;

public class AmazonRunner {
    public static void main(String[] args) {
        AmazonRegistor amazonRegistor =new AmazonRegistor();
        amazonRegistor.setFirstName("Chethan");
        amazonRegistor.setLastName("R");
        amazonRegistor.setPhoneNumber(9632027324l);
        amazonRegistor.setPassword("123456");
        amazonRegistor.setConfirmPassword("123456");

        AmazonValidator amazonValidator= new AmazonValidator();

        boolean valid =amazonValidator.isDetialsValid(amazonRegistor);
        System.out.println(valid);
        if(valid==true){
            amazonValidator.displayUser();
        }
        else{
            System.out.println("user is not registered");

        }

//        if(valid==true){
//            System.out.println("the First name is  "+amazonRegistor.getFirstName());
//            System.out.println("the last name is  "+amazonRegistor.getLastName());
//            System.out.println("the phone number is   "+amazonRegistor.getPhoneNumber());
//            System.out.println("the password is  "+amazonRegistor.getPassword());
//            System.out.println("the confirm password is "+amazonRegistor.getConfirmPassword());
//        }

    }
}
