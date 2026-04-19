package com.store.factory;

import com.store.product.Product;

public class ProductFactory {

    public static Product createProduct(String type) {

        Product product = new Product();

        if (type.equals("default")) {
            product = new Product();
        }

        return product;
    }
}
