package Constructors;

public class Q_1 {

    public static class Product {
        private String productName;
        private double price;
        private static int totalProducts = 0;

        public Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            totalProducts++;
        }

        public void displayProduct() {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println();
        }

        public static void display() {
            System.out.println("Total products created: " + totalProducts);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("phone", 22000);
        Product p3 = new Product("Headphones", 1500);

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        Product.display();
    }
}
