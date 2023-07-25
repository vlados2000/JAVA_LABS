package com.qa;

import java.util.Arrays;

public class Library {
    private String name;
    private String city;
    private int nrOfBooks;
    private Book[] books;

    public Library(String name, String city, int nrOfBooks, Book[] books) {
        this.name = name;
        this.city = city;
        this.nrOfBooks = nrOfBooks;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getNrOfBooks() {
        return nrOfBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNrOfBooks(int nrOfBooks) {
        this.nrOfBooks = nrOfBooks;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nrOfBooks=" + nrOfBooks +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
