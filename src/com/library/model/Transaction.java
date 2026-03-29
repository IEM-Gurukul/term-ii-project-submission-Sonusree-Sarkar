package com.library.model;

public abstract class Transaction {
    protected Book book;
    protected User user;

    public Transaction(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    public abstract void execute();
}