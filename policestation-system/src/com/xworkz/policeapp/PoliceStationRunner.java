package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        Police police1= new Police();

        police1.setPoliceId(1023);
        police1.setName("prakash");
        police1.setTypeOfPost("SI");
        police1.setExperience(10);
        police1.setSalary(80000);

        PoliceStation policeStation=new PoliceStation();
        boolean isAdded =policeStation.isPoliceAdded(police1);
        if(isAdded==true){
            policeStation.getPoliceDetails();
        }else{
            System.out.println("police is not added");
        }
    }
}
