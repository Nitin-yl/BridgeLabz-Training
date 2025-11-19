package JavaPillars;

import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + getItemId());
        System.out.println();
        System.out.println("Title: " + getTitle());
        System.out.println();
        System.out.println("Author: " + getAuthor());
        System.out.println();
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println();
        System.out.println("Availability: " + getAvailabilityInfo());
        System.out.println();
    }

    protected String getAvailabilityInfo() {
        return "Not Reservable";
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
    String getReservationDetails();
}

class Book extends LibraryItem implements Reservable {
    private boolean available;
    private String borrowerName;

    Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }


    public int getLoanDuration() {
        return 21;
    }

   
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
        }
    }

    
    public boolean checkAvailability() {
        return available;
    }

    
    public String getReservationDetails() {
        return available ? "Available" : "Reserved by " + borrowerName;
    }


    protected String getAvailabilityInfo() {
        return getReservationDetails();
    }
}

class Magazine extends LibraryItem {
    Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

  
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available;
    private String borrowerName;

    DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
    }

   
    public int getLoanDuration() {
        return 14;
    }


    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
        }
    }

    
    public boolean checkAvailability() {
        return available;
    }

 
    public String getReservationDetails() {
        return available ? "Available" : "Reserved by " + borrowerName;
    }

   
    protected String getAvailabilityInfo() {
        return getReservationDetails();
    }
}

public class Ques_5 {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        Book b1 = new Book("B101", "Java Essentials", "Akshat");
        Magazine m1 = new Magazine("M202", "Tech Monthly", "Editorial Team");
        DVD d1 = new DVD("D303", "Inception", "Christopher Nolan");

        b1.reserveItem("Ravi");
        d1.reserveItem("Priya");

        items.add(b1);
        items.add(m1);
        items.add(d1);

        for (LibraryItem item : items) {
            item.getItemDetails();
        }
    }
}