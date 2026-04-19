package com.store.user;

import java.util.List;
import com.store.order.Order;

public class Customer extends User {
    private List<Order> orders;
    private int bonusPoints;

    public void register() {}
    public void updateData() {}
}
