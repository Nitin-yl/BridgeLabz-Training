package Constructors;

class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

public class Q_7 {
    public static void main(String... args) {
        Manager mgr = new Manager("E101", "Sales", 75000);
        mgr.display();
        mgr.setSalary(80000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
