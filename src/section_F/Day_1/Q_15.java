package section_F.Day_1;

class Exampl {
    
    int number = 50;

    void show() {
        int number;
//         System.out.println("Local variable : " + number); 
         System.out.println("Instance variable : " + this.number);
    }
}

public class Q_15 {
	public static void main(String[] args) {
        Exampl obj = new Exampl();
        obj.show();
    }
}
