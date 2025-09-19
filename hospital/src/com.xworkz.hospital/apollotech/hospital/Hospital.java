package com.xworkz.apollotech.hospital;

import com.xworkz.apollotech.constants.Gender;
import com.xworkz.apollotech.patient.Patient;

public interface Hospital {

    boolean isPatientAdded(Patient patient);
    void displayInfo();
    void displayInfo(Patient patient);
    Gender getGenderByPatientName(String patientName);
    String getDiseaseNameById(int id);
    String getPatientNameById(int id);
    Patient getPatientById(int id);
    boolean isAgeUpdatedById(int updatedAge ,int existingId);
    boolean updatedAddressById(String Address ,int existingId);
    boolean updateDiseaseNameById(String diseaseName ,int id);
    boolean updateDiseaseNameByName(String name, String diseaseName);
}
