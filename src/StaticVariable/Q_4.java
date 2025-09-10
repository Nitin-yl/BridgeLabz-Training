package StaticVariable;

class Product {
    static double discount = 10.0; 

    private String productName;
    private double price;
    private int quantity;
    private final int productID;
    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to : " + discount + "%");
    }

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID   : " + productID);
            System.out.println("Product Name : " + productName);
            System.out.println("Price        : " + price);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Discount     : " + discount + "%");

            double discountedPrice = price - (price * discount / 100);
            System.out.println("Discounted Price: " + discountedPrice);
        } else {
            System.out.println("Invalid Product object.");
        }
    }
}

public class Q_4 {
    public static void main(String... args) {
        Product product1 = new Product("Samsung", 180000.0, 3, 201);
        Product product2 = new Product("MacBook Air2", 120000.0, 2, 202);

        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();

        System.out.println();
        Product.updateDiscount(20.0); 

        System.out.println();
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
    }
}
