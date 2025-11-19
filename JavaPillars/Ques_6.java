package JavaPillars;

import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getItemDetails() {
        System.out.println("Item Name: " + getItemName());
        System.out.println();
        System.out.println("Price: " + getPrice());
        System.out.println();
        System.out.println("Quantity: " + getQuantity());
        System.out.println();
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println();
        System.out.println("Discount Info: " + getDiscountInfo());
        System.out.println();
    }

    protected String getDiscountInfo() {
        return "No Discount Available";
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            this.discount = percent;
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount: " + discount + "%";
    }

    @Override
    protected String getDiscountInfo() {
        return getDiscountDetails();
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge;
    private double discount;

    NonVegItem(String itemName, double price, int quantity, double extraCharge) {
        super(itemName, price, quantity);
        this.extraCharge = extraCharge;
        this.discount = 0;
    }

    public double getExtraCharge() {
        return extraCharge;
    }

    public void setExtraCharge(double extraCharge) {
        this.extraCharge = extraCharge;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + extraCharge) * getQuantity();
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            this.discount = percent;
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: " + discount + "%";
    }

    @Override
    protected String getDiscountInfo() {
        return getDiscountDetails();
    }
}

public class Ques_6 {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem v1 = new VegItem("Paneer Tikka", 250, 2);
        NonVegItem n1 = new NonVegItem("Chicken Biryani", 300, 3, 50);

        v1.applyDiscount(10);
        n1.applyDiscount(5);

        order.add(v1);
        order.add(n1);

        for (FoodItem item : order) {
            item.getItemDetails();
        }
    }
}