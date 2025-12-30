package com.example;

public class Main {
    public static String buildProductList(String[][] products) {
        StringBuilder productList = new StringBuilder();
        productList.append("Product List:\n");

        for (String[] product : products) {
            String name = product[0];
            String price = product[1];
            productList.append(name).append(" - $").append(price).append("\n");
        }

        return productList.toString();
    }

    public static void main(String[] args) {
        String[][] products = {
                {"Laptop", "999.99"},
                {"Phone", "499.49"},
                {"Tablet", "299.99"}
        };

        String result = buildProductList(products);
        System.out.println(result);
    }
}