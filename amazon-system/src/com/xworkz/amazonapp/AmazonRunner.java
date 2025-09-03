package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class AmazonRunner {
    public static void main(String[] args) {

        Product product1 =new Product();
        product1.setProductId(1);
        product1.setProductName("fan");
        product1.setProductType("home appliance");
        product1.setProductPrice(2000);
        product1.setMfgDate("25-2-2008");

        Amazon amazon= new Amazon();
        Product product3 = new Product(12,"laptop","electronics",75000.00,"24-05-2024");
        Product product4 = new Product(13,"heater","electronics",7500.00,"24-05-2024");
        Product product5 = new Product(14,"clock","electronics",5000.00,"24-05-2024");
        Product product6 = new Product(151,"power bank","electronics",2000.00,"24-05-2024");
        Product product7 = new Product(161,"phone","electronics",70000.00,"24-05-2024");
        Product product8 = new Product(171,"table fan","electronics",1500.00,"24-05-2024");
        Product product9 = new Product(181,"DVD","electronics",5000.00,"24-05-2024");
        Product product10 = new Product(921,"camera","electronics",75000.00,"24-05-2024");
        Product product11= new Product(121,"blender","electronics",5000.00,"24-05-2024");
        Product product12= new Product(123,"Scanner","electronics",5000.00,"24-05-2024");
        Product product13 = new Product(14,"printer","electronics",5000.00,"24-05-2024");
        Product product14 = new Product(125,"oven","electronics",5000.00,"24-05-2024");
        Product product15 = new Product(126,"headSet","electronics",3000.00,"24-05-2024");
        Product product16= new Product(127,"hearPhone","electronics",300.00,"24-05-2024");
        Product product17 = new Product(171,"pen drive","electronics",1000.00,"24-05-2024");
        Product product18 = new Product(127,"Sefie Stick","electronics",1000.00,"24-05-2024");
        Product product19 = new Product(123,"Charger","electronics",1000.00,"24-05-2024");
        Product product20 = new Product(129,"laptop camera","electronics",75000.00,"24-05-2024");

        boolean isAdded =amazon.isProductAdded(product1);

        isAdded=  amazon.isProductAdded(product3);

        isAdded=  amazon.isProductAdded(product4);
        isAdded=  amazon.isProductAdded(product5);
        isAdded=  amazon.isProductAdded(product6);
        isAdded=  amazon.isProductAdded(product7);
        isAdded=  amazon.isProductAdded(product8);
        isAdded=  amazon.isProductAdded(product9);
        isAdded=  amazon.isProductAdded(product10);
        isAdded=  amazon.isProductAdded(product11);
        isAdded=  amazon.isProductAdded(product12);
        isAdded=  amazon.isProductAdded(product13);
        isAdded=  amazon.isProductAdded(product14);
        isAdded=  amazon.isProductAdded(product15);
        isAdded=  amazon.isProductAdded(product16);
        isAdded=  amazon.isProductAdded(product17);
        isAdded=  amazon.isProductAdded(product18);
        isAdded=  amazon.isProductAdded(product19);
        isAdded=  amazon.isProductAdded(product20);





        if(isAdded){
            amazon.getProductInfo();
        }else{
            System.out.println("the Info of the product is not valid");
        }

//       boolean isPriceUpdated = amazon.updateProductPrice(3000.00);
//        if(isPriceUpdated){
//            amazon.getProductInfo();
//        }else{
//            System.out.println("price is not updated");
//        }

//        boolean isUpdated = amazon.updateProduct(3000.00,"table fan");
//        if(isUpdated){
//            amazon.getProductInfo();
//        }else{
//            System.out.println("price is not updated");
//        }

    }
}
