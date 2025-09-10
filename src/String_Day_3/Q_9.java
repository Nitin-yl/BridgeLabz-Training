package String_Day_3;

import java.util.Scanner;

public class Q_9 {
	
	public static void Ascii(String s) {
		
		for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch; 
            System.out.println(ch + " : " + ascii);
        }
	}
	
	public static void main(String...args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String s = in.nextLine();
		
		Ascii(s);
		
		in.close();
	}	
}
