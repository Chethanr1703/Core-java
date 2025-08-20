package com.xworkz.institute.xworkz;

import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.trainevalidator.TraineeValidator;

public class Xworkz {
    Trainee trainee;
    public boolean isTraineeAppointed(Trainee trainee){
        boolean isTraineeAppointed=false;

        TraineeValidator traineeValidator=new TraineeValidator();
        boolean isValidInfo=traineeValidator.isTrainneInfoValidated(trainee);
        if(isValidInfo){
            this.trainee=trainee;
        }else{
            System.out.println("the Validation of the trainee is not valid");
        }
        return  isValidInfo;
    }
    public void getDetailsOfTrainee(){
        System.out.println("the id of the trainee is  "+trainee.getId());
        System.out.println("the name of the trainee is  "+trainee.getName());
        System.out.println("the class taken of the trainee is  "+trainee.getNoOfClassesTaken());
        System.out.println("the phone no of the trainee is  "+trainee.getPhoneNumber());
        System.out.println("the subject of the trainee is  "+trainee.getSubject());

    }
}
