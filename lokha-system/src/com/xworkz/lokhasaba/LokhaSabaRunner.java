package com.xworkz.lokhasaba;

import com.xworkz.lokhasaba.constants.Nationality;
import com.xworkz.lokhasaba.lokasaba.LokaSaba;
import com.xworkz.lokhasaba.lokasaba.LokhaSabaImpl;
import com.xworkz.lokhasaba.politician.Politician;

import java.util.Scanner;

public class LokhaSabaRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of politician :");
        int size = scanner.nextInt();

        LokaSaba lokhaSaba = new LokhaSabaImpl(size);

        for (int index=0; index<size ; index++){

            Politician politician = new Politician();

            System.out.println("Enter id :");
            politician.setId(scanner.nextInt());

            System.out.println("Enter name :");
            politician.setName(scanner.next());

            System.out.println("Enter Age :");
            politician.setAge(scanner.nextInt());

            System.out.println("Enter nationality");
            politician.setNationality(Nationality.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter constitution");
            politician.setConstitution(scanner.next());

            lokhaSaba.isPoliticionAdded(politician);

        }
        lokhaSaba.getDetails();


        System.out.println("enter  the id to get politician");
        Politician politician=lokhaSaba.getPoliticianById(scanner.nextInt());
       lokhaSaba.getDetails(politician);

        System.out.println("enter the id to get Nationality");
        Nationality nationality=lokhaSaba.getNationalityById(scanner.nextInt());
        System.out.println(nationality);

        System.out.println("enter  the id to get name");
        String name=lokhaSaba.getNameById(scanner.nextInt());
        System.out.println(name);

        System.out.println("enter the name to get id");
        int id = lokhaSaba.getIdByName(scanner.next());
        System.out.println(id);

        System.out.println("enter name to get constitution");
        String consttituition=lokhaSaba.getConstitutionByName(scanner.next());
        System.out.println(consttituition);

        System.out.println("enter id to get constitution");
        String constitution= lokhaSaba.getConstitutionById(scanner.nextInt());
        System.out.println(constitution);

        System.out.println("enter the id to get age");
        int age = lokhaSaba.getAgeById(scanner.nextInt());
        System.out.println(age);

        System.out.println("enter name to get age");
        int newAge=lokhaSaba.getAgeByName(scanner.next());
        System.out.println(newAge);

        //update
        System.out.println("enter the id to update name");
        int politicianId= scanner.nextInt();
        System.out.println("enter the updated name ");
         name = scanner.next();

        boolean isnameUpdatedByid=lokhaSaba.updateNameById(politicianId,name);
        if(isnameUpdatedByid){
            lokhaSaba.getDetails();
        }

        System.out.println("enter id to update constitution");
        id= scanner.nextInt();
        System.out.println("enter new constitution");
        constitution= scanner.next();
        boolean isConstitutionUpadtedById = lokhaSaba.updateConstitutionById(id,constitution);
        if(isConstitutionUpadtedById){
            lokhaSaba.getDetails();
        }

        System.out.println("enter id to update Age");
        id= scanner.nextInt();
        System.out.println("enter the updated age");
        age= scanner.nextInt();
        boolean isAgeUpdatedById= lokhaSaba.updateAgeById(id,age);
        if(isAgeUpdatedById){
            lokhaSaba.getDetails();
        }

        System.out.println("enter the id to updated Nationality");
        id= scanner.nextInt();
        System.out.println("enter the new nationality");
        nationality= Nationality.valueOf(scanner.next());
        boolean isNationalityUpdatedById=lokhaSaba.updateNationalityById(id,nationality);
        if(isNationalityUpdatedById){
            lokhaSaba.getDetails();
        }
    }
}
