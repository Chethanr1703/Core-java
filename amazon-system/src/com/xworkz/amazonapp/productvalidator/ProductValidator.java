package com.xworkz.amazonapp.productvalidator;

import com.xworkz.amazonapp.product.Product;

public class ProductValidator {
    public boolean isProductInfoValid(Product productInfo) {
        boolean isProductInfoValid = false;

        boolean isIdValid = false;
        boolean isProductNameValid = false;
        boolean isTypeValid = false;
        boolean isPricevalid = false;
        boolean isMfgDatevalid = false;

        if (productInfo.getProductId() > 0) {
            isIdValid = true;
        } else {
            System.out.println("the id of the product is not valid");
        }
        if (productInfo.getProductName() != null && !productInfo.getProductName().isEmpty()) {
            isProductNameValid = true;
        } else {
            System.out.println("the name of the product is not valid");
        }
        if (productInfo.getProductType() != null && !productInfo.getProductType().isEmpty()) {
            isTypeValid = true;
        } else {
            System.out.println("the product type of the product is not valid");
        }
        if (productInfo.getProductPrice() > 0.0) {
            isPricevalid = true;
        } else {
            System.out.println("the price of the product is not valid");
        }
        if (productInfo.getMfgDate() != null && !productInfo.getMfgDate().isEmpty()) {
            isMfgDatevalid = true;
        } else {
            System.out.println("the mfg date of the product is not valid");
        }

        if (isIdValid && isProductNameValid && isTypeValid && isPricevalid && isMfgDatevalid) {
            isProductInfoValid = true;
        } else {
            System.out.println("the  product info  is not valid");
        }
        return isProductInfoValid;
    }


}
