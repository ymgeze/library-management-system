package com.ymgeze.library;

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
                    //Add block
                    
                    
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