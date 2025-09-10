package Constructors.Level_1;

public class Q_5 {

    public static class Book {
        private String title;
        private String author;
        private double price;
        private boolean available;

        public Book(String title, String author, double price, boolean available) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.available = available;
        }

        public void borrowBook() {
            available = false;
            System.out.println("You borrowed " + title);
        }

        public void displayInfo() {
            System.out.println("Book: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: ₹" + price);
            System.out.println("Status: " + (available ? "Available" : "Checked out"));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 399.0, true);

        System.out.println("Before borrowing:");
        book1.displayInfo();

        book1.borrowBook();

        System.out.println("After borrowing:");
        book1.displayInfo();
    }
}
