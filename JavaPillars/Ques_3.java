package JavaPillars;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + getVehicleNumber());
        System.out.println();
        System.out.println("Type: " + getType());
        System.out.println();
        System.out.println("Rental Cost for " + days + " days: " + calculateRentalCost(days));
        System.out.println();
        System.out.println("Insurance Info: " + getInsuranceInfo());
        System.out.println();
    }

    protected String getInsuranceInfo() {
        return "Not Insurable";
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate;

    Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber, double insuranceRate) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.insuranceRate = insuranceRate;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

   
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

   
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    public String getInsuranceDetails() {
        return "Car Insurance: " + calculateInsurance();
    }

    
    protected String getInsuranceInfo() {
        return getInsuranceDetails();
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

   
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate;

    Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber, double insuranceRate) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.insuranceRate = insuranceRate;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate + 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: " + calculateInsurance();
    }

    @Override
    protected String getInsuranceInfo() {
        return getInsuranceDetails();
    }
}

public class Ques_3 {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();

        Car c1 = new Car("CAR101", 1500, "POL123CAR", 0.05);
        Bike b1 = new Bike("BIKE202", 500);
        Truck t1 = new Truck("TRUCK303", 3000, "POL789TRK", 0.08);

        fleet.add(c1);
        fleet.add(b1);
        fleet.add(t1);

        for (Vehicle v : fleet) {
            v.displayDetails(5);
        }
    }
}