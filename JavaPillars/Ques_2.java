package JavaPillars;

import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println();
        System.out.println("Name: " + getName());
        System.out.println();
        System.out.println("Price: " + getPrice());
        System.out.println();
        System.out.println("Discounted Price: " + calculateDiscount());
        System.out.println();
        System.out.println("Tax Details: " + getTaxInfo());
        System.out.println();
    }

    protected String getTaxInfo() {
        return "Not Applicable";
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double warrantyYears;
    private double taxRate;

    Electronics(String productId, String name, double price, double warrantyYears, double taxRate) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
        this.taxRate = taxRate;
    }

    public double getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(double warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

  
    public double calculateDiscount() {
        return getPrice() * 0.9;
    }

    
    public double calculateTax() {
        return getPrice() * taxRate;
    }


    public String getTaxDetails() {
        return "Electronics Tax: " + calculateTax();
    }

   
    protected String getTaxInfo() {
        return getTaxDetails();
    }
}

class Clothing extends Product implements Taxable {
    private String size;
    private double taxRate;

    Clothing(String productId, String name, double price, String size, double taxRate) {
        super(productId, name, price);
        this.size = size;
        this.taxRate = taxRate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    
    public double calculateDiscount() {
        return getPrice() * 0.85;
    }

    
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    public String getTaxDetails() {
        return "Clothing Tax: " + calculateTax();
    }


    protected String getTaxInfo() {
        return getTaxDetails();
    }
}

class Groceries extends Product {
    private String expiryDate;

    Groceries(String productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double calculateDiscount() {
        if (expiryDate.isEmpty()) {
            return getPrice();
        }
        return getPrice() * 0.98;
    }
}

public class Ques_2 {
    public static void main(String[] args) {
        List<Product> catalog = new ArrayList<>();

        Electronics e1 = new Electronics("E1001", "Smartphone", 30000, 2, 0.18);
        Clothing c1 = new Clothing("C2001", "Jeans", 1999, "M", 0.12);
        Groceries g1 = new Groceries("G3001", "Rice 5kg", 2500, "2026-12-31");

        catalog.add(e1);
        catalog.add(c1);
        catalog.add(g1);

        for (Product p : catalog) {
            p.displayDetails();
        }
    }
}