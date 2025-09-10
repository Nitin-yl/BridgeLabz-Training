package StaticVariable;

class Vehicle {
    static double registrationFee = 5000.0;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("owner Name : " + ownerName);
            System.out.println("vehicle Type : " + vehicleType);
            System.out.println("registration Number : " + registrationNumber);
            System.out.println("registration Fee : " + registrationFee);
        } else {
            System.out.println("Invalid Vehicle object.");
        }
    }
}

public class Q_6 {
    public static void main(String... args) {
        Vehicle v1 = new Vehicle("Nitin Goyal", "Car", "DL1074262");
        Vehicle v2 = new Vehicle("Amit Sharma", "Bike", "DL965485");

        System.out.println("Vehicle Details Before Fee Update");
        v1.displayDetails();
        System.out.println();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("Vehicle Details After Fee Update ");
        v1.displayDetails();
        System.out.println();
        v2.displayDetails();
    }
}
