package com.example.android2_tuan4;

public class Plant {
    private String name;
    private double price;
    private String image;

    public Plant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }

    public Plant(String name, double price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }
}
