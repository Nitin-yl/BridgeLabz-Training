package Constructors;

public class Q_5 {

    static class Book {
        public String ISBN;
        protected String title;
        private String author;

        Book(String isbn, String title, String author) {
            this.ISBN = isbn;
            this.title = title;
            this.author = author;
        }

        void setAuthor(String author) { this.author = author; }
        String getAuthor() { return author; }

        void display() {
            System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
        }
    }

    static class EBook extends Book {
        EBook(String isbn, String title, String author) {
            super(isbn, title, author);
        }

        void displayEBook() {
            System.out.println("EBook - ISBN: " + ISBN + ", Title: " + title); 
        }
    }

    public static void main(String... args) {
        Book b = new Book("978-93-5473-123-0", "Wings of Fire", "Dr. A.P.J. Abdul Kalam");
        b.display();
        b.setAuthor("A.P.J. Abdul Kalam & Arun Tiwari");
        System.out.println("Updated Author: " + b.getAuthor());

        EBook eb = new EBook("978-81-291-4570-9", "The White Tiger", "Aravind Adiga");
        eb.displayEBook();
    }
}
