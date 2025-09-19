package com.xworkz.institute;

import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.xworkz.Xworkz;
import com.xworkz.institute.xworkz.XworkzImpl;

import java.util.Scanner;

public class XworkzRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of trainee");
        int size = scanner.nextInt();

        Xworkz xworkz = new XworkzImpl(size);

        for (int index =0;index<size; index++ ){
            Trainee trainee = new Trainee();
            System.out.println("enter the id of trainee");
            trainee.setId(scanner.nextInt());
            System.out.println("enter the name of the trainee");
            trainee.setName(scanner.next());
            System.out.println("enter the nof class taken");
            trainee.setNoOfClassesTaken(scanner.nextInt());
            System.out.println("enter the phone number");
            trainee.setPhoneNumber(scanner.nextLong());
            System.out.println("enter the subject ");
            trainee.setSubject(Subject.valueOf(scanner.next().toUpperCase()));


           boolean isadded= xworkz.isTraineeAppointed(trainee);
           if (isadded) System.out.println("sucessfull");
        }

        xworkz.getDetailsOfTrainee();

        System.out.println("enter id to get ");
        Trainee trainee = xworkz.getTraineeById(scanner.nextInt());
        xworkz.getDetailsOfTrainee(trainee);

        System.out.println("enter name to get Subject");
        Subject name =xworkz.getSubjectByTraineeName(scanner.next());
        System.out.println(name);

        System.out.println("enter id to get phone number");
        long phone = xworkz.getPhoneNumberByTraineeId(scanner.nextInt());
        System.out.println(phone);

        System.out.println("enter id to get NoClassTaken");
        int noOfClasses =xworkz.getNoOfClassesTakenByTraineeId(scanner.nextInt());
        System.out.println(noOfClasses);

        System.out.println("enter id to get subject");
        name = xworkz.getSubjectNameByTraineeId(scanner.nextInt());
        System.out.println(name);

        System.out.println("enter name to get phone number");
        phone = xworkz.getPhoneNumberByName(scanner.next());
        System.out.println(phone);

        System.out.println("enter name to get NoClassTaken");
         noOfClasses =xworkz.getNoOfClassesTakenByName(scanner.next());
        System.out.println(noOfClasses);

        System.out.println("enter name to get id");
        int trainneID =xworkz. getTraineeIdByName(scanner.next());
        System.out.println(trainneID);

        System.out.println("enter id to get name");
        String trainneNAme =xworkz. getTraineeNameById(scanner.nextInt());
        System.out.println(trainneNAme);

        //update
        System.out.println("enter id to update no of class");
        int id = scanner.nextInt();
        System.out.println("enter the updated no of classes");
        int noOfclass = scanner.nextInt();
       boolean isupdateNoOfclass= xworkz.updateNoOfClassesTakenByTraineeId(id,noOfclass);
       if(isupdateNoOfclass){
           xworkz.getDetailsOfTrainee();
       }

        System.out.println("enter id to update phone no ");
         id = scanner.nextInt();
        System.out.println("enter the updated phone no ");
        long phoneNo = scanner.nextLong();
        boolean isPhoneUpdated = xworkz.updatePhoneNumberByTraineeId(id,phoneNo);
        if(isPhoneUpdated){
            xworkz.getDetailsOfTrainee();
        }

        System.out.println("enter id to update Subject");
         id = scanner.nextInt();
        System.out.println("enter the updated Subject");
        Subject subject = Subject.valueOf(scanner.next().toUpperCase());
        boolean isupdateSubjet= xworkz.updateSubjectByTraineeId(id,subject);
        if(isupdateSubjet){
            xworkz.getDetailsOfTrainee();
        }


        System.out.println("enter id to update name");
        id = scanner.nextInt();
        System.out.println("enter the updated Subject");
        String traineeName = scanner.next();
        boolean isupdateName= xworkz.updateTraineeNameById(id,traineeName);
        if(isupdateName){
            xworkz.getDetailsOfTrainee();
        }
    }
}
