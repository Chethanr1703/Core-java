package com.xworkz.shopingmall.shop;

public class Shop {
    private int  shopId;
    private String name;
    private String shopType;
    private int whichFloor;
    private String address;

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getShopType() {
        return shopType;
    }

    public void setWhichFloor(int whichFloor) {
        this.whichFloor = whichFloor;
    }

    public int getWhichFloor() {
        return whichFloor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
