package com.xworkz.policeapp.policevalidator;

import com.xworkz.policeapp.police.Police;

public class PoliceValidator {
    public boolean isPoliceInfoValid(Police policeInfo){
        boolean isPoliceInfoValid=false;

        boolean isIdValid=false;
        boolean isNameValid=false;
        boolean isTypeOfPostValid=false;
        boolean isSalaryValid=false;
        boolean isExperienceValid=false;

        if(policeInfo.getPoliceId()>0){
            isIdValid=true;
        }else {
            System.out.println("the id is not valid");
        }
        if(policeInfo.getName()!=null &&!policeInfo.getName().isEmpty()){
            isNameValid=true;
        }else {
            System.out.println("the name is not valid");
        }
        if(policeInfo.getTypeOfPost()!=null){
            isTypeOfPostValid=true;
        }else {
            System.out.println("the TypeOfPost is not valid");
        }
        if(policeInfo.getSalary()>1000){
            isSalaryValid=true;
        }else {
            System.out.println("the salary is not valid");
        }
        if(policeInfo.getExperience()>0){
            isExperienceValid=true;
        }else {
            System.out.println("the experience is not valid");
        }
        if(isIdValid&&isNameValid&&isTypeOfPostValid&&isSalaryValid&&isExperienceValid){
            isPoliceInfoValid=true;
        }else {
            System.out.println("the police info is not valid");
        }
       return  isPoliceInfoValid;
    }

}
