package StaticVariable;

class Student {
    static String universityName = "IIT Bombay";
    static int totalStudents = 0;

    private String name;
    private final int rollNumber; 
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void StudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid Student object.");
        }
    }
}

public class Q_5 {
    public static void main(String... args) {
        Student st1 = new Student("Nitin Goyal", 2315001, 'O');
        Student st2 = new Student("Amit Sharma", 23150015, 'A');

        // Display details
        st1.StudentDetails();
        System.out.println();
        st2.StudentDetails();

        // Show total students
        Student.displayTotalStudents();
    }
}
