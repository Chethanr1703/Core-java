package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.amazon.AmazonImpl;
import com.xworkz.amazonapp.constants.Washable;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the size of the products");

        int size = scanner.nextInt();
        Amazon amazon= new AmazonImpl(size);
        for(int index =0;index<size;index++){

            Product product= new Product();
            System.out.println("enter the id ");
            product.setProductId(scanner.nextInt());
            System.out.println("enter the product name ");
            product.setProductName(scanner.next());
            System.out.println("enter the product type");
            product.setProductType(scanner.next());
            System.out.println("enter the price");
            product.setProductPrice(scanner.nextDouble());
            System.out.println("enter the magf date");
            product.setMfgDate(scanner.next());
            System.out.println("enter the iswashable");
            product.setWashable(Washable.valueOf(scanner.next().toUpperCase()));
            amazon.isProductAdded(product);

        }
        amazon.getProductInfo();

        // get operation or fetch operation
        System.out.println("enter the id to get product name");
        Product  product = amazon.getProductById(scanner.nextInt());
       amazon.getProductInfo(product);

        System.out.println("enter the product name to get product Type");
        String type=amazon.getProductTypeByName(scanner.next());
        System.out.println(type);

        System.out.println("enter the product name to get price ");
        double price  = amazon.getProductPriceByName(scanner.next());
        System.out.println(price);

        System.out.println("enter the id to get product name");
        String name = amazon.getProductNameById(scanner.nextInt());
        System.out.println(name);

        System.out.println("enter the id to get product price");
         price = amazon.getPriceById(scanner.nextInt());
        System.out.println(price);

        System.out.println("enter the id to get product mfg date");
        String mfgDate = amazon.getMagfDateByid(scanner.nextInt());
        System.out.println(mfgDate);

        System.out.println("enter the product name to get product mfg date");
         mfgDate = amazon.getMagfDateByProductName(scanner.next());
        System.out.println(mfgDate);

        System.out.println("enter the product name to get product washable");
        Washable washable = amazon.getWashablebyproductName(scanner.next());
        System.out.println(washable);

        System.out.println("enter the product mfgDate to get product id");
        mfgDate = amazon.getmfgDateById(scanner.nextInt());
        System.out.println(mfgDate);

//        update operation

        System.out.println("enter the product id to update productname ");
        boolean isProductnameUpdatedById = amazon.updateProductNameById(1,"table");
        System.out.println(isProductnameUpdatedById);
        if(isProductnameUpdatedById==true){
            amazon.getProductInfo();
        }else System.out.println("not updated");


        System.out.println("enter the product name to update product type");
        boolean isproductTypeUpdated = amazon.updateProductTypeByProductName("fan","electronic");
        System.out.println(isproductTypeUpdated);
        if(isproductTypeUpdated==true){
            amazon.getProductInfo();
        }else System.out.println("not updated");


        System.out.println("enter the product id to update product price");
        boolean isPriceUpdatedById = amazon.updatePricebyId(1,5000.00);
        System.out.println(isPriceUpdatedById);
        if(isPriceUpdatedById==true){
            amazon.getProductInfo();
        }else System.out.println("not updated");

        System.out.println("enter the id to update the product type");
        boolean isTypeUpdatedById = amazon.updateProductTypeByID("wood",1);
        System.out.println(isTypeUpdatedById);
       if(isPriceUpdatedById==true){
           amazon.getProductInfo();
       }else System.out.println("not updated");

       System.out.println("enter the product name to update washable ");
       boolean isWashableUpdatedByName= amazon.updatedWashableByProductName(scanner.next(),Washable.YES);
        System.out.println(isWashableUpdatedByName);
        if(isWashableUpdatedByName){
            amazon.getProductInfo();
        }else System.out.println("not updated");







    }
}
