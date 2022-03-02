package com.hbacakk.categoryapp.model;

public class Product {

    String name;
    int productImage;

    public Product(String name, int productImage) {
        this.name = name;
        this.productImage = productImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }
}
