package com.xworkz.hospitalapp.patient.impl;

import com.xworkz.hospitalapp.patient.Hospital;

public class HospitalImpl implements Hospital {
    @Override
    public void admitPatient() {
        System.out.println("Patient admitted");
    }

    @Override
    public void dischargePatient() {
        System.out.println("Patient discharged");
    }

    @Override
    public void scheduleAppointment() {
        System.out.println("Appointment scheduled  " );
    }
}
