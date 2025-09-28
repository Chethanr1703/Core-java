package com.xworkz.amazonapp.amazon.impl;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.constants.Washable;
import com.xworkz.amazonapp.exception.*;
import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.productvalidator.ProductValidator;

public class AmazonImpl implements Amazon {
    Product products[];
    int index;

    public AmazonImpl(int size) {
        products = new Product[size];
    }

    @Override
    public boolean isProductAdded(Product product1Info) {
        ProductValidator productValidator = new ProductValidator();
        boolean isInfoValid = productValidator.isProductInfoValid(product1Info);
        try {
            if (isInfoValid) {
//            this.productInfo = productInfo;
                products[index] = product1Info;
                index++;
            } else {
                NoProductAddedException noPatientAddedException = new NoProductAddedException("the details of the product is not valid");
                throw noPatientAddedException;
            }
        } catch (NoProductAddedException e) {
            e.printStackTrace();
        }
        return isInfoValid;
    }

    @Override
    public void getProductInfo() {

        for (Product product : products) {
            System.out.println("the id of the product is  " + product.getProductId());
            System.out.println("the name of the product is  " + product.getProductName());
            System.out.println("the type of the product is  " + product.getProductType());
            System.out.println("the price of the product is  " + product.getProductPrice());
            System.out.println("the mfg date of the product is  " + product.getMfgDate());
            System.out.println("is product are washable " + product.getWashable());
            System.out.println(" " + "");
        }
    }

    @Override
    public void getProductInfo(Product product) {

            System.out.println("the id of the product is  " + product.getProductId());
            System.out.println("the name of the product is  " + product.getProductName());
            System.out.println("the type of the product is  " + product.getProductType());
            System.out.println("the price of the product is  " + product.getProductPrice());
            System.out.println("the mfg date of the product is  " + product.getMfgDate());
            System.out.println("is product are washable " + product.getWashable());
            System.out.println(" " + "");

//          ProductNotFoundException productNotFoundException= new ProductNotFoundException("product not found");
//        throw productNotFoundException;
//        }
//        }catch (ProductNotFoundException e){
//            e.printStackTrace();
//        }
    }

    @Override

    public String getProductTypeByName(String productName) {
        String productType = null;
        try {
            if (productName != null) {
                for (Product product : products) {
                    if (product.getProductName().equals(productName)) {
                        productType = product.getProductType();
                    }
                }
            } else {
                NotFoundProductTypeException notFoundProductTypeException = new NotFoundProductTypeException("product type is not found");
                throw notFoundProductTypeException;
            }

        } catch (NoProductAddedException e) {
            e.printStackTrace();
        }
        return productType;
    }

    @Override
    public Product getProductById(int id) {
        Product product = null;
        try {
            if (id > 0) {
                for (Product product1 : products) {
                    if (product1.getProductId() == id) {
                        product = product1;
                    }
                }
            } else {
                ProductNotFoundException productNotFound = new ProductNotFoundException("prodoct not found by fetching by id");
                throw productNotFound;
            }
        } catch (ProductNotFoundException e) {
            e.printStackTrace();

        }
        return product;
    }

