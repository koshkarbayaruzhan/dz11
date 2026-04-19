package com.store.loyalty;

public class LoyaltyService {

    public int calculatePoints(double amount) {
        return (int)(amount * 0.1);
    }
}
