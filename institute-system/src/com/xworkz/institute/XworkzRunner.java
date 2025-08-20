package com.xworkz.institute;

import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.xworkz.Xworkz;

public class XworkzRunner {
    public static void main(String[] args) {

        Trainee trainee1 =new Trainee();
        trainee1.setId(1);
        trainee1.setName("Chethan");
        trainee1.setNoOfClassesTaken(30);
        trainee1.setPhoneNumber(9632027324l);
        trainee1.setSubject("JAVA");

        Xworkz xworkz=new Xworkz();
        boolean isTraineeAdded=xworkz.isTraineeAppointed(trainee1);
        if(isTraineeAdded){
            xworkz.getDetailsOfTrainee();
        }   else     System.out.println("the details of the trainee is not valid ");

    }
}
