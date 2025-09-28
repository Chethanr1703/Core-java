package com.xworkz.policeapp;

import com.xworkz.policeapp.constants.Post;
import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;
import com.xworkz.policeapp.policestation.impl.PoliceStationImpl;

import java.util.Scanner;

public class PoliceStationRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the police station");

        int size = scanner.nextInt();

        PoliceStation policeStation = new PoliceStationImpl(size);

        for (int index = 0; index < size; index++) {
            Police police = new Police();
            System.out.println("enter the id of the police ");
            police.setPoliceId(scanner.nextInt());

            System.out.println("enter the type of post");
            police.setTypeOfPost(Post.valueOf(scanner.next().toUpperCase()));

            System.out.println("enter the name of the police");
            police.setName(scanner.next());


            System.out.println("enter the salary ");
            police.setSalary(scanner.nextDouble());


            System.out.println("enter the experince");
            police.setExperience(scanner.nextInt());

            policeStation.isPoliceAdded(police);
        }
        policeStation.getPoliceDetails();


        // fetch
        String input = null;
        do {
            System.out.println("press #1 to fetch Name by id");
            System.out.println("press #2 to fetch Post by id");
            System.out.println("press #3 to fetch Post by Name");
            System.out.println("press #4 to fetch Id by Name");
            System.out.println("press #5 to fetch Salary by id");
            System.out.println("press #6 to fetch Salary by Name");
            System.out.println("press #7 to fetch Experience by id");
            System.out.println("press #8 to fetch Experience by Name");
            System.out.println("press #9 to fetch Police by id");
            System.out.println("press #10 to update Name by id");
            System.out.println("press #11 to update Post by id");
            System.out.println("press #12 to update Salary by id");
            System.out.println("press #13 to update Experience by id");
            System.out.println(" ");
            System.out.println("enter the option which you require");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter the id to get Name");
                    String name = policeStation.getNameById(scanner.nextInt());
                    System.out.println(name);
                    break;
                case 2:
                    System.out.println("enter the id to get Post");
                    Post post = policeStation.getPostById(scanner.nextInt());
                    System.out.println(post);
                    break;
                case 3:
                    System.out.println("enter Name to get Post");
                    post = policeStation.getPostByName(scanner.next());
                    System.out.println(post);
                    break;
                case 4:
                    System.out.println("enter Name to get Id");
                    int id = policeStation.getIdByName(scanner.next());
                    System.out.println(id);
                    break;
                case 5:
                    System.out.println("enter the id to get Salary");
                    double salary = policeStation.getSalaryById(scanner.nextInt());
                    System.out.println(salary);
                    break;
                case 6:
                    System.out.println("enter Name to get Salary");
                    salary = policeStation.getSalaryByName(scanner.next());
                    System.out.println(salary);
                    break;
                case 7:
                    System.out.println("enter the id to get Experience");
                    int experience = policeStation.getExperienceById(scanner.nextInt());
                    System.out.println(experience);
                    break;
                case 8:
                    System.out.println("enter Name to get Experience");
                    experience = policeStation.getExperienceByName(scanner.next());
                    System.out.println(experience);
                    break;
                case 9:
                    System.out.println("enter the id to get Police");
                    Police police = policeStation.getPoliceByid(scanner.nextInt());
                    policeStation.getPoliceDetails(police);
                    break;
                case 10:
                    System.out.println("enter id to update Name");
                    id = scanner.nextInt();
                    System.out.println("enter updated Name");
                    name = scanner.next();
                    boolean isNameUpdated = policeStation.updateNameById(id, name);
                    System.out.println(isNameUpdated);
                    if (isNameUpdated) {
                        System.out.println(isNameUpdated);
//                        policeStation.getPoliceDetails();
                    }
                    break;
                case 11:
                    System.out.println("enter id to update Post");
                    id = scanner.nextInt();
                    System.out.println("enter updated Post");
                    Post post1 = Post.valueOf(scanner.next().toUpperCase());
                    boolean isPostUpdated = policeStation.updatePostById(id, post1);
                    System.out.println(isPostUpdated);
                    if (isPostUpdated) {
                        System.out.println(isPostUpdated);
//                        policeStation.getPoliceDetails();
                    }
                    break;
                case 12:
                    System.out.println("enter id to update Salary");
                    id = scanner.nextInt();
                    System.out.println("enter updated Salary");
                    salary = scanner.nextDouble();
                    boolean isSalaryUpdated = policeStation.updateSalaryById(id, salary);
                    System.out.println(isSalaryUpdated);
                    if (isSalaryUpdated) {
                        System.out.println(isSalaryUpdated);
//                        policeStation.getPoliceDetails();
                    }
                    break;
                case 13:
                    System.out.println("enter id to update Experience");
                    id = scanner.nextInt();
                    System.out.println("enter updated Experience");
                    experience = scanner.nextInt();
                    boolean isExperienceUpdated = policeStation.updateExperienceById(id, experience);
                    System.out.println(isExperienceUpdated);
                    if (isExperienceUpdated) {
                        System.out.println(isExperienceUpdated);
//                        policeStation.getPoliceDetails();
                    }
                    break;
                case 14:
                    policeStation.getPoliceDetails();
                    break;
                default:
                    System.out.println("you entered wrong option");
            }

            System.out.println("do you want to continue yes / no ");
            input = scanner.next();

        } while (input.equalsIgnoreCase("yes"));

        System.out.println("thank you for visiting this app ........");

    }
}
