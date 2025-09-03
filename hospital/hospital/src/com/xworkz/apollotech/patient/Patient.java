package com.xworkz.apollotech.patient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int patientId;
    private String patientName;
    private String address;
    private int age;
    private char gender;
    private String diseaseName;

}
