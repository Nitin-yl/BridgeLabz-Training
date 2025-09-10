package StaticVariable;

class Employee {
    static String companyName = "LawyerWala";

    private static int totalEmployees = 0;
    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }


    private String name;
    private final int id; 
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; 
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name : " + companyName);
            System.out.println("Employee Name : " + name);
            System.out.println("Employee ID  : " + id);
            System.out.println("Designation  : " + designation);
        } else {
            System.out.println("Invalid Employee object.");
        }
    }
}

public class Q_3 {
    public static void main(String... args) {
        Employee emp1 = new Employee("Nitin Goyal", 10092005, "Founder");
        Employee emp2 = new Employee("Nav Goyal", 10092006, "Co-Founder");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();

        System.out.println();
        Employee.displayTotalEmployees();
    }
}
