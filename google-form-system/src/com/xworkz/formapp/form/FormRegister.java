package com.xworkz.formapp.form;

public class FormRegister {
    private String  givenName;
    private String surName;
    private String dob;
    private long phoneNumber;
    private String gender;
    private int age;
    private String qualification;


    public void setGivenName(String givenName){
        this.givenName=givenName;
    }
    public String getGivenName(){
        return  givenName;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }
    public String getSurName(){
        return surName;
    }
    public void setDob(String dob){
        this.dob=dob;
    }
    public String getDob(){
        return dob;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return  gender;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    public String getQualification(){
        return qualification;
    }
}
