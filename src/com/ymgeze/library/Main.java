package com.ymgeze.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("Library Management System");
            System.out.println("1 - Add Book");
            System.out.println("2 - List Books");
            System.out.println("3 - Search");
            System.out.println("4 - Borrow");
            System.out.println("0 - Exit");
            System.out.print("Choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    int id = input.nextInt();
                    input.nextLine();

                    String title = input.nextLine();
                    String author = input.nextLine();

                    int year = input.nextInt();
                    input.nextLine();

                    String category = input.nextLine();

                    Book book = new Book(id, title, author, year, category);

                    library.addBook(book);

                    break;

                case 2:

                    library.listBooks();

                    break;

                case 3:

                    boolean searchMenu = true;

                    while (searchMenu) {

                        System.out.println("Search Menu");
                        System.out.println("1 - Search by ID");
                        System.out.println("2 - Search by Title");
                        System.out.println("3 - Search by Author");
                        System.out.println("0 - Back");
                        System.out.print("Choice: ");

                        int searchMenuChoice = input.nextInt();

                        switch (searchMenuChoice) {

                            case 1:

                                System.out.print("Book ID: ");

                                int searchId = input.nextInt();
                                Book foundBookById = library.searchBookById(searchId);

                                if (foundBookById != null) {

                                    System.out.println("Book found.");
                                    System.out.println("ID: " + foundBookById.getId());
                                    System.out.println("Title: " + foundBookById.getTitle());
                                    System.out.println("Author: " + foundBookById.getAuthor());
                                    System.out.println("Publication Year: " + foundBookById.getPublicationYear());
                                    System.out.println("Category: " + foundBookById.getCategory());

                                    if (foundBookById.isBorrowed()) {
                                        System.out.println("Borrowed: Yes");
                                    } else {
                                        System.out.println("Borrowed: No");
                                    }

                                } else {
                                    System.out.println("Book not found.");
                                }

                                break;

                            case 2:

                                System.out.print("Book Title: ");

                                input.nextLine();
                                String searchTitle = input.nextLine();
                                Book foundBookByTitle = library.searchBookByTitle(searchTitle);

                                if (foundBookByTitle != null) {

                                    System.out.println("Book found.");
                                    System.out.println("ID: " + foundBookByTitle.getId());
                                    System.out.println("Title: " + foundBookByTitle.getTitle());
                                    System.out.println("Author: " + foundBookByTitle.getAuthor());
                                    System.out.println("Publication Year: " + foundBookByTitle.getPublicationYear());
                                    System.out.println("Category: " + foundBookByTitle.getCategory());

                                    if (foundBookByTitle.isBorrowed()) {
                                        System.out.println("Borrowed: Yes");
                                    } else {
                                        System.out.println("Borrowed: No");
                                    }

                                } else {
                                    System.out.println("Book not found.");
                                }

                                break;

                            case 3:

                                System.out.print("Book Author: ");

                                input.nextLine();
                                String searchAuthor = input.nextLine();

                                ArrayList<Book> foundBooksByAuthor = library.searchBooksByAuthor(searchAuthor);

                                if (foundBooksByAuthor.size() != 0) {

                                    System.out.println("Books found.");

                                    for (int i = 0; i < foundBooksByAuthor.size(); i++) {

                                        System.out.println("ID: " + foundBooksByAuthor.get(i).getId());
                                        System.out.println("Title: " + foundBooksByAuthor.get(i).getTitle());
                                        System.out.println("Author: " + foundBooksByAuthor.get(i).getAuthor());
                                        System.out.println("Publication Year: " + foundBooksByAuthor.get(i).getPublicationYear());
                                        System.out.println("Category: " + foundBooksByAuthor.get(i).getCategory());

                                        if (foundBooksByAuthor.get(i).isBorrowed()) {
                                            System.out.println("Borrowed: Yes");
                                        } else {
                                            System.out.println("Borrowed: No");
                                        }
                                    }

                                } else {
                                    System.out.println("Books not found.");
                                }

                                break;

                            case 0:

                                searchMenu = false;
                                break;
                        }
                    }

                    break;

                case 4:
                    //Add block
                    break;

                case 0:

                    System.out.println("Exiting...");
                    return;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}