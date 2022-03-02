package com.hbacakk.categoryapp.model;

import java.util.ArrayList;

public class Category {
    String name;
    int categoryImage;
    ArrayList<Product> productArrayList;

    public Category(String name, int categoryImage) {
        this.name = name;
        this.categoryImage = categoryImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(int categoryImage) {
        this.categoryImage = categoryImage;
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }
}
