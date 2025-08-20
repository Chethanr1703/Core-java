package com.xworkz.shopingmall;

import com.xworkz.shopingmall.shop.Shop;
import com.xworkz.shopingmall.shopingmall.ShopingMall;

public class ShopingMallRunner {
    public static void main(String[] args) {

        Shop shop1 =new Shop();
        shop1.setShopId(1);
        shop1.setName("BABA");
        shop1.setShopType("provision");
        shop1.setWhichFloor(2);
        shop1.setAddress("near sujatha Bus Stop");

        ShopingMall shopingMall=new ShopingMall();
        boolean isAdded =shopingMall.isShopAdded(shop1);
        if(isAdded==true){
            shopingMall.getShopDetails();
        }else{
            System.out.println("the details of the shop is not valid");
        }
    }
}
