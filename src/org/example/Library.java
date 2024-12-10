package org.example;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (Available: " + book.isAvailable() + ")");
        }
    }
}

