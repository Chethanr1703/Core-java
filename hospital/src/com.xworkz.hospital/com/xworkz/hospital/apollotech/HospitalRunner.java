package com.xworkz.com.xworkz.hospital.apollotech;

import com.xworkz.com.xworkz.hospital.apollotech.constants.BloodGroup;
import com.xworkz.com.xworkz.hospital.apollotech.constants.Gender;
import com.xworkz.com.xworkz.hospital.apollotech.hospital.impl.HospitalImpl;
import com.xworkz.com.xworkz.hospital.apollotech.patient.Patient;

import java.util.Scanner;

public class HospitalRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of patient ");
        int size = scanner.nextInt();


        HospitalImpl hospital = new HospitalImpl(size);

        for (int index = 0; index < size; index++) {
            Patient patient = new Patient();

            System.out.println("enter the id of the patient");
            int patientId = scanner.nextInt();
            patient.setPatientId(patientId);

            System.out.println("enter the name of the patient");
            String patientName = scanner.next();
            patient.setPatientName(patientName);

            System.out.println("enter the address of the patient");
            String patientAddress = scanner.next();
            patient.setAddress(patientAddress);

            System.out.println("enter the age of the patient");
            int patientAge = scanner.nextInt();
            patient.setAge(patientAge);

            System.out.println("enter the gender of the patient");
//            patient.setGender(scanner.next().charAt(0));
            patient.setGender(Gender.valueOf(scanner.next().toUpperCase()));


            System.out.println("enter the disease name of the patient");
            patient.setDiseaseName(scanner.next());

            System.out.println("enter the blood group of the patient");
            patient.setBloodGroup(BloodGroup.valueOf(scanner.next().toUpperCase()));

            hospital.isPatientAdded(patient);

        }
        hospital.displayInfo();


        String input = null;
        do {
            System.out.println("press #1 to get gender by patient name");
            System.out.println("press #2 to get disease name by id");
            System.out.println("press #3 to get patient name by id");
            System.out.println("press #4 to get patient details by id");
            System.out.println("press #5 to update address by id");
            System.out.println("press #6 to update age by id");
            System.out.println("press #7 to update disease name by id");
            System.out.println("press #8 to update disease name by patient name");
            System.out.println(" ");
            System.out.println("enter the option which you require");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter the patient name");
                    Gender gender = hospital.getGenderByPatientName(scanner.next());
                    System.out.println(gender);
                    break;

                case 2:
                    System.out.println("enter the id of the patient");
                    String diseaseName = hospital.getDiseaseNameById(scanner.nextInt());
                    System.out.println(diseaseName);
                    break;

                case 3:
                    System.out.println("enter the id to get patient name");
                    String name = hospital.getPatientNameById(scanner.nextInt());
                    System.out.println(name);
                    break;

                case 4:
                    System.out.println("enter the id to get patient details");
                    Patient patient = hospital.getPatientById(scanner.nextInt());
                    hospital.displayInfo(patient);
                    break;

                case 5:
                    System.out.println("enter the id to update address");
                    int id = scanner.nextInt();
                    System.out.println("enter the updated address");
                    String address = scanner.next();
                    boolean isAddressUpdated = hospital.updatedAddressById(address, id);
                    if (isAddressUpdated) {
                        System.out.println(isAddressUpdated);
//                        hospital.displayInfo();
                    }
                    break;

                case 6:
                    System.out.println("enter the id to update age");
                    id = scanner.nextInt();
                    System.out.println("enter the updated age");
                    int age = scanner.nextInt();
                    boolean isAgeUpdated = hospital.isAgeUpdatedById(age, id);
                    if (isAgeUpdated) {
                        System.out.println(isAgeUpdated);
//                        hospital.displayInfo();
                    }
                    break;

                case 7:
                    System.out.println("enter the id to update disease name");
                    id = scanner.nextInt();
                    System.out.println("enter the updated disease name");
                    String updatedDisease = scanner.next();
                    boolean isDiseaseUpdated = hospital.updateDiseaseNameById(updatedDisease, id);
                    if (isDiseaseUpdated) {
                        System.out.println(isDiseaseUpdated);
//                        hospital.displayInfo();
                    }
                    break;

                case 8:
                    System.out.println("enter the patient name to update disease name");
                    name = scanner.next();
                    System.out.println("enter the updated disease name");
                    updatedDisease = scanner.next();
                    boolean isDiseaseNameUpdated = hospital.updateDiseaseNameByName(updatedDisease, name);
                    if (isDiseaseNameUpdated) {
                        System.out.println(isDiseaseNameUpdated);
                    }
                    break;
                case 9:
                    hospital.displayInfo();
                    break;
                default:
                    System.out.println("you entered wrong option");
            }

            System.out.println("do you want to continue yes / no ");
            input = scanner.next();

        } while (input.equalsIgnoreCase("yes"));

        System.out.println("thank you for visiting this app ........");


    }
}
