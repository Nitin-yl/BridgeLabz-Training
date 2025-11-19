package JavaPillars;

import java.util.ArrayList;
import java.util.List;

abstract class Employee implements Department {
    private String employeeId;
    private String name;
    private double baseSalary;
    private String department;

    Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDepartment() {
        return department;
    }

   
    public void assignDepartment(String department) {
        this.department = department;
    }

  
    public String getDepartmentDetails() {
        return department == null ? "No Department Assigned" : department;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Calculated Salary: " + calculateSalary());
       
    }

    public abstract double calculateSalary();
}

interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee {
    private double allowance;
    FullTimeEmployee(String employeeId, String name, double baseSalary, double allowance) {
        super(employeeId, name, baseSalary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double calculateSalary() {
        return getBaseSalary() + allowance;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }
}

public class Ques_1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee f1 = new FullTimeEmployee("FT1001", "Priya Sharma", 50000, 8000);
        f1.assignDepartment("Engineering");
        FullTimeEmployee f2 = new FullTimeEmployee("FT1002", "Rohit Verma", 45000, 6000);
        f2.assignDepartment("HR");

        PartTimeEmployee p1 = new PartTimeEmployee("PT2001", "Anita Singh", 500, 80);
        p1.assignDepartment("Support");
        PartTimeEmployee p2 = new PartTimeEmployee("PT2002", "Vikram Yadav", 400, 60);
        p2.assignDepartment("Sales");

        employees.add(f1);
        employees.add(f2);
        employees.add(p1);
        employees.add(p2);

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}