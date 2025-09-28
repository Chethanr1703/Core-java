package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.constants.Washable;
import com.xworkz.amazonapp.product.Product;

public interface Amazon {
    boolean isProductAdded(Product product1Info);

    void getProductInfo();

    void getProductInfo(Product product);

    String getProductTypeByName(String productName);

    Product getProductById(int id);

    double getProductPriceByName(String productName);

    String getProductNameById(int id);

    double getPriceById(int id);

    String getMagfDateByid(int id);

    String getMagfDateByProductName(String productName);

    Washable getWashablebyproductName(String name);

    String getmfgDateById(int id);

    boolean updateProductPrice(double price);

    boolean updatePricebyId(int id, double price);

    boolean updateProductNameById(int id, String productName);

    boolean updateProductTypeByProductName(String productName, String productType);

    boolean updateProductTypeByID(String productType, int id);

    boolean updatedWashableByProductName(String productName, Washable washable);
}
