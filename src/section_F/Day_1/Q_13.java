package section_F.Day_1;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void Result() {
        if (marks >= 40) {
            System.out.println(name + " has Passed with " + marks + " marks.");
        } else {
            System.out.println(name + " has Failed with " + marks + " marks.");
        }
    }
}

public class Q_13 {
	public static void main(String[] args) {
        Student s1 = new Student("Shubham", 75);
        Student s2 = new Student("HariOM", 35);

        s1.Result();
        s2.Result();
    }
}
