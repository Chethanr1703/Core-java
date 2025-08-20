package com.xworkz.lokhasaba.politician;

public class Politician {
    private int id;
    private String name;
    private String constitution;
    private int age;
    private String nationality;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setConstitution(String constitution) {
        this.constitution = constitution;
    }

    public String getConstitution() {
        return constitution;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNationality(String indian) {
        nationality = indian;
    }

    public String getNationality() {
        return nationality;
    }
}
