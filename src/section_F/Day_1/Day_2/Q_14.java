package section_F.Day_1.Day_2;

class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Name: " + name);
    }
}

public class Q_14 {
	public static void main(String[] args) {
        Student s = new Student();
        s.setName("Nitin");
        s.show();
    }
}
