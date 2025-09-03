package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policevalidator.PoliceValidator;

public class PoliceStation {
    Police policeDetails[] =new Police[6];
    int index;

    public boolean isPoliceAdded(Police policeDetail){
       boolean isPoliceAdded=false;

        PoliceValidator policeValidator =new PoliceValidator();
        boolean isInfoValid =policeValidator.isPoliceInfoValid(policeDetail);
        if(isInfoValid){
//            this.policeDetails=policeDetails;
            policeDetails[index]=policeDetail;
            index++;
            isPoliceAdded=true;
        }else {
            System.out.println("the police info is not added and is not valid");
        }
        return isPoliceAdded;

    }

    public void getPoliceDetails(){
        for(Police police :policeDetails) {
            System.out.println("the id of the police is  " + police.getPoliceId());
            System.out.println("the name of the police is  " + police.getName());
            System.out.println("the type of post of the police is  " + police.getTypeOfPost());
            System.out.println("the salary of the police is  " + police.getSalary());
            System.out.println("the experience of the police is  " + police.getExperience());
            System.out.println(" ");
        }
    }

}
