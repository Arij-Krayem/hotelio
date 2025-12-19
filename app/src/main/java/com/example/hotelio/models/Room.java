package com.example.hotelio.models;

import java.io.Serializable;

public class Room implements Serializable {

    private String title;
    private double price;
    private boolean available;
    private String description;
    private String imageUrl;

    // 🔹 Constructor
    public Room(String title, double price, boolean available, String description, String imageUrl) {
        this.title = title;
        this.price = price;
        this.available = available;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    // 🔹 Getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailable() {
        return available;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    // 🔹 Optional setters (if you want to update later)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
