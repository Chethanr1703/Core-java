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

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setNoOfClassesTaken(int noOfClassesTaken) {
//        this.noOfClassesTaken = noOfClassesTaken;
//    }
//
//    public int getNoOfClassesTaken() {
//        return noOfClassesTaken;
//    }
//
//    public void setPhoneNumber(long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
}
