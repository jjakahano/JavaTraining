package GroupProject;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean inShelf;

    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.inShelf = true;
    }

    //getters
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getId(){
        return this.id;
    }
    public boolean isInShelf(){
        return this.inShelf;
    }

    //setters
    public void setInShelf(boolean inShelf) { this.inShelf =  inShelf;}

    public void bookInfo(){
        System.out.println(getTitle() + " by " + getAuthor());
    }
}
