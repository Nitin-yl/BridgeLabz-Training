package section_F.Day_1;

class Employee{

    String name;
    int salary;

    Employee(String name){
        this.name = name;
    }

    Employee(String name , int salary){
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + " Salary: " + salary);
    }
}

public class Q_17 {
	public static void main(String[] args) {
        Employee e1 = new Employee("Nitin");
        e1.display();

        Employee e2 = new Employee("Ansh", 55000);
        e2.display();
    }
}
