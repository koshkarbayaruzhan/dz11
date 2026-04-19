package com.store.order;

import java.util.List;
import com.store.product.Product;
import com.store.user.Customer;

public class Order {
    private Long id;
    private Customer customer;
    private List<Product> products;
    private double total;
    private String status;

    public void createOrder() {}
    public void cancel() {}
    public void pay() {}
}
