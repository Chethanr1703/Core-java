package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.productvalidator.ProductValidator;

public class Amazon {
    Product products[]= new Product[19];
    int index;

    public boolean isProductAdded(Product product1Info) {

        ProductValidator productValidator = new ProductValidator();
        boolean isInfoValid = productValidator.isProductInfoValid(product1Info);

        if (isInfoValid) {
//            this.productInfo = productInfo;
            products[index]= product1Info;
            index++;
        } else {
            System.out.println("the details of the product is not valid");
        }
        return isInfoValid;
    }

    public void getProductInfo() {
        for(Product product :products){
        System.out.println("the id of the product is  " + product.getProductId());
        System.out.println("the name of the product is  " + product.getProductName());
        System.out.println("the type of the product is  " + product.getProductType());
        System.out.println("the price of the product is  " + product.getProductPrice());
        System.out.println("the mfg date of the product is  " + product.getMfgDate());
            System.out.println(" ");

    }}

//    public boolean updateProductPrice(double price) {
//        boolean isPriceUpdated = false;
//        if (price > 0) {
//            product1Info.setProductPrice(price);
//            isPriceUpdated = true;
//        } else {
//            System.out.println("price is not updated");
//        }
//        return isPriceUpdated;
//    }

//    public boolean updateProduct(double price,String product) {
//        boolean isUpdated = false;
//        if (price > 0 && product!=null) {
//            productInfo.setProductPrice(price);
//            productInfo.setProductName(product);
//            isUpdated = true;
//        } else {
//            System.out.println("price is not updated");
//        }
//        return isUpdated;
//    }
}

