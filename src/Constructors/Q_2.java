package Constructors;

public class Q_2 {

    public static class Course {
        private String course;
        private int duration; 
        private double fee;

        private static String institute = "Default Institute";

        public Course(String courseName, int duration, double fee) {
            this.course = courseName;
            this.duration = duration;
            this.fee = fee;
        }

        public void displayCourseDetails() {
            System.out.println("Institute : " + institute);
            System.out.println("Course Name : " + course);
            System.out.println("Duration : " + duration + " months");
            System.out.println("Fee : " + fee);
            System.out.println();
        }

        public static void update(String newName) {
            institute = newName;
        }
    }

    public static void main(String... args) {
        Course.update("CodeAcademy Institute");

        Course c1 = new Course("Java Programming", 3, 7500.0);
        Course c2 = new Course("Web Development", 4, 9500.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
