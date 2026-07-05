package com.ymgeze.library;

public class Book {

    private int id;
    private String title;
    private String author;
    private int publicationYear;
    private String category;
    private boolean borrowed;

    public Book(int id, String title, String author, int publicationYear, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.category = category;
        this.borrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getCategory() {
        return category;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

}