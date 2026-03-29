package com.library.model;

public class Book {
    private int id;
    private String title;
    private boolean available;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void issueBook() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }
}