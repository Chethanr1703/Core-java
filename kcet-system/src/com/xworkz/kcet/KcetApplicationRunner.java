package com.xworkz.kcet;

import com.xworkz.kcet.applicationvalidator.CetApplicationValidator;
import com.xworkz.kcet.cetapplication.CetApplication;

public class KcetApplicationRunner {
    public static void main(String[] args) {
        CetApplication firstApplication =new CetApplication();
        firstApplication.setFirstName("Chethan");
        firstApplication.setLastName("R");
        firstApplication.setDob("17-08-2003");
        firstApplication.setEmail("chethan@gmail.com");
        firstApplication.setGender('m');
        firstApplication.setAge(22);
        firstApplication.setPhoneNumber(9632027324l);

        CetApplicationValidator applicationValidator=new CetApplicationValidator();
        boolean firstApplicationValid=applicationValidator.cetApplicationValidator(firstApplication);
        System.out.println(firstApplicationValid);
        if(firstApplicationValid==true){
            applicationValidator.displayDetails();
        }else{
            System.out.println("application not found");
        }
    }
}
