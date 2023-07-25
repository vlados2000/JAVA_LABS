package com.qa;

public class TestBooks {

    public static void main(String[] args) {
        String[] arr = {"Mike", "Martina", "Peter"};
        Book b1 = new Book("title", arr, 10.99);
        Book b2 = new Book("title2", arr, 5.99);
        Book b3 = new Book("title3", arr, 1.00);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


        Book[] books = new Book[3];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;

        System.out.println();

        String[] librNames = {"Carturesti", "Humanitas", "Librarium"};
        Library l1 = new Library(librNames[0], "Bucuresti", books.length, books);
        Library l2 = new Library(librNames[1], "Cluj", books.length, books);
        Library l3 = new Library(librNames[2], "Brasov", books.length, books);

        Library[] libraries = new Library[3];
        libraries[0] = l1;
        libraries[1] = l2;
        libraries[2] = l3;

        for (int i = 0; i < librNames.length; i++) {
            System.out.println(libraries[i]);
        }


    }
}
