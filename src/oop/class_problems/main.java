package oop.class_problems;

//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        Employee[] employees = {
//                new Employee("E-101", 40000),
//                new Employee("E-102", 55000),
//                new Employee("E-103", 62000),
//                new Employee("E-104", 48000)
//        };
//
//        System.out.print("Enter bonus amount: ");
//        double bonus = scanner.nextDouble();
//
//        for (int i = 0; i < employees.length; i++) {
//            employees[i].raiseSalary(bonus);
//        }
//
//        for (int i = 0; i < employees.length; i++) {
//            employees[i].printSalary();
//        }
//
//        scanner.close();
//    }
//}

public class main{
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