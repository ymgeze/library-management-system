package com.ymgeze.library;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {

        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {

            for (int i = 0; i < books.size(); i++) {

                System.out.println("ID: " + books.get(i).getId());
                System.out.println("Title: " + books.get(i).getTitle());
                System.out.println("Author: " + books.get(i).getAuthor());
                System.out.println("Publication Year: " + books.get(i).getPublicationYear());
                System.out.println("Category: " + books.get(i).getCategory());

                if (books.get(i).isBorrowed()) {
                    System.out.println("Borrowed: Yes");
                } else {
                    System.out.println("Borrowed: No");
                }

                System.out.println("----------------------------------------");
            }
        }
    }

    public Book searchBookById(int id) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getId() == id) {
                return books.get(i);
            }
        }

        return null;
    }

    public Book searchBookByTitle(String title) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getTitle().equals(title)) {
                return books.get(i);
            }
        }

        return null;
    }

    public ArrayList<Book> searchBooksByAuthor(String author) {

        ArrayList<Book> foundBooksByAuthor = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getAuthor().equals(author)) {
                foundBooksByAuthor.add(books.get(i));
            }
        }

        return foundBooksByAuthor;
    }
}