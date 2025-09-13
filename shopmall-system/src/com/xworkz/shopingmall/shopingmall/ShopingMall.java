package com.xworkz.shopingmall.shopingmall;

import com.xworkz.shopingmall.shop.Shop;
import com.xworkz.shopingmall.shopvalidator.ShopValidator;

public class ShopingMall {
    Shop shops[];
    int index;

    public ShopingMall(int size){
        shops= new Shop[size];
    }

    public boolean isShopAdded(Shop shop){
        boolean isShopAdded=false;

        ShopValidator shopValidator = new ShopValidator();
       boolean shopValid= shopValidator.isDetailsValid(shop);
       if(shopValid==true){
//           this.shop=shop;
           shops[index]=shop;
           index++;
           isShopAdded=true;
       }else{
           System.out.println("the details of the shop is not valid");
       }
       return  isShopAdded;
    }
    public void getShopDetails(){
        for(Shop shop: shops) {
            System.out.println("the id of the shop is   " + shop.getShopId());
            System.out.println("the name of the shop is " + shop.getName());
            System.out.println("the typr of the shop is  " + shop.getShopType());
            System.out.println("the flor of the shop is   " + shop.getWhichFloor());
            System.out.println("the address off the shop is  " + shop.getAddress());
            System.out.println(" ");
        }
    }
    public void getShopDetails(Shop shop){

            System.out.println("the id of the shop is   " + shop.getShopId());
            System.out.println("the name of the shop is " + shop.getName());
            System.out.println("the typr of the shop is  " + shop.getShopType());
            System.out.println("the flor of the shop is   " + shop.getWhichFloor());
            System.out.println("the address off the shop is  " + shop.getAddress());
            System.out.println(" ");

    }

    //getOperation
    public String getNameByShopId(int shopId){
        String name = null;
        if(shopId != 0){
            for(Shop shop : shops){
                if(shop.getShopId() == shopId){
                    name = shop.getName();
                }
            }
        } else System.out.println("enter valid ID");
        return name;
    }

    public String getShopTypeByShopId(int shopId){
        String  type = null;
        if(shopId != 0){
            for(Shop shop : shops){
                if(shop.getShopId() == shopId){
                    type = shop.getShopType();
                }
            }
        } else System.out.println("enter valid ID");
        return type;
    }
    public String getAddressByShopId(int shopId){
        String address = null;
        if(shopId != 0){
            for(Shop shop : shops){
                if(shop.getShopId() == shopId){
                    address = shop.getAddress();
                }
            }
        } else System.out.println("enter valid ID");
        return address;
    }
    public int getIdByShopName(String name){
        int id = 0;
        if(name != null){
            for(Shop shop : shops){
                if(shop.getName().equalsIgnoreCase(name)){
                    id = shop.getShopId();
                }
            }
        } else System.out.println("enter valid name");
        return id;
    }
    public String getAddressByShopName(String name){
        String address = null;
        if(name != null){
            for(Shop shop : shops){
                if(shop.getName().equalsIgnoreCase(name)){
                    address = shop.getAddress();
                }
            }
        } else System.out.println("enter valid name");
        return address;
    }

    public Shop getShopById(int id){
        Shop shop =null;
        if(id>0){
            for(Shop shop1 :shops){
                if(shop1.getShopId()==id){
                    shop=shop1;
                }
            }
        }return shop;
    }
    //update

    public boolean updateNameByShopId(int shopId, String newName) {
        boolean isUpdated = false;
        if (shopId != 0) {
            for (Shop shop : shops) {
                if (shop.getShopId() == shopId) {
                    shop.setName(newName);
                    isUpdated = true;
                }
            }
        } else {
            System.out.println("Enter valid ID");
        }
        return isUpdated;
    }
    public boolean updateAddressByShopId(int shopId, String newAddress) {
        boolean isUpdated = false;
        if (shopId != 0) {
            for (Shop shop : shops) {
                if (shop.getShopId() == shopId) {
                    shop.setAddress(newAddress);
                    isUpdated = true;
                }
            }
        } else {
            System.out.println("Enter valid ID");
        }
        return isUpdated;
    }
}
