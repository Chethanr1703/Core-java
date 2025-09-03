package com.xworkz.shopingmall.shopingmall;

import com.xworkz.shopingmall.shop.Shop;
import com.xworkz.shopingmall.shopvalidator.ShopValidator;

public class ShopingMall {
    Shop shops[]= new Shop[13];
    int index;

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
}
