package GroupProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library publicLibrary = new Library();

        Book book1 = new Book(1,"Flowers for Algernon", "Daniel Keyes");
        Book book2 = new Book(2,"Norwegian Wood", "Haruki Murakami");
        Book book3 = new Book(3,"Si", "Bob Ong");
        Book book4 = new Book(4,"Before the Coffee Gets Cold", "Toshikazu Kawaguchi");
        Book book5 = new Book(5,"The Great Gatsby", "F. Scott Fitzgerald");

        publicLibrary.addBook(book1);
        publicLibrary.addBook(book2);
        publicLibrary.addBook(book3);
        publicLibrary.addBook(book4);
        publicLibrary.addBook(book5);

        User user1 = new User(1,"Bayaw");

            while (true) {
                System.out.println("==== Library Management System ====");
                System.out.println(" [1] Display All Books");
                System.out.println(" [2] Display All Available Books");
                System.out.println(" [3] Borrow a Book");
                System.out.println(" [4] Return a Book");
                System.out.println(" [5] Display Borrowed Books");
                System.out.println(" [6] Exit");
                System.out.println(" ==================================");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: //Display all books
                            //call displayBooks method to iterate contents of array Books
                        System.out.println();
                        publicLibrary.displayBooks();
                        System.out.println();
                        break;
                    case 2: //Display all available books

                        System.out.println();
                        publicLibrary.displayAvailableBooks();
                        System.out.println();
                        break;
                    case 3: //Borrowing a book

                        System.out.println("Enter Book ID to borrow: ");
                        int bookId = scanner.nextInt();
                        System.out.println();

                        Book book = publicLibrary.findById(bookId);
                        user1.borrowBook(book, bookId);
                        System.out.println();
                        break;
                    case 4: //Returning a book

                        break;
                    case 5: //Display Borrowed Books
                        //publicLibrary.displayBorrowedBook();
                        break;
                    case 6: //Exit

                        return;
                    default:
                        System.out.println();
                        System.out.println("Invalid option");
                    }
                }
        }
    }
