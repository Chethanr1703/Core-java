package com.xworkz.institute.trainee;

import com.xworkz.institute.constants.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter@Getter@NoArgsConstructor
public class Trainee {
    private int id;
    private String name;
    private int noOfClassesTaken;
    private long phoneNumber;
    private Subject subject;


}
