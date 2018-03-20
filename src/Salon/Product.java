package Salon;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price)
    {
        setName(name);
        setPrice(price);
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

    public static void addProduct(ArrayList<Product> products, Product product)
    {
        products.add(product);
    }

    public static void removeProduct(ArrayList<Product> products, Product product)
    {
        products.remove(product);
    }
}
