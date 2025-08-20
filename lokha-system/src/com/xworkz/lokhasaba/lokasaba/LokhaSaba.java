package com.xworkz.lokhasaba.lokasaba;

import com.xworkz.lokhasaba.politician.Politician;
import com.xworkz.lokhasaba.politicianvalidator.PoliticianValidator;

public class LokhaSaba {
    Politician politician;

    public boolean isPoliticionAdded(Politician politician){
       boolean isPoliticionAdded =false;

        PoliticianValidator politicianValidator =new PoliticianValidator();
        boolean isValid =politicianValidator.isDetailsValid(politician);
        if(isValid==true){
            this.politician=politician;
            isPoliticionAdded=true;
        }else {
            System.out.println("the details of the politicion is not valid");
        }
        return isPoliticionAdded;
    }
    public void getDetails(){
        System.out.println("the id of the politicion is   "+politician.getId());
        System.out.println("the name of the politicion is   "+politician.getName());
        System.out.println("the constitution of the politicion is   "+politician.getConstitution());
        System.out.println("the age of the politicion is   "+politician.getAge());
        System.out.println("the is Indian of the politicion is   "+politician.getNationality());

    }
}
