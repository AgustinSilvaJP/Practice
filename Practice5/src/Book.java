import java.util.ArrayList;
public class Book {
    //attributes
    private String tittle;
    private String author;
    private int isbn;
    private static ArrayList<Book> books = new ArrayList<Book>();

    //constructor
    public Book(){}
    public Book(String tittle, String author, int isbn){
        this.tittle = tittle;
        this.author = author;
        this.isbn = isbn;
    }
    //methods
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public static ArrayList<Book> getBooks(){
        return books;
    }
    //setters
    public void setTitle(String tittle){
        this.tittle = tittle;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    //getters
    public String getTittle(){
        return tittle;
    }
    public String getAuthor(){
        return author;
    }
    public int getIsbn(){
        return isbn;
    }

}
