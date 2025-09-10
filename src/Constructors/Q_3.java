package Constructors;

public class Q_3 {

    public static class Vehicle {
        private String ownerName;
        private String vehicleType;

        private static double Fee = 500.0; 

        public Vehicle(String owner, String vehicleType) {
            this.ownerName = owner;
            this.vehicleType = vehicleType;
        }

        public void display() {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + Fee);
            System.out.println();
        }

        public static void update(double newFee) {
            Fee = newFee;
        }
    }

    public static void main(String... args) {
        Vehicle.update(800.0);

        Vehicle v1 = new Vehicle("Nitin", "Car");
        Vehicle v2 = new Vehicle("Ravi", "Bike");

        v1.display();
        v2.display();
    }
}
