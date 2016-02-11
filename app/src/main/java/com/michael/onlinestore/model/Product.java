package com.michael.onlinestore.model;

/**
 * Created by michael on 10/02/2016.
 */
public class Product {
    private Long id;
    private String title;
    private String description;
    private String imagePath;
    private double price;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Product(Long id, String title, String desc, String imagePath, double price) {
        this.id = id;
        this.title = title;
        this.description = desc;
        this.imagePath = imagePath;
        this.price = price;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return this.getTitle();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
