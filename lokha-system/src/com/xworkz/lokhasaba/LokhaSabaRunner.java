package com.xworkz.lokhasaba;

import com.xworkz.lokhasaba.lokasaba.LokhaSaba;
import com.xworkz.lokhasaba.politician.Politician;

public class LokhaSabaRunner {
    public static void main(String[] args) {

        Politician politician =new Politician();
        politician.setId(1);
        politician.setName("maniRatna");
        politician.setConstitution("RR nagar");
        politician.setAge(50);
        politician.setNationality("Indian");

        LokhaSaba lokhaSaba=new LokhaSaba();
        boolean isAdded =lokhaSaba.isPoliticionAdded(politician);
        if (isAdded){
            lokhaSaba.getDetails();
        }else{
            System.out.println("the details of the politicion is not valid ");
        }
    }
}
