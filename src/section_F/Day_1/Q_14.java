package section_F.Day_1;

class Example {
    int number = 50;

    void showNumber() {
        int number = 100; 
        System.out.println("Local variable : " + number);
        System.out.println("Instance variable : " + this.number);
    }
}

public class Q_14 {
	public static void main(String[] args) {
        Example obj = new Example();
        obj.showNumber();
    }
}
