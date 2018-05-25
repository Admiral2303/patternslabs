import java.util.ArrayList;

public class BooksSet {
    public ArrayList<Book> mathematical_books = new ArrayList<Book>();
    public ArrayList<Book> natural_books = new ArrayList<Book>();
    public ArrayList<Book> language_books = new ArrayList<Book>();

    public void get_info() {
        System.out.println("Mathematical books");
        for (Book book : mathematical_books) {
            System.out.println("Subject: " + book.getSubject());
            System.out.println("Level: " + book.getSubject_level());
        }
        System.out.println("-------------------------------");
        System.out.println("Natural books");
        for (Book book : natural_books) {
            System.out.println("Subject: " + book.getSubject());
            System.out.println("Level: " + book.getSubject_level());
        }
        System.out.println("-------------------------------");
        System.out.println("Language books");
        for (Book book : language_books) {
            System.out.println("Subject: " + book.getSubject());
            System.out.println("Level: " + book.getSubject_level());
        }
        System.out.println("-------------------------------");
    }

}
