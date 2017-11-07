package com.saliev.yegor.entity.pojo;

import com.saliev.yegor.entity.marketingEntity.Product;

/**
 * Created by Halvasan on 07.11.2017.
 */
public class ProductPOJO implements Product {

    /*
    implements product inteface for making POJO class of entity for using
    this later
     */
//TODO: make this class not POJO

    private int productId;
    private String productName;
    private double price;
    private int shopId;



    @Override
    public int productId() {
        return productId;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public int shopId() {
        return shopId;
    }
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
