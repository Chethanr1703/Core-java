package com.xworkz.shopingmall;

import com.xworkz.shopingmall.constants.Floor;
import com.xworkz.shopingmall.shop.Shop;

import com.xworkz.shopingmall.shopingmall.ShopingMallImpl;
import com.xworkz.shopingmall.shopingmall.ShoppingMall;

import java.util.Scanner;

public class ShopingMallRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of shops :");
        int size = scanner.nextInt();

        ShoppingMall shopingMall = new ShopingMallImpl(size);

        for (int index = 0; index < size; index++) {

            Shop shop = new Shop();

            System.out.println("Enter id :");
            shop.setShopId(scanner.nextInt());

            System.out.println("Enter name :");
            shop.setName(scanner.next());

            System.out.println("enter the shop type");
            shop.setShopType(scanner.next());

            System.out.println("enter the floor ");
            shop.setWhichFloor(Floor.valueOf(scanner.next()));

            System.out.println("enter the address");
            shop.setAddress(scanner.next());

            shopingMall.isShopAdded(shop);
        }
        shopingMall.getShopDetails();

        // fetchOperation

        System.out.println("enter the id to get shop Name");
        String shopName = shopingMall.getNameByShopId(scanner.nextInt());
        System.out.println(shopName);

        System.out.println("enter the id to get shop type");
        String type = shopingMall.getShopTypeByShopId(scanner.nextInt());
        System.out.println(type);

        System.out.println("enter the id to get shop address");
        String address = shopingMall.getAddressByShopId(scanner.nextInt());
        System.out.println(address);

        System.out.println("enter the shop name to get id");
        int id = shopingMall.getIdByShopName(scanner.next());
        System.out.println(id);

        System.out.println("enter the shop name to get shop address");
         address = shopingMall.getAddressByShopName(scanner.next());
        System.out.println(address);

        System.out.println("enter the idto getShop details");
        Shop shop= shopingMall.getShopById(scanner.nextInt());
        shopingMall.getShopDetails(shop);

        //update
        System.out.println("enter the id to update shop name");
         id = scanner.nextInt();
        System.out.println("enter the updated shop name");
        shopName= scanner.next();
        boolean isShopNameUpdated= shopingMall.updateNameByShopId(id,shopName);
        if(isShopNameUpdated){
            shopingMall.getShopDetails();
        }

        System.out.println("enter the id to update shop Address");
        id = scanner.nextInt();
        System.out.println("enter the updated shop Address");
        address= scanner.next();
        boolean isShopAddressUpdated= shopingMall.updateAddressByShopId(id,address);
        if(isShopNameUpdated){
            shopingMall.getShopDetails();
        }




        }
    }

