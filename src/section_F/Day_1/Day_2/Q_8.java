package section_F.Day_1.Day_2;

class Exp {
    static int number; 
    
    static {
        number = 100;
        System.out.println(number);
    }
}

public class Q_8 {
	public static void main(String[] args) {
        System.out.println(Exp.number);
    }
}
