package Constructors.Level_1;

public class Q_3 {
    public static class Person {
        private String name;
        private int age;

        public Person() {
            this.name = "Unknown";
            this.age = 0;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person(Person other) {
            this.name = other.name;
            this.age = other.age;
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String... args) {
        Person p1 = new Person("Nitin", 20);
        System.out.println("Original :");
        p1.display();

        System.out.println();

        Person p2 = new Person(p1);
        System.out.println("Cloned :");
        p2.display();
    }
}
