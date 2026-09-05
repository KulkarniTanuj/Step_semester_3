package oop.class_problems;

public class LibraryBook {

    String title;
    String isbn;


    LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }


    LibraryBook(String title) {
        this(title, "PENDING");
    }

    void printBook() {
        boolean catalogued = true;

        System.out.println(title + " " + isbn + "  Catalogued: " + catalogued);
    }

}