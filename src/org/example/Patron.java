package org.example;

public class Patron {
    private String name;
    private String patronId;

    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
    }

    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is currently unavailable.");
        }
    }

    public void returnBook(Book book) {
        book.returnBook();
        System.out.println(name + " returned the book: " + book.getTitle());
    }
}

