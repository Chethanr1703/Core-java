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

        Shop shop2  = new Shop(102,"Balaji Cracker","Crackers",3,"Orian Mall");
        Shop shop3  = new Shop(103,"Meenakshi Textiles","Clothing",8,"Commercial Street");
        Shop shop4  = new Shop(104,"Lakshmi Electronics","Electronics",6,"Jayanagar");
        Shop shop5  = new Shop(105,"Fresh Mart","Supermarket",10,"Whitefield");
        Shop shop6  = new Shop(106,"Sapna Book House","Books",12,"Indiranagar");
        Shop shop7  = new Shop(107,"Krishna Bakery","Bakery",4,"Rajajinagar");
        Shop shop8  = new Shop(108,"Metro Footwear","Footwear",7,"Malleshwaram");
        Shop shop9  = new Shop(109,"HealthPlus Pharmacy","Medical",9,"Koramangala");
        Shop shop10 = new Shop(110,"Trends Fashion","Clothing",11,"Marathahalli");
        Shop shop11 = new Shop(111,"Cafe Aroma","Cafe",6,"BTM Layout");
        Shop shop12 = new Shop(112,"Royal Jewellers","Jewellery",5,"Basavanagudi");
        Shop shop13 = new Shop(113,"Green Leaf Veggies","Vegetables",8,"Hebbal");

        ShopingMall shopingMall=new ShopingMall();
        boolean isAdded =shopingMall.isShopAdded(shop1);

        isAdded = shopingMall.isShopAdded(shop2);
        isAdded = shopingMall.isShopAdded(shop3);
        isAdded = shopingMall.isShopAdded(shop4);
        isAdded = shopingMall.isShopAdded(shop5);
        isAdded = shopingMall.isShopAdded(shop6);
        isAdded = shopingMall.isShopAdded(shop7);
        isAdded = shopingMall.isShopAdded(shop8);
        isAdded = shopingMall.isShopAdded(shop9);
        isAdded = shopingMall.isShopAdded(shop10);
        isAdded = shopingMall.isShopAdded(shop11);
        isAdded = shopingMall.isShopAdded(shop12);
        isAdded = shopingMall.isShopAdded(shop13);

        if(isAdded==true){
            shopingMall.getShopDetails();
        }else{
            System.out.println("the details of the shop is not valid");
        }
    }
}
