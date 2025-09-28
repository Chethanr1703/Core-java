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
        watchShop.getDetailsWatch();


        System.out.println("enter the modelname to get company name ");
        String companyName = watchShop.getCompanyNameByModelName(scanner.next());
        System.out.println(companyName);

        System.out.println("enter the id to get company name ");
         companyName = watchShop.getCompanyNameById(scanner.nextInt());
        System.out.println(companyName);

        System.out.println("enter the id to get price ");
        double price = watchShop.getPriceByid(scanner.nextInt());
        System.out.println(price);

        System.out.println("enter the id to get warrrent  ");
        String warrrent = watchShop.getWarrentyById(scanner.nextInt());
        System.out.println(warrrent);

        System.out.println("enter the id to get water resistant ");
        WaterResistant waterResistant = watchShop.getWaterResistantById(scanner.nextInt());
        System.out.println(waterResistant);
//
        System.out.println("enter the id to get modelName  ");
        String modelName = watchShop.getModelnameById(scanner.nextInt());
        System.out.println(modelName);

        System.out.println("enter the modelname to get price ");
         price = watchShop.getPriceByModelName(scanner.next());
        System.out.println(price);

        System.out.println("enter the modelname to get waterResistant ");
         waterResistant = watchShop.getWaterResistantByModelName(scanner.next());
        System.out.println(waterResistant);

        System.out.println("enter id to get Watch details");
        Watch watch = watchShop.getWatchById(scanner.nextInt());
        watchShop.getDetailsWatch(watch);

        //update
        System.out.println("enter the id to update model name");
        int id = scanner.nextInt();
        System.out.println("enter the updated model name");
        modelName = scanner.next();
        boolean isModelNameUpdated = watchShop.updateModelNameById(id,modelName);
        if(isModelNameUpdated){
            watchShop.getDetailsWatch();
        }

        System.out.println("enter the model name to update company name");
         modelName = scanner.next();
        System.out.println("enter the updated model name");
        companyName = scanner.next();
        boolean isCompanyNameUpdated = watchShop.updateCompanyNameByModelName(modelName,companyName);
        if(isCompanyNameUpdated){
            watchShop.getDetailsWatch();
        }

        System.out.println("enter the model name to update the water resistant of the watch");
        modelName = scanner.next();
        System.out.println("enter the updated water resistant");
         waterResistant = WaterResistant.valueOf(scanner.next().toUpperCase());
         boolean isWaterResitantUpdated = watchShop.updateWaterResistantByModelName(modelName,waterResistant);
         if(isWaterResitantUpdated){
             watchShop.getDetailsWatch();
         }



    }
}
