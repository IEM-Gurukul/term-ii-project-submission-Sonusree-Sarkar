package com.library.main;

import com.library.model.*;
import com.library.service.LibraryService;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LibraryService library = new LibraryService();

        // Add books
        Book b1 = new Book(1, "Java Programming");
        Book b2 = new Book(2, "Data Structures");

        library.addBook(b1);
        library.addBook(b2);

        // Create user
        User user = new User(101, "Student");

        // Display books
        System.out.println("Available Books:");
        library.displayBooks();

        // Issue book
        System.out.println("\nIssuing Book:");
        IssueTransaction issue = new IssueTransaction(b1, user);
        issue.execute();

        // Try issuing again (error case)
        issue.execute();

        // Return book after 10 days
        System.out.println("\nReturning Book:");
        ReturnTransaction ret =
            new ReturnTransaction(b1, user, LocalDate.now().minusDays(10));
        ret.execute();

        // Final status
        System.out.println("\nUpdated Book List:");
        library.displayBooks();
    }
}