package com.xworkz.lokhasaba;

import com.xworkz.lokhasaba.constants.Nationality;
import com.xworkz.lokhasaba.lokasaba.LokaSaba;
import com.xworkz.lokhasaba.lokasaba.impl.LokhaSabaImpl;
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
//        lokhaSaba.getDetails();

        String input = null;
        do {
            System.out.println("press #1 to fetch Politician by id");
            System.out.println("press #2 to fetch Nationality by id");
            System.out.println("press #3 to fetch Name by id");
            System.out.println("press #4 to fetch Id by Name");
            System.out.println("press #5 to fetch Constitution by Name");
            System.out.println("press #6 to fetch Constitution by id");
            System.out.println("press #7 to fetch Age by id");
            System.out.println("press #8 to fetch Age by Name");
            System.out.println("press #9 to update Name by id");
            System.out.println("press #10 to update Constitution by id");
            System.out.println("press #11 to update Age by id");
            System.out.println("press #12 to update Nationality by id");
            System.out.println(" ");
            System.out.println("enter the option which you require");

            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.println("enter the id to get politician");
                    Politician politician = lokhaSaba.getPoliticianById(scanner.nextInt());
                    lokhaSaba.getDetails(politician);
                    break;
                case 2:
                    System.out.println("enter the id to get Nationality");
                    Nationality nationality = lokhaSaba.getNationalityById(scanner.nextInt());
                    System.out.println(nationality);
                    break;
                case 3:
                    System.out.println("enter the id to get Name");
                    String name = lokhaSaba.getNameById(scanner.nextInt());
                    System.out.println(name);
                    break;
                case 4:
                    System.out.println("enter the Name to get Id");
                    int id = lokhaSaba.getIdByName(scanner.next());
                    System.out.println(id);
                    break;
                case 5:
                    System.out.println("enter Name to get Constitution");
                    String constitutionName = lokhaSaba.getConstitutionByName(scanner.next());
                    System.out.println(constitutionName);
                    break;
                case 6:
                    System.out.println("enter id to get Constitution");
                    String constitution = lokhaSaba.getConstitutionById(scanner.nextInt());
                    System.out.println(constitution);
                    break;
                case 7:
                    System.out.println("enter the id to get Age");
                    int age = lokhaSaba.getAgeById(scanner.nextInt());
                    System.out.println(age);
                    break;
                case 8:
                    System.out.println("enter Name to get Age");
                    int newAge = lokhaSaba.getAgeByName(scanner.next());
                    System.out.println(newAge);
                    break;
                case 9:
                    System.out.println("enter the id to update Name");
                    int politicianId = scanner.nextInt();
                    System.out.println("enter the updated Name");
                    name = scanner.next();
                    boolean isNameUpdated = lokhaSaba.updateNameById(politicianId, name);
                    System.out.println(isNameUpdated);
                    if(isNameUpdated) {
                        lokhaSaba.getDetails();
                    }
                    break;
                case 10:
                    System.out.println("enter id to update Constitution");
                    id = scanner.nextInt();
                    System.out.println("enter new Constitution");
                    constitution = scanner.next();
                    boolean isConstitutionUpdated = lokhaSaba.updateConstitutionById(id, constitution);
                    System.out.println(isConstitutionUpdated);
                    if(isConstitutionUpdated) {
                        lokhaSaba.getDetails();
                    }
                    break;
                case 11:
                    System.out.println("enter id to update Age");
                    id = scanner.nextInt();
                    System.out.println("enter the updated Age");
                    age = scanner.nextInt();
                    boolean isAgeUpdated = lokhaSaba.updateAgeById(id, age);
                    System.out.println(isAgeUpdated);
                    if(isAgeUpdated) {
                        lokhaSaba.getDetails();
                    }
                    break;
                case 12:
                    System.out.println("enter the id to update Nationality");
                    id = scanner.nextInt();
                    System.out.println("enter the new Nationality");
                    nationality = Nationality.valueOf(scanner.next().toUpperCase());
                    boolean isNationalityUpdated = lokhaSaba.updateNationalityById(id, nationality);
                    System.out.println(isNationalityUpdated);
                    if(isNationalityUpdated) {
                        lokhaSaba.getDetails();
                    }
                    break;
                default:
                    System.out.println("you entered wrong option");
            }

            System.out.println("do you want to continue yes / no ");
            input = scanner.next();

        } while(input.equalsIgnoreCase("yes"));

        System.out.println("thank you for visiting this app ........");


    }
}
