package com.library.service;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<Book> books = new ArrayList<>();

    // Add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Search book
    public Book searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    // Display all books
    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b.getTitle() + 
                (b.isAvailable() ? " [Available]" : " [Issued]"));
        }
    }
}