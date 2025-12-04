package Day3;

public class Book {
	
	String title;
	String author;
	int pages;
	
	void bookDetails(){
		System.out.println("The title of this book is: " + this.title);
		System.out.println("The author of this book is: " + this.author);
		System.out.println("The book contained: " + this.pages);
	}
	
}
