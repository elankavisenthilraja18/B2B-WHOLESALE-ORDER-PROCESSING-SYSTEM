package com.examly.springapp.model;
import jakarta.persistence.*;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long productId;
    private String productName;
    private String description;
    private double price;
    private String category;
    private int stockQuantity;
    public long getProductId(){
        return productId;
    }
    public void setProductId(long productId){
        this.productId=productId;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public int getStockQuantity(){
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity){
        this.stockQuantity=stockQuantity;
    }
}
