package com.library.model;

public class IssueTransaction extends Transaction {

    public IssueTransaction(Book book, User user) {
        super(book, user);
    }

    @Override
    public void execute() {
        if (book.isAvailable()) {
            book.issueBook();
            System.out.println("Book Issued Successfully");
        } else {
            System.out.println("Book Not Available");
        }
    }
}