package section_F.Day_1.Day_2;

class Car1 {
    String model;
    int year;
    static int numberOfCar = 0;

    Car1(String model , int year){
        this.model = model;
        this.year = year;
        numberOfCar++;
    }

    void Display() {
        System.out.println("Model : " + model + " Year : " + year);
    }
}

public class Q_2 {
	public static void main(String[] args) {
        Car1 obj1 = new Car1("XUV-700", 2024);
        Car1 obj2 = new Car1("Nexon", 2023);
        
        obj1.Display();
        obj2.Display();

        System.out.println(Car1.numberOfCar);
    }
}
