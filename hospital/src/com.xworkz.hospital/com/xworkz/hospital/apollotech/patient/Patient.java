package com.xworkz.com.xworkz.hospital.apollotech.patient;

import com.xworkz.com.xworkz.hospital.apollotech.constants.BloodGroup;
import com.xworkz.com.xworkz.hospital.apollotech.constants.Gender;
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
    private Gender gender;
    private String diseaseName;
    private BloodGroup bloodGroup;

}
