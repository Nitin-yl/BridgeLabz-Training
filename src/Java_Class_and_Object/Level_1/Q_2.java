package Java_Class_and_Object.Level_1;

public class Q_2 {

    public static class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double Area() {
            return Math.PI * radius * radius;
        }

        double Circumference() {
            return 2 * Math.PI * radius;
        }

        void show() {
            System.out.println("Radius        : " + radius);
            System.out.println("Area          : " + Area());
            System.out.println("Circumference : " + Circumference());
            System.out.println();
        }
    }

    public static void main(String... args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7.5);

        c1.show();
        c2.show();
    }
}
