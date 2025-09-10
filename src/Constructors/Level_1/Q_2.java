package Constructors.Level_1;

public class Q_2 {
	public static class Circle {
        private double radius;
        public Circle() {
            this(1.0); 
        }

        public Circle(double radius) {
            this.radius = radius;
        }
        public void display() {
            System.out.println("Radius: " + radius);
        }
	}   
	public static void main(String...args) {
		Circle c1 = new Circle();
		System.out.println("default : ");
        c1.display();
        
        Circle c2 = new Circle(5.5);
        System.out.println("user-provided : ");
        c2.display();
	}
}
