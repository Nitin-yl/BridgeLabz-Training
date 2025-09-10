package String_Day_3;

import java.util.Scanner;

public class Q_15 {
	
	public static boolean Digits(String s) {
        
		for (int i = 0; i < s.length(); i++) {
            
        	if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        	
        }
        
        return s.length() > 0; 
    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        
        String s = in.nextLine();

        if (Digits(s)) {
            System.out.println("string contains only digits");
        }
        else {
            System.out.println("string does not contain only digits");
        }

        in.close();
    }
}
