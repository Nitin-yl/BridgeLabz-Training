package Constructors;

public class Q_4 {

    static class Student {
        public int rollNumber;
        protected String name;
        private double cgpa;

        public Student(int rollNumber, String name, double cgpa) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.cgpa = cgpa;
        }

        public double CGPA() {
            return cgpa;
        }

        public void CGPA(double cgpa) {
            this.cgpa = cgpa;
        }

        public void displayStudent() {
            System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + cgpa);
        }
    }

    static class PostgraduateStudent extends Student {
        private String specialization;

        public PostgraduateStudent(int roll, String name, double cgpa, String specialization) {
            super(roll, name, cgpa);
            this.specialization = specialization;
        }

        public void displayPostgrad() {
            System.out.println("PG Student - Name: " + name + ", Specialization: " + specialization);
        }
    }

    public static void main(String... args) {
        Student s = new Student(101, "Rahul", 8.4);
        s.displayStudent();
        s.CGPA(9.0);
        System.out.println("Updated CGPA: " + s.CGPA());

        PostgraduateStudent pg = new PostgraduateStudent(201, "Anjali", 9.2, "AI");
        pg.displayStudent();
        pg.displayPostgrad();
    }
}
