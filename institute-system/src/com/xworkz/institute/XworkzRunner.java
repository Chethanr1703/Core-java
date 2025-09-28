package com.xworkz.institute;

import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.xworkz.Xworkz;
import com.xworkz.institute.xworkz.impl.XworkzImpl;

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

//        xworkz.getDetailsOfTrainee();

        String input = null;
        do {
            System.out.println("press #1 to fetch trainee by id");
            System.out.println("press #2 to fetch subject by trainee name");
            System.out.println("press #3 to fetch phone number by trainee id");
            System.out.println("press #4 to fetch no of classes taken by trainee id");
            System.out.println("press #5 to fetch subject by trainee id");
            System.out.println("press #6 to fetch phone number by trainee name");
            System.out.println("press #7 to fetch no of classes taken by trainee name");
            System.out.println("press #8 to fetch trainee id by name");
            System.out.println("press #9 to fetch trainee name by id");
            System.out.println("press #10 to update no of classes by trainee id");
            System.out.println("press #11 to update phone number by trainee id");
            System.out.println("press #12 to update subject by trainee id");
            System.out.println("press #13 to update trainee name by trainee id");
            System.out.println("press #14  to get all info");
            System.out.println(" ");
            System.out.println("enter the option which you require");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter id to get trainee");
                    Trainee trainee = xworkz.getTraineeById(scanner.nextInt());
                    xworkz.getDetailsOfTrainee(trainee);
                    break;

                case 2:
                    System.out.println("enter name to get subject");
                    Subject subject = xworkz.getSubjectByTraineeName(scanner.next());
                    System.out.println(subject);
                    break;

                case 3:
                    System.out.println("enter id to get phone number");
                    long phone = xworkz.getPhoneNumberByTraineeId(scanner.nextInt());
                    System.out.println(phone);
                    break;

                case 4:
                    System.out.println("enter id to get no of classes taken");
                    int noOfClasses = xworkz.getNoOfClassesTakenByTraineeId(scanner.nextInt());
                    System.out.println(noOfClasses);
                    break;

                case 5:
                    System.out.println("enter id to get subject");
                    subject = xworkz.getSubjectNameByTraineeId(scanner.nextInt());
                    System.out.println(subject);
                    break;

                case 6:
                    System.out.println("enter name to get phone number");
                    phone = xworkz.getPhoneNumberByName(scanner.next());
                    System.out.println(phone);
                    break;

                case 7:
                    System.out.println("enter name to get no of classes taken");
                    noOfClasses = xworkz.getNoOfClassesTakenByName(scanner.next());
                    System.out.println(noOfClasses);
                    break;

                case 8:
                    System.out.println("enter name to get trainee id");
                    int traineeId = xworkz.getTraineeIdByName(scanner.next());
                    System.out.println(traineeId);
                    break;

                case 9:
                    System.out.println("enter id to get trainee name");
                    String traineeName = xworkz.getTraineeNameById(scanner.nextInt());
                    System.out.println(traineeName);
                    break;

                case 10:
                    System.out.println("enter id to update no of classes");
                    int id = scanner.nextInt();
                    System.out.println("enter the updated no of classes");
                    int updatedClasses = scanner.nextInt();
                    boolean isClassesUpdated = xworkz.updateNoOfClassesTakenByTraineeId(id, updatedClasses);
                    if (isClassesUpdated) {
                        System.out.println(isClassesUpdated);
//                        xworkz.getDetailsOfTrainee();
                    }
                    break;

                case 11:
                    System.out.println("enter id to update phone number");
                    id = scanner.nextInt();
                    System.out.println("enter the updated phone number");
                    long updatedPhone = scanner.nextLong();
                    boolean isPhoneUpdated = xworkz.updatePhoneNumberByTraineeId(id, updatedPhone);
                    if (isPhoneUpdated) {
                        System.out.println(isPhoneUpdated);//                        xworkz.getDetailsOfTrainee();
                    }
                    break;

                case 12:
                    System.out.println("enter id to update subject");
                    id = scanner.nextInt();
                    System.out.println("enter the updated subject");
                    subject = Subject.valueOf(scanner.next().toUpperCase());
                    boolean isSubjectUpdated = xworkz.updateSubjectByTraineeId(id, subject);
                    if (isSubjectUpdated) {
                        System.out.println(isSubjectUpdated);
//                        xworkz.getDetailsOfTrainee();
                    }
                    break;

                case 13:
                    System.out.println("enter id to update trainee name");
                    id = scanner.nextInt();
                    System.out.println("enter the updated name");
                    traineeName = scanner.next();
                    boolean isNameUpdated = xworkz.updateTraineeNameById(id, traineeName);
                    if (isNameUpdated) {
//                        xworkz.getDetailsOfTrainee();
                        System.out.println(isNameUpdated);
                    }
                    break;
                case 14: xworkz.getDetailsOfTrainee();

                default:
                    System.out.println("you entered wrong option");
            }

            System.out.println("do you want to continue yes / no ");
            input = scanner.next();

        } while (input.equalsIgnoreCase("yes"));

        System.out.println("thank you for visiting this app ........");

    }
}
