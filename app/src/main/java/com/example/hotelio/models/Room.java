package com.example.hotelio.models;

import java.io.Serializable;

public class Room implements Serializable {

    private String title;
    private String description;
    private double price;
    private boolean available;
    private String imageUrl;

    public Room(String title, String description, double price, boolean available, String imageUrl) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.available = available;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailable() {
        return available;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
