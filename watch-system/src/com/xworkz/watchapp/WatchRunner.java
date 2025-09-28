package com.xworkz.watchapp;

import com.xworkz.watchapp.contants.WaterResistant;
import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;
import com.xworkz.watchapp.watchshop.impl.WatchShopImpl;

import java.util.Scanner;

public class WatchRunner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the size of the watch");
        int size = scanner.nextInt();
        WatchShop watchShop =new WatchShopImpl(size);

        for (int index =0; index<size;index++){
            Watch watch = new Watch();

            System.out.println("enter the id of the0 watch ");
            watch.setId(scanner.nextInt());

            System.out.println("enter the company Name ");
            watch.setCompanyName(scanner.next());
            System.out.println("enter model name ");
            watch.setModelName(scanner.next());

            System.out.println("enter the price");
            watch.setPrice(scanner.nextDouble());

            System.out.println("enter the warrenty");
            watch.setWarrenty(scanner.next());

            // fetchin gwhole watch details
            System.out.println("is Watch is water resistant");
            watch.setWaterResistant(WaterResistant.valueOf(scanner.next().toUpperCase()));

            watchShop.isWatchAdded(watch);

        }
//        watchShop.getDetailsWatch();

String input= null;
do{
    System.out.println("");
    System.out.println("press #1 to fetch company Name by model name");
    System.out.println("press #2 to fetch company Name by Id");
    System.out.println("press #3 to fetch price by Id");
    System.out.println("press #4 to fetch warrenty by Id");
    System.out.println("press #5 to fetch water resistant by id");
    System.out.println("press #6 to fetch model name by id");
    System.out.println("press #7 to fetch price Details by model name");
    System.out.println("press #8 to fetch water resistant by model name");
    System.out.println("press #9 to fetch watch by id");
    System.out.println("press #10 to update Model Name by Id");
    System.out.println("press #11 to update model name by company Name");
    System.out.println("press #12 to update water resistant by model Name ");

    System.out.println(" ");
    System.out.println("enter the option which you require");

    int option = scanner.nextInt();
    switch (option) {
        case 1:
            System.out.println("enter the modelname to get company name ");
            String companyName = watchShop.getCompanyNameByModelName(scanner.next());
            System.out.println(companyName);
            break;
        case 2:
            System.out.println("enter the id to get company name ");
            companyName = watchShop.getCompanyNameById(scanner.nextInt());
            System.out.println(companyName);
            break;
        case 3:
            System.out.println("enter the id to get price ");
            double price = watchShop.getPriceByid(scanner.nextInt());
            System.out.println(price);
            break;
        case 4:
            System.out.println("enter the id to get warrrent  ");
            String warrrent = watchShop.getWarrentyById(scanner.nextInt());
            System.out.println(warrrent);
            break;
        case 5:

            System.out.println("enter the id to get water resistant ");
            WaterResistant waterResistant = watchShop.getWaterResistantById(scanner.nextInt());
            System.out.println(waterResistant);
            break;
        case 6:
            System.out.println("enter the id to get modelName  ");
            String modelName = watchShop.getModelnameById(scanner.nextInt());
            System.out.println(modelName);
            break;
        case 7:
            System.out.println("enter the modelname to get price ");
            price = watchShop.getPriceByModelName(scanner.next());
            System.out.println(price);
            break;
        case 8:
            System.out.println("enter the modelname to get waterResistant ");
            waterResistant = watchShop.getWaterResistantByModelName(scanner.next());
            System.out.println(waterResistant);
            break;
        case 9:
            System.out.println("enter id to get Watch details");
            Watch watch = watchShop.getWatchById(scanner.nextInt());
            watchShop.getDetailsWatch(watch);
            break;
        case 10:
            System.out.println("enter the id to update model name");
            int id = scanner.nextInt();
            System.out.println("enter the updated model name");
            modelName = scanner.next();
            boolean isModelNameUpdated = watchShop.updateModelNameById(id, modelName);
            if (isModelNameUpdated) {
                System.out.println(isModelNameUpdated);
//                watchShop.getDetailsWatch();
            }
            break;
        case 11:
            System.out.println("enter the model name to update company name");
            modelName = scanner.next();
            System.out.println("enter the updated model name");
            companyName = scanner.next();
            boolean isCompanyNameUpdated = watchShop.updateCompanyNameByModelName(modelName, companyName);
            if (isCompanyNameUpdated) {
                System.out.println(isCompanyNameUpdated);
//                watchShop.getDetailsWatch();
            }
            break;
        case 12:
            System.out.println("enter the model name to update the water resistant of the watch");
            modelName = scanner.next();
            System.out.println("enter the updated water resistant");
            waterResistant = WaterResistant.valueOf(scanner.next().toUpperCase());
            boolean isWaterResitantUpdated = watchShop.updateWaterResistantByModelName(modelName, waterResistant);
            if (isWaterResitantUpdated) {
                System.out.println(isWaterResitantUpdated);
            }
            break;
        case 13:
            watchShop.getDetailsWatch();
            break;
        default:
            System.out.println("please enter valid option ");


    }
    System.out.println("do you want to continue yes / no ");
    input = scanner.next();
}
    while (input.equalsIgnoreCase("yes"));
        System.out.println("thank you for visiting the app.....");

    }
}
