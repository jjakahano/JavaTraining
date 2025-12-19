package GroupProject;

import java.util.Arrays;

public class Library{
    private Book[] books = new Book[5];
    private int bookCount = 0;

    // Getter
    public int getBookCount(){
        return bookCount;
    }

    public void addBook(Book book){
        books[bookCount++] = book;
    }


    public Book findById(int id){
        for (int i = 0; i < bookCount; i++){
            if (books[i].getId() == id){
                return books[i];
            }
        }
        return null;
    }

    public void displayBooks(){
        for(int i = 0; i < bookCount; i++){
//            System.out.println("[" + books[i].getId() + "] "
//                + books[i].getTitle() + " by " + books[i].getAuthor());
            System.out.printf("[%1d] %s by %s\n",
                    books[i].getId(), books[i].getTitle(), books[i].getAuthor());
        }
    }

    public void displayAvailableBooks(){
        for(int i = 0; i < bookCount; i++){
            if(books[i].isInShelf()){
                System.out.println("[" + books[i].getId() + "] "
                        + books[i].getTitle() + " by " + books[i].getAuthor() + " [Available]");
            }

        }
    }

//    public void displayBorrowedBooks(User[] users) {
//        System.out.println("Borrowed Books:");
//        for (User user : users) {
//            for (int i = 0; i < user.borrowedCount; i++) {
//                Book b = user.borrowedBooks[i];
//                if (b != null) {
//                    System.out.println(b.title + " by " + b.author + " borrowed by " + user.name);
//                }
//            }
//        }
//    }

}
