package com.xworkz.formapp;

import com.xworkz.formapp.form.FormRegister;
import com.xworkz.formapp.validate.FormValidation;

public class FormRunner {
    public static void main(String[] args) {

        FormRegister formRegister=new FormRegister();
        formRegister.setGivenName("Chethan");
        formRegister.setSurName("R");
        formRegister.setDob("17-08-2003");
        formRegister.setPhoneNumber(9632027324l);
        formRegister.setGender("Male");
        formRegister.setAge(22);
        formRegister.setQualification("B.E");

        FormValidation formValidation=new FormValidation();
       boolean isValid= formValidation.isFormValid(formRegister);
        System.out.println(isValid);

        if(isValid==true){
            System.out.println("the given name is  "+formRegister.getGivenName());
            System.out.println("the given sur name is   "+formRegister.getSurName());
            System.out.println("the dob  is  "+formRegister.getDob());
            System.out.println("the phone number is   "+formRegister.getPhoneNumber());
            System.out.println("the gender is   "+formRegister.getGender());
            System.out.println("the age is   "+formRegister.getAge());
            System.out.println("the qualification is "+formRegister.getQualification());
        }

    }
}
