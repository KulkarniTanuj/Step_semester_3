package Classproblems;
class Book {
    String isbn;
    String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
}

public class Library {

    public static String findBook(Book[] catalog, String targetIsbn) {
        int left = 0;
        int right = catalog.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int match = catalog[mid].isbn.compareTo(targetIsbn);

            if (match == 0) {
                return catalog[mid].title;
            } else if (match < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        Book[] catalog = {
                new Book("0001112223", "Introduction to Algebra"),
                new Book("0002223334", "Beginning Python"),
                new Book("0003334445", "Classic Mythology"),
                new Book("0004445556", "Data and Society"),
                new Book("0005556667", "European History")
        };

        String target1 = "0003334445";
        System.out.println("Expected: Classic Mythology | Output: " + findBook(catalog, target1));

        String target2 = "0009998887";
        System.out.println("Expected: Not Found | Output: " + findBook(catalog, target2));
    }
}