package com.xworkz.institute.trainevalidator;

import com.xworkz.institute.trainee.Trainee;

public class TraineeValidator {

    public boolean isTrainneInfoValidated(Trainee trainee){

        boolean isTrainneInfoValidated=false;

        boolean isIdValid=false;
        boolean isNameValid=false;
        boolean isPhoneNumber=false;
        boolean isNoClassesTakenValid=false;
        boolean isSubjectValid=false;

        if(trainee.getId()>0){
            isIdValid=true;
        }else{
            System.out.println("the id of the trainee is not valid");
        }
        if(trainee.getName()!=null &&!trainee.getName().isEmpty()){
            isNameValid=true;
        }else{
            System.out.println("the name of the trainee is not valid");
        }
        if(trainee.getNoOfClassesTaken()>0){
            isNoClassesTakenValid=true;
        }else{
            System.out.println("the no of class of the trainee is not valid");
        }
        if(trainee.getPhoneNumber()>0){
            isPhoneNumber=true;
        }else{
            System.out.println("the phone number of the trainee is not valid");
        }
        if(trainee.getSubject()!=null){
            isSubjectValid=true;
        }else{
            System.out.println("the subject of the trainee is not valid");
        }
        if(isIdValid && isNameValid && isNoClassesTakenValid && isSubjectValid && isPhoneNumber ) {
            isTrainneInfoValidated = true;

        }
        else{
            System.out.println("the info of the trainee is not valid");
        }
        return  isTrainneInfoValidated;


    }
}
