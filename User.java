package GroupProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class User {
    LocalDateTime now = LocalDateTime.now(); // current date and time
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private int id;
    private String name;
    private int borrowed;
    private Book[] borrowedBooks = new Book[5];

    public User(int id, String name){
        this.id = id;
        this.name = name;
        this.borrowed = 0;
    }

    // Getter
    public String getName(){
        return name;
    }

    public Boolean isEquals(String name){
        if (name == this.name){
            return true;
        }
        return false;
    }

    public void borrowBook(Book book, int Id) {
        boolean IdExist = false;
        if (book.getId() != id){
            System.out.println("Invalid ID, please try again");
            System.out.println();
        }else if(borrowed > 5){
            System.out.println("Borrowing request failed, you reached the maximum borrowed book.");
            System.out.println();
        }else if (!book.isInShelf()){
            System.out.println("Borrowing request failed, book is not available in the library.");
            System.out.println();
        }else{
            borrowedBooks[borrowed++] = book;
            book.setInShelf(false);
            System.out.println("Book " + book.getId() + " " + book.getTitle() + " Successfully Borrowed");
            System.out.println();
        }
    }

    public void displayBorrowedBook(Book book){
        for (int i = 0; i < borrowedBooks.length; i++){
            System.out.println("Book borrowed: " + book.getTitle() + " - " + now.format(formatter));
        }
        System.out.println();
    }
}
