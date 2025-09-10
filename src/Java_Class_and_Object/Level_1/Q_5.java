package Java_Class_and_Object.Level_1;

public class Q_5 {

    public static class MobilePhone {
        String brand;
        String model;
        double price;

        MobilePhone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        void show() {
            System.out.println("Brand : " + brand);
            System.out.println("Model : " + model);
            System.out.println("Price : ₹" + price);
            System.out.println();
        }
    }

    public static void main(String... args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 75000);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 120000);

        phone1.show();
        phone2.show();

    }
}
