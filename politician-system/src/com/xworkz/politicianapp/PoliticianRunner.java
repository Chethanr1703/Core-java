package com.xworkz.politicianapp;

import com.xworkz.politicianapp.politician.Politician;

public class PoliticianRunner {
    public static void main(String[] args) {
        Politician politician1= new Politician();
        politician1.setPoliticianId(5123);
        politician1.getPoliticianId();
        politician1.setName("Manirathna");
        politician1.getName();
        politician1.setNoOfvotes(160000);
        politician1.getNoOfvotes();
        politician1.getPoliticianInfo();
    }
}
