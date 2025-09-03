package com.xworkz.shopingmall.shopvalidator;

import com.xworkz.shopingmall.shop.Shop;

public class ShopValidator {
    public boolean isDetailsValid(Shop shop){
        boolean isDetailsValid=false;

        boolean isIdValid=false;
        boolean isNameValid=false;
        boolean isTypeValid=false;

        boolean isWhichFloorValid=false;
        boolean isAddressValid=false;

        if(shop.getShopId()>0){
            isIdValid=true;
        }else{
            System.out.println("the id of the shop is not valid");
        }
        if(shop.getName()!=null &&! shop.getName().isEmpty()){
            isNameValid=true;
        }else{
            System.out.println("the name of the shop is not valid");
        }
        if(shop.getShopType()!=null && !shop.getShopType().isEmpty()){
            isTypeValid=true;
        }else{
            System.out.println("the type of the shop is not valid");
        }
        if(shop.getWhichFloor()>0){
            isWhichFloorValid=true;
        }else{
            System.out.println("the floor of the shop is not valid");
        }
        if(shop.getAddress()!=null && !shop.getAddress().isEmpty()){
            isAddressValid=true;
        }else{
            System.out.println("the address of the shop is not valid");
        }
        if(isIdValid&&isNameValid&&isTypeValid&&isWhichFloorValid&&isAddressValid){
            isDetailsValid=true;
        }else{
            System.out.println("the info  of the shop is not valid");
        }

        return  isDetailsValid;

    }
}
