package String_Day_3;

import java.util.*;

public class Q_1 {
	public static void main(String...args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the s1 : ");
		
		String s1 = in.nextLine();
		
		System.out.println("Enter the s1 : ");
		
		String s2 = in.nextLine();
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		in.close();
	}
}
