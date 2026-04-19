package com.store.user;

public class Admin extends User {

    public void logAction(String action) {
        System.out.println("Admin action: " + action);
    }
}
