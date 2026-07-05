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

        if (books.size() == 0) {
            System.out.println("No books added.");
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
}