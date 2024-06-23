import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner uwu = new Scanner(System.in);

        Book libros = new Book();

        System.out.println("Type tittle, author and isbm of a book:");
        int num;
        String tittle;
        String author;
        int isbm;

        do{
            System.out.println("New Book:");
            System.out.print("Tittle: ");
            tittle = uwu.next();

            System.out.print("ISBM: ");
            isbm = uwu.nextInt();

            System.out.print("Author: ");
            author = uwu.next();

            libros.addBook(new Book(tittle, author, isbm));

            System.out.println("Type 1 (to add a new book) or 0 (to quit the program)");
            num = uwu.nextInt();
        }while(num == 1);
        System.out.println("-----------------------------------------------");

        ArrayList<Book> bookList = Book.getBooks();

        System.out.println("Print Books:");

        for(Book book: bookList){
            System.out.println(book.getTittle() + ", " + book.getAuthor() + ", " + book.getIsbn());
        }

    }
}