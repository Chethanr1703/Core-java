package com.xworkz.googleapp;

import com.xworkz.googleapp.gmail.Gmail;
import com.xworkz.googleapp.validate.GmailValidator;

public class GmailRunner {
    public static void main(String[] args) {
        Gmail firstgmail=new Gmail();
        firstgmail.setFirstName("Chethan");
        firstgmail.setLastName("R");
        firstgmail.setDob("17-08-2003");
        firstgmail.setGender('M');
        firstgmail.setPassword("123456");
        firstgmail.setConfirmPassword("123456");

        GmailValidator gmailValidator =new GmailValidator();
        boolean valid=gmailValidator.isGmailValidated(firstgmail);

        Gmail secondGmail =new Gmail();
        secondGmail.setFirstName("Shashank");


        secondGmail.setLastName("SV");
        secondGmail.setDob("16-07-2003");
        secondGmail.setGender('M');
        secondGmail.setPassword("123456");
        secondGmail.setConfirmPassword("123456");
        if(valid==true) {
            gmailValidator.displayUser();
        }
        else{
            System.out.println("user is not registered");
        }

         valid=gmailValidator.isGmailValidated(secondGmail);

        System.out.println(valid);


        if(valid==true) {
            gmailValidator.displayUser();
        }
        else{
            System.out.println("user is not registered");
        }
//        if(valid==true){
//            System.out.println("the First name is  "+gmail.getFirstName());
//            System.out.println("the last name is  "+gmail.getLastName());
//            System.out.println("the dob is   "+gmail.getDob());
//            System.out.println("the gender is   "+ gmail.getGender());
//            System.out.println("the password is  "+gmail.getPassword());
//            System.out.println("the confirm password is "+gmail.getConfirmPassword());
//        }
    }
}
