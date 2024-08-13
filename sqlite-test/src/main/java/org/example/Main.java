package org.example;

import org.example.models.Product;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        StoreDbController storeDbController = new StoreDbController();
        storeDbController.getProductsFromDb();
        storeDbController.addProduct(new Product("New Product", 4.5, "New Category", "New Price"));
        storeDbController.removeProduct(1);
        storeDbController.displayAllProducts();

    }
}