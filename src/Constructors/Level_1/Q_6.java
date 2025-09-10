package Constructors.Level_1;

public class Q_6 {

    public static class CarRental {
        private String customerName;
        private String carModel;
        private int rentalDays;
        private double dailyRate;

        public CarRental() {
            this.customerName = "Unknown Customer";
            this.carModel = "Standard Model";
            this.rentalDays = 1;
            this.dailyRate = 1000.0;  
        }

        public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
            this.dailyRate = dailyRate;
        }

        public double calculateTotalCost() {
            return rentalDays * dailyRate;
        }

        public void displayRentalInfo() {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Car Model: " + carModel);
            System.out.println("Rental Days: " + rentalDays);
            System.out.println("Daily Rate : " + dailyRate);
            System.out.println("Total Cost : " + calculateTotalCost());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        System.out.println("Default : ");
        rental1.displayRentalInfo();

        CarRental rental2 = new CarRental("Nitin Goyal", "BMW M5", 5, 1500.0);
        System.out.println("Custom : ");
        rental2.displayRentalInfo();
    }
}
