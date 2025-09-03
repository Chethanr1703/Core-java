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

        Trainee trainee2 = new Trainee(2,"veeresh",15,8965231452l,"java");
        Trainee trainee3 = new Trainee(3,"shahank",15,8965235655l,"java");
        Trainee trainee4 = new Trainee(4,"pramod",15,8968956241l,"java");
        Trainee trainee5 = new Trainee(5,"prajwal",15,8965231452l,"java");
        Trainee trainee6 = new Trainee(6,"suprith",15,8965231452l,"java");
        Trainee trainee7 = new Trainee(7,"manoj b",15,8965231452l,"java");
        Trainee trainee8 = new Trainee(8,"chethan R",15,8965231452l,"java");
        Trainee trainee9 = new Trainee(9,"shiva",15,8965231452l,"java");
        Trainee trainee10 = new Trainee(10,"shiva Raj",15,8965231452l,"java");
        Trainee trainee11= new Trainee(11,"Cheeru",15,8965231452l,"java");
        Trainee trainee12= new Trainee(12,"Cheranjeevi",15,8965231452l,"java");
        Trainee trainee13 = new Trainee(13,"amith",15,8965231452l,"java");
        Trainee trainee14 = new Trainee(14,"dev",15,8965231452l,"java");
        Trainee trainee15 = new Trainee(15,"shashank",15,8965231452l,"java");

        Xworkz xworkz=new Xworkz();

        boolean isTraineeAdded=xworkz.isTraineeAppointed(trainee1);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee2);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee3);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee4);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee5);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee6);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee7);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee8);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee9);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee10);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee11);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee12);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee13);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee14);
        isTraineeAdded = xworkz.isTraineeAppointed(trainee15);


        if(isTraineeAdded){
            xworkz.getDetailsOfTrainee();
        }   else     System.out.println("the details of the trainee is not valid ");

    }
}
