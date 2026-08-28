package oop.class_problems;

public class IdCard {

    String name;
    int booksIssued;

    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {

        IdCard tanuj = new IdCard("tanuj", 0);

        IdCard duplicate = tanuj;

        duplicate.booksIssued = 3;

        System.out.println("Tanuj's booksIssued : " + tanuj.booksIssued);

        System.out.println("duplicate == tanuj: " + (duplicate == tanuj));

        IdCard separate = new IdCard("Tanuj", 3);

        System.out.println("separate == tanuj: " + (separate == tanuj));
    }
}
