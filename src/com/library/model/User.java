package com.library.model;

public class User {
    protected int id;
    protected String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showRole() {
        System.out.println("User");
    }
}