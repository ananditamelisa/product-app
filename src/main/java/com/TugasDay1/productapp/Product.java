package com.TugasDay1.productapp;

public class Product {
    private String productID;
    private String name;
    private String category;
    private int stock;

    public Product(String productID, String name, String category, int stock) {
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.stock = stock;
    }
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void insertProduct(String id, String name, String category, int stock){

    }
    public void updateProduct(String id){

    }
    public void deleteProduct(String id){

    }
}
