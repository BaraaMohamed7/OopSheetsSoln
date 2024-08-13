package org.example;

import org.example.models.Product;

import org.example.sorters.Sorter;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;

public class StoreDbController {

    private ArrayList<Product> products;
    private Sorter sorter;

    private static StoreDbController instance = null;

    public static StoreDbController getInstance() {
        if (instance == null) {
            synchronized (StoreDbController.class) {
                if (instance == null) instance = new StoreDbController();
            }
        }
        return instance;
    }


    private StoreDbController() {
        products = new ArrayList<>();
    }


    public void getProductsFromDb() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/products.db");
        Statement statement = connection.createStatement();

        statement.execute("SELECT * FROM products");
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("Name");
            double rating = resultSet.getDouble("Rating");
            String category = resultSet.getString("Category");
            String price = resultSet.getString("Price");

            Product product = new Product(id, name, rating, category, price);
            products.add(product);
        }
        connection.close();
    }

    public void setSortingAlgorithm(Sorter sorter) {
        this.sorter = sorter;
    }



    public void addProduct(Product product) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/products.db");
        Statement statement = connection.createStatement();

        statement.execute("INSERT INTO products (Name,Rating,Category,Price) VALUES( '"
                + product.getName() + "', " + product.getRating()
                + ", '" + product.getCategory() + "', '" + product.getPrice() + "')");
        products.add(product);
        connection.close();
    }

    public void removeProduct(int productId) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/products.db");
        Statement statement = connection.createStatement();

        statement.execute("DELETE FROM products WHERE id = " + productId);
        connection.close();
//            products = products.parallelStream().filter(product -> product.getId() != productId)
//                    .collect(Collectors.toCollection(ArrayList<Product>::new));
    }

    public Product searchByName(String name) throws ClassNotFoundException, SQLException {
//            return products.parallelStream().filter(product -> Objects.equals(product.getName(), name))
//                    .collect(Collectors.toCollection(ArrayList<Product>::new)).getFirst() ;
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/products.db");
        Statement statement = connection.createStatement();

        statement.execute("SELECT * FROM products WHERE Name = '" + name + "'");
        ResultSet resultSet = statement.getResultSet();

        int id = resultSet.getInt("id");
        String productName = resultSet.getString("Name");
        double rating = resultSet.getDouble("Rating");
        String category = resultSet.getString("Category");
        String price = resultSet.getString("Price");

        Product product = new Product(id, productName, rating, category, price);
        connection.close();
        return product;
    }


    public void displayAllProducts() {
        products.forEach(Product::displayInfo);
    }

    public void sortProducts() {
        products = sorter.sort(products, Comparator.comparing(Product::getName));
    }

}

