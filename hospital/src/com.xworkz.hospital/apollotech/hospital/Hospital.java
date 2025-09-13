package com.xworkz.apollotech.hospital;

import com.xworkz.apollotech.constants.Gender;
import com.xworkz.apollotech.patient.Patient;




public class Hospital {
    Patient []patients ;
    int index;

    public Hospital(int size){
        patients = new Patient[size];
    }

    public boolean isPatientAdded(Patient patient){
        boolean isAdded =false;
        if(patient!=null){
            patients[index]=patient;
            index++;
            isAdded=true;
        }else {
            System.out.println("invalid patient");
        }
        return isAdded;
    }

    public void displayInfo() {
        for (Patient patient : patients) {
            System.out.println("the id of the patient " + patient.getPatientId());
            System.out.println("the name of the patient "+patient.getPatientName());
            System.out.println("the address of the patient "+patient.getAddress());
            System.out.println("the age of the patient "+patient.getAge());
            System.out.println("the gender of the patient  "+patient.getGender());
            System.out.println("the disease name of the patient "+patient.getDiseaseName());
            System.out.println("enter the blood group "+patient.getBloodGroup());
            System.out.println(" ");
        }
    }
    public void displayInfo(Patient patient) {

            System.out.println("the id of the patient " + patient.getPatientId());
            System.out.println("the name of the patient "+patient.getPatientName());
            System.out.println("the address of the patient "+patient.getAddress());
            System.out.println("the age of the patient "+patient.getAge());
            System.out.println("the gender of the patient  "+patient.getGender());
            System.out.println("the disease name of the patient "+patient.getDiseaseName());
            System.out.println("enter the blood group "+patient.getBloodGroup());
            System.out.println(" ");

    }



    public Gender getGenderByPatientName(String patientName){

        if(patientName!=null){
            for(Patient patient :patients){
                if(patient.getPatientName().equals(patientName)){
                   return patient.getGender();
                }
            }if(patientName==null) System.out.println("the patient name is invalid");
        }

        return null;
    }

    public String getDiseaseNameById(int id){
        String diseaseName = null;
        if(id!=0){
            for(Patient patient: patients){
                if(patient.getPatientId()==id){
                    diseaseName= patient.getDiseaseName();
                }
            }

        }else System.out.println("the id is invalid");

return diseaseName;
    }

public Gender getgenderbyId(int id){
      Gender gender =null;

      return  gender;
}

    public String getPatientNameById(int id){
        String patientName=null;
        for(Patient patient :this.patients){
            if(patient.getPatientId()==id){
                patientName= patient.getPatientName();
            }
        }if(patientName==null) System.out.println("the patient name of "+id+" is not found");

        return  patientName;
    }

    public Patient getPatientById(int id){
        Patient patient=null;
        if(id>0){
            for(Patient patient1:patients){
                if(patient1.getPatientId()==id){
                   patient= patient1;
                }
            }
        }else System.out.println("the given id to get Patient details not valid");
        return patient;
    }



    // Update operation


    public  boolean isAgeUpdatedById(int updatedAge ,int existingId){
        boolean isAgeUpdated = false;

        for(Patient patient : patients){
            if(patient.getPatientId()==existingId  ){
                patient.setAge(updatedAge);
                isAgeUpdated=true;

            }
        }
        if(isAgeUpdated==false) System.out.println("the Id is not found  "+existingId);
        return isAgeUpdated;
    }


    public boolean updatedAddressById(String Address ,int existingId){
        boolean isAddressUpdated =false;
        for(Patient patient :patients){
            if(patient.getPatientId()==existingId){
                System.out.println("updating address");
                patient.setAddress("USA");
                isAddressUpdated=true;

            }
        }if(isAddressUpdated==false) System.out.println("the address is not updated "+existingId);


        return isAddressUpdated;
    }

    public boolean updateDiseaseNameById(String diseaseName ,int id){
        boolean isUpdated =false;

        for(Patient patient:patients){
            if(patient.getPatientId()==id){
                patient.setDiseaseName(diseaseName);
                isUpdated=true;
            }
        }if(isUpdated ==false) System.out.println("the id of the patient is not fouund and disease is not updated");

        return isUpdated;
    }

    public boolean updateDiseaseNameByName(String name, String diseaseName){
        boolean isUpdated = false;

        for (Patient patient : patients){
            if(patient.getPatientName().equals(name)){
                patient.setDiseaseName(diseaseName);
                isUpdated =true;
            }
        }if(isUpdated == false) System.out.println("name is not found");
        return  isUpdated;
    }

}
