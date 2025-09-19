package com.xworkz.apollotech;

import com.xworkz.apollotech.constants.BloodGroup;
import com.xworkz.apollotech.constants.Gender;
import com.xworkz.apollotech.hospital.HospitalImpl;
import com.xworkz.apollotech.patient.Patient;

import java.util.Scanner;

public class HospitalRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of patient " );
        int size = scanner.nextInt();


        HospitalImpl hospital = new HospitalImpl(size);

        for (int index =0;index<size; index++){
            Patient patient =new Patient();

            System.out.println("enter the id of the patient");
            int patientId=scanner.nextInt();
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




        System.out.println("enter the patient name ");
        Gender gender=hospital.getGenderByPatientName(scanner.next());
        System.out.println(gender);

        System.out.println("enter the id of the patient");
        String diseaseName =hospital.getDiseaseNameById(scanner.nextInt());
        System.out.println(diseaseName);

        System.out.println("enter the id to get patientName");
        String name = hospital.getPatientNameById(scanner.nextInt());
        System.out.println(name);
//
        System.out.println("enter the id to get PatientDetails");
        Patient patient1 = hospital.getPatientById(scanner.nextInt());
        hospital.displayInfo(patient1);

        //update
        System.out.println("enter the id to update address");
        int id = scanner.nextInt();
        System.out.println("enter the updated address");
        String address = scanner.next();
        boolean isAddressUpdated = hospital.updatedAddressById(address,id);
        if(isAddressUpdated){
            hospital.displayInfo();
        }

        hospital.displayInfo();
        hospital.isAgeUpdatedById(85,1);
        hospital.displayInfo();

        System.out.println("enter the id to update address");
         id = scanner.nextInt();
        System.out.println("enter the updated address");
        String diseasename = scanner.next();
        boolean isDiseaseUpdated = hospital.updateDiseaseNameById(diseasename,id);
        if(isDiseaseUpdated){
            hospital.displayInfo();
        }

        System.out.println("enter the name to update DiseaseName");
        name = scanner.next();
        System.out.println("enter the updated DiseaseNameB");
         diseasename = scanner.next();
        boolean isDiseaseNameUpdated = hospital.updateDiseaseNameByName(diseasename,name);
        if(isDiseaseNameUpdated){
            hospital.displayInfo();
        }


    }
}
