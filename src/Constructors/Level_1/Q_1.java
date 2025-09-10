package Constructors.Level_1;

public class Q_1 {
    public static class Book { 
        private String title;
        private String author;
        private double price;

        public Book() {
            this.title = "Unknown Title";
            this.author = "Unknown Author";
            this.price = 0.0;
        }

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
        public void display() {
            System.out.println("Title : " + title);
            System.out.println("Author : " + author);
            System.out.println("Price : " + price);
        }
    }

    public static void main(String... args) {
        Book b1 = new Book("The Subtle Art of Not Giving a F*ck", "Mark Manson", 1500.0);
        b1.display();
    }
}
