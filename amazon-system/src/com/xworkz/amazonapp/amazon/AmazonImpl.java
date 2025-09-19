package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.constants.Washable;
import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.productvalidator.ProductValidator;

public class AmazonImpl implements Amazon{
    Product products[];
    int index;

   public AmazonImpl(int size){
        products =new Product[size];
    }

    @Override
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
    @Override
    public void getProductInfo() {
        for(Product product :products){
        System.out.println("the id of the product is  " + product.getProductId());
        System.out.println("the name of the product is  " + product.getProductName());
        System.out.println("the type of the product is  " + product.getProductType());
        System.out.println("the price of the product is  " + product.getProductPrice());
        System.out.println("the mfg date of the product is  " + product.getMfgDate());
            System.out.println("is product are washable "+product.getWashable());
            System.out.println(" "+"");

    }}
    @Override
    public void getProductInfo(Product product) {

            System.out.println("the id of the product is  " + product.getProductId());
            System.out.println("the name of the product is  " + product.getProductName());
            System.out.println("the type of the product is  " + product.getProductType());
            System.out.println("the price of the product is  " + product.getProductPrice());
            System.out.println("the mfg date of the product is  " + product.getMfgDate());
            System.out.println("is product are washable "+product.getWashable());
            System.out.println(" "+"");

        }
    @Override

    public String getProductTypeByName(String productName){
        String productType= null;

        if(productName!=null){
            for(Product product :products){
                if(product.getProductName().equals(productName)){
                    productType=product.getProductType();
                }
            }
        }
            return productType;
    }
    @Override
    public Product getProductById(int id){
       Product product =null;
       if(id>0){
           for (Product product1:products){
               if(product1.getProductId()==id){
                   product=product1;
               }
           }
       }return product;
    }

    @Override
   public double getProductPriceByName(String productName){
       double price= 0.0;
       if(productName!= null){
           for(Product product:products){
               if(product.getProductName().equals(productName)){
                   price = product.getProductPrice();
               }
           }
       }if(price==0.0) System.out.println("the name of the product is not valid");

       return  price;
   }
@Override
   public String getProductNameById(int id){
       String productName = null;
       if(id!=0){
           for(Product product :products){
               if(product.getProductId()==id){
                   productName=product.getProductName();
               }
           }
       }if(productName==null ) System.out.println("the id is not valid");

       return productName;
   }
@Override
   public double getPriceById(int id){
       double price = 0.0;
       if(id!=0){
           for(Product product : products){
               if(product.getProductId()==id){
                   price = product.getProductPrice();
               }
           }
       }if(price ==0.0) System.out.println("the id is not valid");
       return price;
   }
    @Override
   public String getMagfDateByid(int id){
       String magfDate =null;
       if(magfDate!=null){
           for(Product product :products){
               if(product.getProductId()==id){
                   magfDate = product.getMfgDate();
               }
           }
       }if(magfDate==null) System.out.println("the id is not valid to get date");

       return magfDate;
   }
   @Override
    public String getMagfDateByProductName(String  productName){
        String magfDate =null;
        if(magfDate!=null){
            for(Product product :products){
                if(product.getProductName().equals(productName)){
                    magfDate = product.getMfgDate();
                }
            }
        }if(magfDate==null) System.out.println("the id is not valid to get date");

        return magfDate;
    }
    @Override
    public Washable getWashablebyproductName(String name){
        Washable washable=null;
       if(name!=null){
           for(Product product :products){
               if(product.getProductName().equals(name)){
                   washable=product.getWashable();

               }
           }
       }return washable;
    }

    @Override
    public String getmfgDateById(int id){
       String mfgDate=null;
       if(mfgDate!=null){
           for(Product product : products){
               if(product.getProductId() == id){
                   mfgDate = product.getMfgDate();
               }
           }
       }if(mfgDate== null) System.out.println("id ");

       return  mfgDate;
    }



    @Override
    public boolean updateProductPrice(double price) {
        boolean isPriceUpdated = false;
        if (price > 0) {
            products[1].setProductPrice(price);
            isPriceUpdated = true;
        } else {
            System.out.println("price is not updated");
        }
        return isPriceUpdated;
  }



    @Override

    public boolean updatePricebyId(int id , double price){
       boolean updatePrice = false;
       for( Product product : products){
           if(id== product.getProductId()){
               product.setProductPrice(price);
               updatePrice=true;
           }
       }if(updatePrice==false) System.out.println("invalid Id ");
       return  updatePrice;
    }

    @Override
    public boolean  updateProductNameById(int id ,String productName){
        boolean isIdUpdated = false;
        if(productName!=null){
            for(Product product: products){
                if(product.getProductId()==id){
                   product.setProductName(productName);
                   isIdUpdated=true;
                }

            }
        }if(isIdUpdated==false) System.out.println("the id entered to get productname is not valid");


        return   isIdUpdated;
    }
    @Override
    public  boolean updateProductTypeByProductName(String productName ,String productType){
       boolean isProducttypeUpdated = false;
       if(productName!=null){
           for (Product product : products){
               if(product.getProductName().equals(productName)){
                   product.setProductType(productType);
                   isProducttypeUpdated=true;
               }
           }
       }if(isProducttypeUpdated==false ) System.out.println("the product name to update producttype is not valid");


       return  isProducttypeUpdated;
    }
    @Override
    public boolean updateProductTypeByID(String productType, int id){
       boolean isProductTypeUpdatedByid=false;
       if(id!=0){
           for(Product product:products){
               if(product.getProductId()==id){
                   product.setProductType(productType);
                   isProductTypeUpdatedByid=true;
               }
           }
       }if(isProductTypeUpdatedByid==false) System.out.println("id given to update product type is not valid");


       return  isProductTypeUpdatedByid;
    }
    @Override

    public boolean updatedWashableByProductName(String productName ,Washable washable){
       boolean isWashableUpadtedByName=false;
       if(productName!= null){
           for(Product product:products){
               if(product.getProductName().equals(productName)){
                   product.setWashable(washable);
                   isWashableUpadtedByName=true;

               }
           }
       }if(isWashableUpadtedByName==false) System.out.println("the product name given to update the washable is not valid");

       return  isWashableUpadtedByName;
    }
}