    @Override
    public double getProductPriceByName(String productName) {
        double price = 0.0;
        try {
            if (productName != null) {
                for (Product product : products) {
                    if (product.getProductName().equals(productName)) {
                        price = product.getProductPrice();
                    }
                }
            } else if (price == 0.0) {
                ProductPriceNotFoundException productPriceNotFoundException = new ProductPriceNotFoundException("thr price not found");
                throw productPriceNotFoundException;
            }
        } catch (ProductPriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;
    }

    @Override
    public String getProductNameById(int id) {
        String productName = null;
        try {
            if (id != 0) {
                for (Product product : products) {
                    if (product.getProductId() == id) {
                        productName = product.getProductName();
                    }
                }
            }
            if (productName == null) {
                ProductNameNotFoundException productNameNotFoundException = new ProductNameNotFoundException("product name not found ");
                throw productNameNotFoundException;
            }
        } catch (ProductNameNotFoundException e) {
            e.printStackTrace();
        }
        return productName;
    }

    @Override
    public double getPriceById(int id) {
        double price = 0.0;
        try {
            if (id != 0) {
                for (Product product : products) {
                    if (product.getProductId() == id) {
                        price = product.getProductPrice();
                    }
                }
            }
            if (price == 0.0) {
                ProductPriceNotFoundException productPriceNotFoundException = new ProductPriceNotFoundException("Product price not found");
                throw productPriceNotFoundException;
            }
        } catch (ProductPriceNotFoundException e) {
            e.printStackTrace();
            System.out.println("the id is not valid");
        }
        return price;
    }

    @Override
    public String getMagfDateByid(int id) {
        String magfDate = null;
        try {
            if (id > 0) {
                for (Product product : products) {
                    if (product.getProductId() == id) {
                        magfDate = product.getMfgDate();
                    }
                }
            }
            if (magfDate == null) {
                MfgDateNotFoundException mfgDateNotFoundException = new MfgDateNotFoundException("the id is not valid to get date");
                throw mfgDateNotFoundException;
            }
        } catch (MfgDateNotFoundException e) {
            e.printStackTrace();
        }
        return magfDate;
    }

    @Override
    public String getMagfDateByProductName(String productName) {
        String magfDate = null;
        try {
            if (productName != null) {
                for (Product product : products) {
                    if (product.getProductName().equals(productName)) {
                        magfDate = product.getMfgDate();
                    }
                }
            }
            if (magfDate == null) {
                MfgDateNotFoundException mfgDateNotFoundException = new MfgDateNotFoundException("the product name is not valid to get date");
                throw mfgDateNotFoundException;
            }
        } catch (MfgDateNotFoundException e) {
            e.printStackTrace();
        }
        return magfDate;
    }

    @Override
    public Washable getWashablebyproductName(String name) {
        Washable washable = null;
        try {
            if (name != null) {
                for (Product product : products) {
                    if (product.getProductName().equals(name)) {
                        washable = product.getWashable();
                    }
                }
            }
            if (washable == null) {
                WashableNotFoundException washableNotFoundException = new WashableNotFoundException("Washable id not found by giving product name");
                throw washableNotFoundException;
            }
        } catch (WashableNotFoundException e) {
            e.printStackTrace();
        }
        return washable;
    }

    @Override
    public String getmfgDateById(int id) {
        String mfgDate = null;
        try {
            if (id > 0) {
                for (Product product : products) {
                    if (product.getProductId() == id) {
                        mfgDate = product.getMfgDate();
                    }
                }
            }
            if (mfgDate == null) {
                MfgDateNotFoundException mfgDateNotFoundException = new MfgDateNotFoundException("Mfg not found by giving id");
                throw mfgDateNotFoundException;
            }
        } catch (MfgDateNotFoundException e) {
            e.printStackTrace();
        }
        return mfgDate;
    }


    @Override
    public boolean updateProductPrice(double price) {
        boolean isPriceUpdated = false;
        try {
            if (price > 0) {
                products[1].setProductPrice(price);
                isPriceUpdated = true;
            }
            if (price <= 0) {
                ProductPriceNotUpdatedException productPriceNotUpdatedException = new ProductPriceNotUpdatedException("Product price is not updated");
                throw productPriceNotUpdatedException;
            }
        } catch (ProductPriceNotUpdatedException e) {
            e.printStackTrace();
        }
        return isPriceUpdated;
    }


    @Override

    public boolean updatePricebyId(int id, double price) {
        boolean updatePrice = false;
        try {
            if (id > 0) {
                for (Product product : products) {
                    if (id == product.getProductId()) {
                        product.setProductPrice(price);
                        updatePrice = true;
                    }
                }
            }
            if (updatePrice == false) {
                ProductPriceNotUpdatedException productPriceNotUpdatedException = new ProductPriceNotUpdatedException("invalid Id");
                throw productPriceNotUpdatedException;
            }
        } catch (ProductPriceNotUpdatedException e) {
            e.printStackTrace();
        }
        return updatePrice;
    }

    @Override
    public boolean updateProductNameById(int id, String productName) {
        boolean isIdUpdated = false;
        try {
            if (productName != null) {
                for (Product product : products) {
                    if (product.getProductId() == id) {
                        product.setProductName(productName);
                        isIdUpdated = true;
                    }

                }
            }
            if (isIdUpdated == false) {
                ProductNameNotFoundException productNameNotFoundException = new ProductNameNotFoundException("the id entered to get productname is not valid");
                throw productNameNotFoundException;
            }
        } catch (ProductNameNotFoundException e) {
            e.printStackTrace();
        }


        return isIdUpdated;
    }

    @Override
    public boolean updateProductTypeByProductName(String productName, String productType) {
        boolean isProducttypeUpdated = false;
        try {
            if (productName != null) {
                for (Product product : products) {
                    if (product.getProductName().equals(productName)) {
                        product.setProductType(productType);
                        isProducttypeUpdated = true;
                    }
                }
            }
            if (isProducttypeUpdated == false) {
                ProductTypeNotUpdatedException productTypeNotUpdatedException = new ProductTypeNotUpdatedException("the product name to update producttype is not valid");
                throw productTypeNotUpdatedException;
            }
        } catch (ProductTypeNotUpdatedException e) {
            e.printStackTrace();
        }

        return isProducttypeUpdated;
    }

    @Override
    public boolean updateProductTypeByID(String productType, int id) {
        boolean isProductTypeUpdatedByid = false;
        try {
            if (id != 0) {
                for (Product product : products) {
                    if (product.getProductId() == id) {
                        product.setProductType(productType);
                        isProductTypeUpdatedByid = true;
                    }
                }
            }
            if (isProductTypeUpdatedByid == false) {
                ProductTypeNotUpdatedException productTypeNotUpdatedException = new ProductTypeNotUpdatedException("id given to update product type is not valid");
                throw productTypeNotUpdatedException;
            }
        } catch (ProductPriceNotUpdatedException e) {
            e.printStackTrace();
        }

        return isProductTypeUpdatedByid;
    }

    @Override

    public boolean updatedWashableByProductName(String productName, Washable washable) {
        boolean isWashableUpadtedByName = false;
        try {
            if (productName != null) {
                for (Product product : products) {
                    if (product.getProductName().equals(productName)) {
                        product.setWashable(washable);
                        isWashableUpadtedByName = true;

                    }
                }
            }
            if (isWashableUpadtedByName == false) {
                WashableNotUpdatedException washableNotUpdatedException = new WashableNotUpdatedException("the product name given to update the washable is not valid");
                throw washableNotUpdatedException;
            }
        } catch (WashableNotUpdatedException e) {
            e.printStackTrace();
        }
        return isWashableUpadtedByName;
    }
}



