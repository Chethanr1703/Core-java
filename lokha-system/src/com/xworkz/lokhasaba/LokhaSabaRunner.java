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

        Politician politician1 = new Politician(2,"Raj","yelhanka",45,"Indian");
        Politician politician2  = new Politician(2, "Anita", "Indiranagar", 50, "Indian");
        Politician politician3  = new Politician(3, "Kiran", "Malleswaram", 38, "Indian");
        Politician politician4  = new Politician(4, "Meera", "Jayanagar", 42, "Indian");
        Politician politician5  = new Politician(5, "Suresh", "Koramangala", 55, "Indian");
        Politician politician6  = new Politician(6, "Divya", "Whitefield", 34, "Indian");
        Politician politician7  = new Politician(7, "Prakash", "BTM Layout", 60, "Indian");
        Politician politician8  = new Politician(8, "Lakshmi", "Hebbal", 48, "Indian");
        Politician politician9  = new Politician(9, "Ravi", "Banashankari", 52, "Indian");
        Politician politician10 = new Politician(10,"Shreya", "Marathahalli", 36, "Indian");
        Politician politician11 = new Politician(11,"Arun", "Basavanagudi", 40, "Indian");


        LokhaSaba lokhaSaba=new LokhaSaba();
        boolean isAdded =lokhaSaba.isPoliticionAdded(politician);
        isAdded = lokhaSaba.isPoliticionAdded(politician2);
        isAdded = lokhaSaba.isPoliticionAdded(politician2);
        isAdded = lokhaSaba.isPoliticionAdded(politician3);
        isAdded = lokhaSaba.isPoliticionAdded(politician4);
        isAdded = lokhaSaba.isPoliticionAdded(politician5);
        isAdded = lokhaSaba.isPoliticionAdded(politician6);
        isAdded = lokhaSaba.isPoliticionAdded(politician7);
        isAdded = lokhaSaba.isPoliticionAdded(politician8);
        isAdded = lokhaSaba.isPoliticionAdded(politician9);
        isAdded = lokhaSaba.isPoliticionAdded(politician10);
        isAdded = lokhaSaba.isPoliticionAdded(politician11);
        if (isAdded){
            lokhaSaba.getDetails();
        }else{
            System.out.println("the details of the politicion is not valid ");
        }
    }
}
