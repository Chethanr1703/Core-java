package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policevalidator.PoliceValidator;

public class PoliceStation {
    Police policeDetails;

    public boolean isPoliceAdded(Police policeDetails){
       boolean isPoliceAdded=false;

        PoliceValidator policeValidator =new PoliceValidator();
        boolean isInfoValid =policeValidator.isPoliceInfoValid(policeDetails);
        if(isInfoValid){
            this.policeDetails=policeDetails;
            isPoliceAdded=true;
        }else {
            System.out.println("the police info is not added and is not valid");
        }
        return isPoliceAdded;

    }
    public void getPoliceDetails(){
        System.out.println("the id of the police is  "+policeDetails.getPoliceId());
        System.out.println("the name of the police is  "+policeDetails.getName());
        System.out.println("the type of post of the police is  "+policeDetails.getTypeOfPost());
        System.out.println("the salary of the police is  "+policeDetails.getSalary());
        System.out.println("the experience of the police is  "+policeDetails.getExperience());

    }

}
