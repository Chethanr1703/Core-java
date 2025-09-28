package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.amazon.impl.AmazonImpl;
import com.xworkz.amazonapp.constants.Washable;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the size of the products");

        int size = scanner.nextInt();
        Amazon amazon = new AmazonImpl(size);

        for (int index = 0; index < size; index++) {

            Product product = new Product();
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
//        amazon.getProductInfo();

        String input = null;
        do {
            System.out.println("press #1 to fetch product Info by id");
            System.out.println("press #2 to fetch product type by product name");
            System.out.println("press #3  to fetch product price by product name");
            System.out.println("press #4 to fetch product name by product id");
            System.out.println("press #5 to fetch product price by product id");
            System.out.println("press #6 to fetch product mfgDate by product id");
            System.out.println("press #7 to fetch product mfgDate by product name");
            System.out.println("press #8 to fetch product Washable by product name");
            System.out.println("press #9 to update product name by product id");
            System.out.println("press #10 to update product type by product name");
            System.out.println("press #11 to update product price by product id");
            System.out.println("press #12 to update product type by product id");
            System.out.println("press #13 to update product Washable by product name");
            System.out.println("press #14 to fetch all the products");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter the id to get product ");
                    Product product = amazon.getProductById(scanner.nextInt());
                    amazon.getProductInfo(product);
                    break;
                case 2:
                    System.out.println("enter the product name to get product Type");
                    String type = amazon.getProductTypeByName(scanner.next());
                    System.out.println(type);
                    break;
                case 3:
                    System.out.println("enter the product name to get price ");
                    double price = amazon.getProductPriceByName(scanner.next());
                    System.out.println(price);
                    break;
                case 4:
                    System.out.println("enter the id to get product name");
                    String name = amazon.getProductNameById(scanner.nextInt());
                    System.out.println(name);
                    break;
                case 5:
                    System.out.println("enter the id to get product price");
                    price = amazon.getPriceById(scanner.nextInt());
                    System.out.println(price);
                    break;
                case 6:
                    System.out.println("enter the id to get product mfg date");
                    String mfgDate = amazon.getMagfDateByid(scanner.nextInt());
                    System.out.println(mfgDate);
                    break;
                case 7:
                    System.out.println("enter the product name to get product mfg date");
                    mfgDate = amazon.getMagfDateByProductName(scanner.next());
                    System.out.println(mfgDate);
                    break;
                case 8:
                    System.out.println("enter the product name to get product washable");
                    Washable washable = amazon.getWashablebyproductName(scanner.next());
                    System.out.println(washable);
                    break;

                case 9:
                    System.out.println("enter the product id to update productname ");
                    int id = scanner.nextInt();
                    System.out.println("enter the updated product name");
                    String pName = scanner.next();
                    boolean isProductnameUpdatedById = amazon.updateProductNameById(id, pName);
                    System.out.println(isProductnameUpdatedById);
                    if (isProductnameUpdatedById == true) {
//                        amazon.getProductInfo();
                        System.out.println(isProductnameUpdatedById);
                    } else System.out.println("not updated");
                    break;
                case 10:
                    System.out.println("enter the product name to update product type");
                    pName = scanner.next();
                    System.out.println("enter the updated product type");
                    String productType = scanner.next();
                    boolean isproductTypeUpdated = amazon.updateProductTypeByProductName(pName, productType);
                    System.out.println(isproductTypeUpdated);
                    if (isproductTypeUpdated == true) {
//                        amazon.getProductInfo();
                        System.out.println("type is updated");
                    } else System.out.println("not updated");
                    break;
                case 11:
                    System.out.println("enter the product id to update product price");
                    id = scanner.nextInt();
                    System.out.println("enter the updated product price");
                    double productPrice = scanner.nextDouble();
                    boolean isPriceUpdatedById = amazon.updatePricebyId(id, productPrice);
                    System.out.println(isPriceUpdatedById);
                    if (isPriceUpdatedById == true) {
//                        amazon.getProductInfo();
                        System.out.println("price is updated");
                    } else System.out.println("not updated");
                    break;
                case 12:
                    System.out.println("enter the id to update the product type");
                    id = scanner.nextInt();
                    System.out.println("enter the updated");
                    productType = scanner.next();
                    boolean isTypeUpdatedById = amazon.updateProductTypeByID(productType, id);
                    System.out.println(isTypeUpdatedById);
                    if (isTypeUpdatedById == true) {
//                        amazon.getProductInfo();
                        System.out.println("is type updated");
                    } else System.out.println("not updated");
                    break;
                case 13:
                    System.out.println("enter the product name to update washable ");
                    pName = scanner.next();
                    System.out.println("enter the updated washable for product");
                    Washable washable1 = Washable.valueOf(scanner.next().toUpperCase());
                    boolean isWashableUpdatedByName = amazon.updatedWashableByProductName(pName, washable1);
                    System.out.println(isWashableUpdatedByName);
                    if (isWashableUpdatedByName) {
//                        amazon.getProductInfo();
                        System.out.println("washable is updated");
                    } else System.out.println("not updated");
                case 14:
                    amazon.getProductInfo();
                    break;
                default:
                    System.out.println("the option entered is invalid");

            }
            System.out.println("Do want to continue yes / no");
            input = scanner.next();
        }while (input.equalsIgnoreCase("yes"));

        System.out.println("thank you for visiting......");


        // get operation or fetch operation


//        update operation


    }
}
