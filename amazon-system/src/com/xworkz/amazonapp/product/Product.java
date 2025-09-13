package com.xworkz.amazonapp.product;

import com.xworkz.amazonapp.constants.Washable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
public class Product {
    private int productId;
    private String productName;
    private String productType;
    private double productPrice;
   private String mfgDate;
   private Washable washable;

//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public void setProductType(String productType) {
//        this.productType = productType;
//    }
//
//    public String getProductType() {
//        return productType;
//    }
//
//    public void setProductPrice(double productPrice) {
//        this.productPrice = productPrice;
//    }
//
//    public double getProductPrice() {
//        return productPrice;
//    }
//
//    public void setMfgDate(String mfgDate) {
//        this.mfgDate = mfgDate;
//    }
//
//    public String getMfgDate() {
//        return mfgDate;
//    }
}
