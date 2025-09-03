package com.xworkz.lokhasaba.politicianvalidator;

import com.xworkz.lokhasaba.politician.Politician;

public class PoliticianValidator {
    Politician politician;

    public  boolean isDetailsValid(Politician politician){
        boolean isDetailsValid=false;

        boolean isIdValid=false;
        boolean isNameValid=false;
        boolean isConstitutionValid=false;
        boolean isAgeValid=false;
        boolean isIndianValid=false;

        if(politician.getId()>0){
            isIdValid=true;
        }else{
            System.out.println("the id of the politicion is not valid");
        }
        if(politician.getName()!= null && !politician.getName().isEmpty()){
            isNameValid=true;
        }else{
            System.out.println("the name of the politicion is not valid");
        }
        if(politician.getConstitution()!=null && !politician.getConstitution().isEmpty()){
            isConstitutionValid=true;
        }else{
            System.out.println("the constitution of the politicion is not valid");
        }
        if(politician.getAge()>30){
            isAgeValid=true;
        }else{
            System.out.println("the age of the politicion is not valid");
        }
        if(politician.getNationality()!=null && !politician.getNationality().isEmpty()){
            isIndianValid=true;
        }else{
            System.out.println("the indian of the politicion is not valid");
        }
        if(isIdValid&&isNameValid&& isConstitutionValid&& isAgeValid && isIndianValid){
            isDetailsValid=true;
        }else{
            System.out.println("the info of the politicion is not valid");
        }
        return isDetailsValid;
    }
}
