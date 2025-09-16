package oops_Design;

import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void show() {
        System.out.println("Department: " + name);
        for (Employee e : employees) e.show();
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void show() {
        System.out.println("Company: " + name);
        for (Department d : departments) d.show();
    }
}

public class Q_3 {
    public static void main(String... args) {
        Company c = new Company("LawyerWala");

        Department d1 = new Department("Lawyer");
        d1.addEmployee("Rahul");
        d1.addEmployee("Priya");

        Department d2 = new Department("HR");
        d2.addEmployee("Amit");

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.show(); 
    }
}
