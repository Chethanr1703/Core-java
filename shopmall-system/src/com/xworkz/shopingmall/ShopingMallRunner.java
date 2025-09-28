package com.xworkz.shopingmall;

import com.xworkz.shopingmall.constants.Floor;
import com.xworkz.shopingmall.shop.Shop;

import com.xworkz.shopingmall.shopingmall.impl.ShopingMallImpl;
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
//        shopingMall.getShopDetails();

        // fetchOperation


            String input;
            do {
                System.out.println("press #1 to fetch Shop Name by id");
                System.out.println("press #2 to fetch Shop Type by id");
                System.out.println("press #3 to fetch Shop Address by id");
                System.out.println("press #4 to fetch Shop Id by Name");
                System.out.println("press #5 to fetch Shop Address by Name");
                System.out.println("press #6 to fetch Shop Details by id");
                System.out.println("press #7 to update Shop Name by id");
                System.out.println("press #8 to update Shop Address by id");
                System.out.println(" ");
                System.out.println("enter the option which you require");

                int option = scanner.nextInt();

                switch(option) {
                    case 1:
                        System.out.println("enter the id to get Shop Name");
                        String shopName = shopingMall.getNameByShopId(scanner.nextInt());
                        System.out.println(shopName);
                        break;
                    case 2:
                        System.out.println("enter the id to get Shop Type");
                        String type = shopingMall.getShopTypeByShopId(scanner.nextInt());
                        System.out.println(type);
                        break;
                    case 3:
                        System.out.println("enter the id to get Shop Address");
                        String address = shopingMall.getAddressByShopId(scanner.nextInt());
                        System.out.println(address);
                        break;
                    case 4:
                        System.out.println("enter the Shop Name to get Id");
                        int id = shopingMall.getIdByShopName(scanner.next());
                        System.out.println(id);
                        break;
                    case 5:
                        System.out.println("enter the Shop Name to get Shop Address");
                        address = shopingMall.getAddressByShopName(scanner.next());
                        System.out.println(address);
                        break;
                    case 6:
                        System.out.println("enter the id to get Shop Details");
                        Shop shop = shopingMall.getShopById(scanner.nextInt());
                        shopingMall.getShopDetails(shop);
                        break;
                    case 7:
                        System.out.println("enter the id to update Shop Name");
                        id = scanner.nextInt();
                        System.out.println("enter the updated Shop Name");
                        shopName = scanner.next();
                        boolean isShopNameUpdated = shopingMall.updateNameByShopId(id, shopName);
                        System.out.println(isShopNameUpdated);
                        if(isShopNameUpdated) {
                            System.out.println(isShopNameUpdated);
//                            shopingMall.getShopDetails();
                        }
                        break;
                    case 8:
                        System.out.println("enter the id to update Shop Address");
                        id = scanner.nextInt();
                        System.out.println("enter the updated Shop Address");
                        address = scanner.next();
                        boolean isShopAddressUpdated = shopingMall.updateAddressByShopId(id, address);
                        System.out.println(isShopAddressUpdated);
                        if(isShopAddressUpdated) {
//                            shopingMall.getShopDetails();
                            System.out.println(isShopAddressUpdated);
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


