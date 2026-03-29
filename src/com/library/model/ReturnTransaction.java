package com.library.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReturnTransaction extends Transaction {

    private LocalDate issueDate;

    public ReturnTransaction(Book book, User user, LocalDate issueDate) {
        super(book, user);
        this.issueDate = issueDate;
    }

    @Override
    public void execute() {
        book.returnBook();

        LocalDate returnDate = LocalDate.now();
        long days = ChronoUnit.DAYS.between(issueDate, returnDate);

        long fine = (days > 7) ? (days - 7) * 5 : 0;

        System.out.println("Book Returned Successfully");
        System.out.println("Fine: ₹" + fine);
    }
}
