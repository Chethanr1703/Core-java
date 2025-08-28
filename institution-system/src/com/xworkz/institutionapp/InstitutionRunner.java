package com.xworkz.institutionapp;

import com.xworkz.institutionapp.institution.Institution;
import com.xworkz.institutionapp.xworkz.Xworkz;

public class InstitutionRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Institution institute1 = new Xworkz();
        institute1.toProvide();
        System.out.println("main ended");

    }
}
