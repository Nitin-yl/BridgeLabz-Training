package String_Day_3;

import java.util.Scanner;

public class Q_4 {
	
	public static int length(String s) {
		
		int count = 0;
		
		for(int i = 0 ;i < s.length(); i++ ) {
			count++;
		}
		
		return count;
	}
	
	public static void main(String...args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String s = in.nextLine();
		
		System.out.println(length(s));
		
		in.close();
		
		
	}
}
