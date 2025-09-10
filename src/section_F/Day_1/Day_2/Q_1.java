package section_F.Day_1.Day_2;

class Car{
    String model;
    int year;


    void details(String model , int year){
        this.model = model;
        this.year = year;
    }  

    void Display(){
        System.out.println("Model : " + model + " Year : " + year);
    }
}


public class Q_1 {
	public static void main(String[] args) {
        Car obj1 = new Car();
        Car obj2 = new Car();;

        obj1.details("XUV-700", 2024);
        obj2.details("Nexon", 2023);

        obj1.Display();
        obj2.Display();

    }
}
