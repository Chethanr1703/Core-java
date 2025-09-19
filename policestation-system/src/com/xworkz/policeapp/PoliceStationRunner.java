package com.xworkz.policeapp;

import com.xworkz.policeapp.constants.Post;
import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;
import com.xworkz.policeapp.policestation.PoliceStationImpl;
import javafx.geometry.Pos;

import java.util.Scanner;

public class PoliceStationRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the police station");

        int size = scanner.nextInt();

        PoliceStation policeStation = new PoliceStationImpl(size);

        for (int index = 0; index<size ;index++){
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

        System.out.println("enter the id to get name");
       String name = policeStation.getNameById(scanner.nextInt());
        System.out.println(name);

        System.out.println("enter the id to get Post");
        Post post = policeStation.getPostById(scanner.nextInt());
        System.out.println(post);

        System.out.println("enter name to get Post");
        post = policeStation.getPostByName(scanner.next());
        System.out.println(post);

        System.out.println("enter name to get id");
        int id = policeStation.getIdByName(scanner.next());
        System.out.println(id);

        System.out.println("enter id to get salary");
        double salary = policeStation.getSalaryById(scanner.nextInt());
        System.out.println(salary);

        System.out.println("enter name to get salary");
        salary = policeStation.getSalaryByName(scanner.next());
        System.out.println(salary);

        System.out.println("enter id to get experience");
        int experience = policeStation.getExperienceById(scanner.nextInt());
        System.out.println(experience);

        System.out.println("enter name to get experience");
        experience = policeStation.getExperienceByName(scanner.next());
        System.out.println(experience);

        System.out.println("enter the id to get police");
         Police police = policeStation.getPoliceByid(scanner.nextInt());
         policeStation.getPoliceDetails(police);
         //update

        System.out.println("enter id to update police name");
         id = scanner.nextInt();
        System.out.println("enter updated name");
        name = scanner.next();
        boolean isNameUpdated= policeStation.updateNameById(id,name);
        if(isNameUpdated){
            policeStation.getPoliceDetails();
        }

        System.out.println("enter id to update Post");
        id = scanner.nextInt();
        System.out.println("enter updated post");
        Post post1 = Post.valueOf(scanner.next().toUpperCase());
        boolean isPostUpdated = policeStation.updatePostById(id,post1);
        if(isPostUpdated){
            policeStation.getPoliceDetails();
        }

        System.out.println("enter id to update salary");
        id = scanner.nextInt();
        System.out.println("enter updated salary");
        salary = scanner.nextDouble();
        boolean isSalaryupdated = policeStation.updateSalaryById(id,salary);
        if(isSalaryupdated){
            policeStation.getPoliceDetails();
        }
        System.out.println("enter id to update experience");
        id = scanner.nextInt();
        System.out.println("enter updated experience");
        experience = scanner.nextInt();
        boolean isExperienceUpdated = policeStation.updateExperienceById(id ,experience);
        if(isExperienceUpdated){
            policeStation.getPoliceDetails();
        }

    }
}
