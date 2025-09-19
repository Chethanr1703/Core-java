package com.xworkz.shopingmall.shopingmall;

import com.xworkz.shopingmall.shop.Shop;

public interface ShoppingMall {
    boolean isShopAdded(Shop shop);
    void getShopDetails();
    void getShopDetails(Shop shop);
    String getNameByShopId(int shopId);
    String getShopTypeByShopId(int shopId);
    String getAddressByShopId(int shopId);
    int getIdByShopName(String name);
    String getAddressByShopName(String name);
    Shop getShopById(int id);
    boolean updateNameByShopId(int shopId, String newName);
    boolean updateAddressByShopId(int shopId, String newAddress);

}
