package section_F.Day_1;

class Car {

    String brand;
    int speed;

    static int wheels = 4;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Wheels: " + wheels);
    }
}

public class Q_11 {
	public static void main(String[] args) {
        Car car1 = new Car("Toyota", 120);
        Car car2 = new Car("Honda", 150);
        Car car3 = new Car("BMW",250 );

        car1.display();
        System.out.println();
        car2.display();
        System.out.println();
        car3.display();

    }
}
