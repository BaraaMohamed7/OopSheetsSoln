package org.example.models;

import com.fasterxml.uuid.Generators;

import java.util.UUID;


public class Product {
    private int id;
    private String name;
    private double rating;
    private String category;
    private String price;

    public Product(String name, double rating, String category, String price) {
        this.name = name;
        this.rating = rating;
        this.category = category;
        this.price = price;
    }

    public Product(int id, String name, double rating, String category, String price) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println(
                "Product[ " +
                        "id : " + id +
                        " - name :" + name +
                        "\nof category : " + category +
                        " with rating : " + rating +
                        " and price : " + price +
                        "]\n"
        );
    }
}
