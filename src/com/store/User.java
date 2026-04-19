package com.store.user;

import com.store.common.AbstractEntity;

public abstract class User extends AbstractEntity {
    protected String name;
    protected String email;
    protected String address;
    protected String phone;

    public abstract void login();
}
