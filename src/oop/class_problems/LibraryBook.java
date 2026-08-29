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

    public static void main(String[] args) {

        String[] titles = {
            "Clean Code",
            "Untitled Draft",
            "1984",
            "Notes"
        };

        String[] isbns = {
            "978-0132350884",
            "",
            "9780451524935",
            ""
        };

        LibraryBook[] books = new LibraryBook[titles.length];

        for (int i = 0; i < titles.length; i++) {

            if (isbns[i].equals("")) {
                books[i] = new LibraryBook(titles[i]);
            } else {
                books[i] = new LibraryBook(titles[i], isbns[i]);
            }
        }

        for (int i = 0; i < books.length; i++) {
            books[i].printBook();
        }
    }
}