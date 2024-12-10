package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library("City Library");

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "12345");
        Book book2 = new Book("1984", "George Orwell", "67890");

        library.addBook(book1);
        library.addBook(book2);

        Patron patron = new Patron("John Doe", "P001");

        library.listBooks();

        patron.borrowBook(book1);
        library.listBooks();

        patron.returnBook(book1);
        library.listBooks();
    }
}

