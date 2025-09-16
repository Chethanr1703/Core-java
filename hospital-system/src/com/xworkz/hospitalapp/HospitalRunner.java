package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.patient.Hospital;
import com.xworkz.hospitalapp.patient.impl.HospitalImpl;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new HospitalImpl();
        hospital.admitPatient();
        hospital.scheduleAppointment();
        hospital.dischargePatient();
    }
}
