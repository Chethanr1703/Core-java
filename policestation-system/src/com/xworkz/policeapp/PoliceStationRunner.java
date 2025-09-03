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

        Police police2 = new Police(10,"IPS","Ravi",100000,3);
        Police police3 = new Police(11,"ASI","kumar",90000,4);
        Police police4 = new Police(12,"DCP","Anand",110000,2);
        Police police5 = new Police(13,"DSP","veeresh",120000,6);

        Police police6 = new Police(14,"IAS","shashank",160000,1);


        PoliceStation policeStation=new PoliceStation();
        boolean isAdded =policeStation.isPoliceAdded(police1);
        isAdded = policeStation.isPoliceAdded(police2);
        isAdded = policeStation.isPoliceAdded(police3);
        isAdded = policeStation.isPoliceAdded(police4);
        isAdded = policeStation.isPoliceAdded(police5);
        isAdded = policeStation.isPoliceAdded(police6);

        if(isAdded==true){
            policeStation.getPoliceDetails();
        }else{
            System.out.println("police is not added");
        }
    }
}
