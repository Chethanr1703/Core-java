package com.xworkz.shopingmall.shopingmall.impl;

import com.xworkz.shopingmall.exception.*;
import com.xworkz.shopingmall.shop.Shop;
import com.xworkz.shopingmall.shopingmall.ShoppingMall;
import com.xworkz.shopingmall.shopvalidator.ShopValidator;

public class ShopingMallImpl implements ShoppingMall {
    Shop shops[];
    int index;

    public ShopingMallImpl(int size) {
        shops = new Shop[size];
    }

    @Override
    public boolean isShopAdded(Shop shop) {
        boolean isShopAdded = false;

        ShopValidator shopValidator = new ShopValidator();
        boolean shopValid = shopValidator.isDetailsValid(shop);
        try {
            if (shopValid == true) {
//           this.shop=shop;
                shops[index] = shop;
                index++;
                isShopAdded = true;
            } else {
                throw new ShopNotAddedException("the details of the shop is not valid");
            }
        } catch (ShopNotAddedException e) {
            e.printStackTrace();
        }
        return isShopAdded;
    }

    @Override
    public void getShopDetails() {
        for (Shop shop : shops) {
            System.out.println("the id of the shop is   " + shop.getShopId());
            System.out.println("the name of the shop is " + shop.getName());
            System.out.println("the typr of the shop is  " + shop.getShopType());
            System.out.println("the flor of the shop is   " + shop.getWhichFloor());
            System.out.println("the address off the shop is  " + shop.getAddress());
            System.out.println(" ");
        }
    }

    @Override
    public void getShopDetails(Shop shop) {

        System.out.println("the id of the shop is   " + shop.getShopId());
        System.out.println("the name of the shop is " + shop.getName());
        System.out.println("the typr of the shop is  " + shop.getShopType());
        System.out.println("the flor of the shop is   " + shop.getWhichFloor());
        System.out.println("the address off the shop is  " + shop.getAddress());
        System.out.println(" ");

    }

    //getOperation
    @Override
    public String getNameByShopId(int shopId) {
        String name = null;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        name = shop.getName();
                    }
                }
            }
            if (name == null) {
                throw new NameNotFoundException("Name not found enetre the valid id");
            }
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public String getShopTypeByShopId(int shopId) {
        String type = null;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        type = shop.getShopType();
                    }
                }
            }
            if (type == null) {
                throw new ShopTypeNotFoundException("enter valid id to get shop type");
            }
        } catch (ShopTypeNotFoundException e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public String getAddressByShopId(int shopId) {
        String address = null;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        address = shop.getAddress();
                    }
                }
            }
            if (address == null) {
                throw new AddressNotFoundException("enter valid id to get shop address");
            }
        } catch (AddressNotFoundException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public int getIdByShopName(String name) {
        int id = 0;
        try {
            if (name != null) {
                for (Shop shop : shops) {
                    if (shop.getName().equalsIgnoreCase(name)) {
                        id = shop.getShopId();
                    }
                }
            }
            if (id < 0) {
                throw new ShopIdNotFoundException("enter valid name to get shop id");
            }
        } catch (ShopIdNotFoundException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public String getAddressByShopName(String name) {
        String address = null;
        try {
            if (name != null) {
                for (Shop shop : shops) {
                    if (shop.getName().equalsIgnoreCase(name)) {
                        address = shop.getAddress();
                    }
                }
            }
            if (address == null) {
                throw new AddressNotFoundException("enter valid name to get shop address");
            }
        } catch (AddressNotFoundException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public Shop getShopById(int id) {
        Shop shop = null;
        try {
            if (id > 0) {
                for (Shop shop1 : shops) {
                    if (shop1.getShopId() == id) {
                        shop = shop1;
                    }
                }
            }
            if (shop == null) {
                throw new ShopNotFoundException("enter valid id to get Shop info");
            }
        } catch (ShopNotFoundException e) {
            e.printStackTrace();
        }
        return shop;

    }

    //update
    @Override
    public boolean updateNameByShopId(int shopId, String newName) {
        boolean isUpdated = false;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        shop.setName(newName);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new ShopNameNotUpdatedException("Enter valid ID to update the name");
            }
        } catch (ShopNameNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateAddressByShopId(int shopId, String newAddress) {
        boolean isUpdated = false;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        shop.setAddress(newAddress);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new ShopAddressNotUpdatedException("Enter valid ID to update the address");
            }
        } catch (ShopAddressNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }
}
