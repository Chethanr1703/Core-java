package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.productvalidator.ProductValidator;

public class Amazon {
    Product productInfo;

    public boolean isProductAdded(Product productInfo) {

        ProductValidator productValidator = new ProductValidator();
        boolean isInfoValid = productValidator.isProductInfoValid(productInfo);

        if (isInfoValid) {
            this.productInfo = productInfo;
        } else {
            System.out.println("the details of the product is not valid");
        }
        return isInfoValid;
    }

    public void getProductInfo() {
        System.out.println("the id of the product is  " + productInfo.getProductId());
        System.out.println("the name of the product is  " + productInfo.getProductName());
        System.out.println("the type of the product is  " + productInfo.getProductType());
        System.out.println("the price of the product is  " + productInfo.getProductPrice());
        System.out.println("the mfg date of the product is  " + productInfo.getMfgDate());

    }

    public boolean updateProductPrice(double price) {
        boolean isPriceUpdated = false;
        if (price > 0) {
            productInfo.setProductPrice(price);
            isPriceUpdated = true;
        } else {
            System.out.println("price is not updated");
        }
        return isPriceUpdated;
    }

    public boolean updateProduct(double price,String product) {
        boolean isUpdated = false;
        if (price > 0 && product!=null) {
            productInfo.setProductPrice(price);
            productInfo.setProductName(product);
            isUpdated = true;
        } else {
            System.out.println("price is not updated");
        }
        return isUpdated;
    }
}

