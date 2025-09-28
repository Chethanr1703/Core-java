package com.xworkz.com.xworkz.hospital.apollotech.hospital.impl;

import com.xworkz.com.xworkz.hospital.apollotech.constants.Gender;
import com.xworkz.com.xworkz.hospital.apollotech.exception.*;
import com.xworkz.com.xworkz.hospital.apollotech.hospital.Hospital;
import com.xworkz.com.xworkz.hospital.apollotech.patient.Patient;


public class HospitalImpl implements Hospital {
    Patient[] patients;
    int index;

    public HospitalImpl(int size) {
        patients = new Patient[size];
    }

    @Override
    public boolean isPatientAdded(Patient patient) {
        boolean isAdded = false;
        try {
            if (patient != null) {
                patients[index] = patient;
                index++;
                isAdded = true;
            } else {
                PatientNotFoundException patientNotFoundException = new PatientNotFoundException("invalid patient");
                throw patientNotFoundException;
            }
        } catch (PatientNotFoundException e) {
            e.printStackTrace();
        }
        return isAdded;
    }

    @Override
    public void displayInfo() {
        for (Patient patient : patients) {
            System.out.println("the id of the patient " + patient.getPatientId());
            System.out.println("the name of the patient " + patient.getPatientName());
            System.out.println("the address of the patient " + patient.getAddress());
            System.out.println("the age of the patient " + patient.getAge());
            System.out.println("the gender of the patient  " + patient.getGender());
            System.out.println("the disease name of the patient " + patient.getDiseaseName());
            System.out.println("enter the blood group " + patient.getBloodGroup());
            System.out.println(" ");
        }
    }

    @Override
    public void displayInfo(Patient patient) {
        try {
            if (patient != null) {
                System.out.println("the id of the patient " + patient.getPatientId());
                System.out.println("the name of the patient " + patient.getPatientName());
                System.out.println("the address of the patient " + patient.getAddress());
                System.out.println("the age of the patient " + patient.getAge());
                System.out.println("the gender of the patient  " + patient.getGender());
                System.out.println("the disease name of the patient " + patient.getDiseaseName());
                System.out.println("enter the blood group " + patient.getBloodGroup());
                System.out.println(" ");
            } else {
                PatientNotFoundException patientNotFoundException = new PatientNotFoundException("not found");
                throw patientNotFoundException;
            }
        } catch (PatientNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Gender getGenderByPatientName(String patientName) {
        Gender gender = null;
        try {
            if (patientName != null) {
                for (Patient patient : patients) {
                    if (patient.getPatientName().equals(patientName)) {
                        gender = patient.getGender();
                    }
                }
            }
            if (gender == null) {
                GenderNotFoundException genderNotFoundException = new GenderNotFoundException("the patient name is invalid");
                throw genderNotFoundException;
            }
        } catch (GenderNotFoundException e) {
            e.printStackTrace();
        }

        return gender;
    }

    @Override
    public String getDiseaseNameById(int id) {
        String diseaseName = null;
        try {
            if (id > 0) {
                for (Patient patient : patients) {
                    if (patient.getPatientId() == id) {
                        diseaseName = patient.getDiseaseName();
                    }
                }
            }
            if (diseaseName == null) {
                DiseaseNotFoundException diseaseNotFoundException = new DiseaseNotFoundException("the id is invalid");
                throw diseaseNotFoundException;
            }
        } catch (DiseaseNotFoundException e) {
            e.printStackTrace();
        }
        return diseaseName;
    }


    @Override
    public String getPatientNameById(int id) {
        String patientName = null;
        try {
            if (id > 0) {
                for (Patient patient : this.patients) {
                    if (patient.getPatientId() == id) {
                        patientName = patient.getPatientName();
                    }
                }
            }
            if (patientName == null) {
                PatientNameNotFoundException patientNameNotFoundException = new PatientNameNotFoundException("the patient name of " + id + " is not found");
                throw patientNameNotFoundException;
            }
        } catch (PatientNameNotFoundException e) {
            e.printStackTrace();
        }
        return patientName;
    }

    @Override
    public Patient getPatientById(int id) {
        Patient patient = null;
        try {
            if (id > 0) {
                for (Patient patient1 : patients) {
                    if (patient1.getPatientId() == id) {
                        patient = patient1;
                    }
                }
            }
            if (patient == null) {
                PatientNotFoundException patientNotFoundException = new PatientNotFoundException("the given id to get Patient details not valid");
                throw patientNotFoundException;
            }
        } catch (PatientNotFoundException e) {
            e.printStackTrace();
        }
        return patient;
    }


    // Update operation

    @Override
    public boolean isAgeUpdatedById(int updatedAge, int existingId) {
        boolean isAgeUpdated = false;
        try {
            for (Patient patient : patients) {
                if (patient.getPatientId() == existingId) {
                    patient.setAge(updatedAge);
                    isAgeUpdated = true;

                }
            }
            if (isAgeUpdated == false) {
                AgeNotUpdatedException ageNotUpdatedException = new AgeNotUpdatedException("the Id is not found  " + existingId);
                throw ageNotUpdatedException;
            }
        } catch (AgeNotUpdatedException e) {
            e.printStackTrace();
        }
        return isAgeUpdated;
    }

    @Override
    public boolean updatedAddressById(String Address, int existingId) {
        boolean isAddressUpdated = false;
        try {
            for (Patient patient : patients) {
                if (patient.getPatientId() == existingId) {
                    System.out.println("updating address");
                    patient.setAddress("USA");
                    isAddressUpdated = true;
                }
            }
            if (isAddressUpdated == false) {
                AddressNotUpdatedException addressNotUpdatedException = new AddressNotUpdatedException("the address is not updated " + existingId);
                throw addressNotUpdatedException;
            }
        } catch (AddressNotUpdatedException e) {
            e.printStackTrace();
        }
        return isAddressUpdated;
    }

    @Override
    public boolean updateDiseaseNameById(String diseaseName, int id) {
        boolean isUpdated = false;
        try {
            for (Patient patient : patients) {
                if (patient.getPatientId() == id) {
                    patient.setDiseaseName(diseaseName);
                    isUpdated = true;
                }
            }
            if (isUpdated == false) {
                throw new DiseaseNotUpdatedException("the id of the patient is not fouund and disease is not updated");
            }
        } catch (DiseaseNotUpdatedException e) {
            e.printStackTrace();
        }

        return isUpdated;
    }

    @Override
    public boolean updateDiseaseNameByName(String name, String diseaseName) {
        boolean isUpdated = false;
        try {
            for (Patient patient : patients) {
                if (patient.getPatientName().equals(name)) {
                    patient.setDiseaseName(diseaseName);
                    isUpdated = true;
                }
            }
            if (isUpdated == false) throw new DiseaseNotUpdatedException("name is not found");

        } catch (GenderNotFoundException e) {
            e.printStackTrace();
        }
        return isUpdated;

    }
}
