package Java_Class_and_Object.Level_1;

public class Q_1 {

    public static class Employee {
        String name;
        int id;
        double salary;

        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public void show() {
            System.out.println("Name   : " + name);
            System.out.println("ID     : " + id);
            System.out.println("Salary : $" + salary);
            System.out.println();
        }
    }

    public static void main(String... args) {
        Employee emp1 = new Employee("Nitin", 101, 50000);
        Employee emp2 = new Employee("Shubham", 102, 60000);

        emp1.show();
        emp2.show();
    }
}
