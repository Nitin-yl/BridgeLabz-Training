package StaticVariable;

class Book {
    static String libraryName = "Central Library";

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    
    private String title;
    private String author;
    private final String isbn; 
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title : " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN  : " + isbn);
        } else {
            System.out.println("Invalid Book object.");
        }
    }
}

public class Q_2 {
    public static void main(String... args) {
        Book.displayLibraryName();
        System.out.println();

        Book book1 = new Book("The Subtle Art of not giving Fuck", "Mark Manson", "9781387898480");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");

        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}
