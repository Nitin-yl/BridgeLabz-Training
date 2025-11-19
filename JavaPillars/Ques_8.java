package JavaPillars;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public void getVehicleDetails(double distance) {
        System.out.println("Vehicle ID: " + getVehicleId());
        System.out.println();
        System.out.println("Driver Name: " + getDriverName());
        System.out.println();
        System.out.println("Rate per Km: " + getRatePerKm());
        System.out.println();
        System.out.println("Fare for " + distance + " km: " + calculateFare(distance));
        System.out.println();
        System.out.println("Location Info: " + getLocationInfo());
        System.out.println();
    }

    protected String getLocationInfo() {
        return "GPS not available";
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
    String getLocationDetails();
}

class Car extends Vehicle implements GPS {
    private String currentLocation;

    Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }

    @Override
    public String getLocationDetails() {
        return "Car Location: " + currentLocation;
    }

    @Override
    protected String getLocationInfo() {
        return getLocationDetails();
    }
}

class Bike extends Vehicle {
    Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Auto extends Vehicle implements GPS {
    private String currentLocation;

    Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }

    @Override
    public String getLocationDetails() {
        return "Auto Location: " + currentLocation;
    }

    @Override
    protected String getLocationInfo() {
        return getLocationDetails();
    }
}

public class Ques_8 {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();

        Car c1 = new Car("CAR101", "Akshat", 15);
        Bike b1 = new Bike("BIKE202", "Ravi", 8);
        Auto a1 = new Auto("AUTO303", "Priya", 10);

        c1.updateLocation("Sector 5");
        a1.updateLocation("Main Bazaar");

        rides.add(c1);
        rides.add(b1);
        rides.add(a1);

        for (Vehicle v : rides) {
            v.getVehicleDetails(12);
        }
    }
}