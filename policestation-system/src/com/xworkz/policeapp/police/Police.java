package com.xworkz.policeapp.police;

public class Police {
   private int policeId;
    private String typeOfPost;
    private String name;
    private double salary;
    private int experience;


    public void setPoliceId(int policeId) {
        this.policeId = policeId;
    }

    public int getPoliceId() {
        return policeId;
    }

    public void setTypeOfPost(String typeOfPost) {
        this.typeOfPost = typeOfPost;
    }

    public String getTypeOfPost() {
        return typeOfPost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
