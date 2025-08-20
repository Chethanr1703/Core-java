package com.xworkz.instagramapp;

import com.xworkz.instagramapp.register.InstaRegister;
import com.xworkz.instagramapp.registervalidator.InstaRegisterValidator;

public class InstaRegisterRunner {
    public static void main(String[] args) {
        InstaRegister firstRegistor =new InstaRegister();

        firstRegistor.setFullName("");
        firstRegistor.setEmail("chethan@gmail.com");
        firstRegistor.setPhoneNumber(9632027324l);
        firstRegistor.setPassword("123456");
        firstRegistor.setConfirmPassword("123456");

        InstaRegisterValidator validatedFirstUser =new InstaRegisterValidator();
        boolean firstUser =validatedFirstUser.isRegistrationDone(firstRegistor);
        System.out.println(firstUser);

        if(firstUser==true){
            validatedFirstUser.displayDetails();
        }else {

                System.out.println("registration is not done");

        }
    }
}
