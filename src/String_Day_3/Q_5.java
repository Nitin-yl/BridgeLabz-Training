package String_Day_3;

import java.util.Scanner;

public class Q_5 {
	
	public static boolean CheckPalindrone(String s1 ) {
		String ans = "";
		
		for(int i = s1.length()-1 ; i >= 0; i--) {
			char ch = s1.charAt(i);
			ans += ch;
		}
		
		if(ans.equalsIgnoreCase(s1)) return true;
		return false;
	}
	
	
	public static void main(String...args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the S1 : ");
		
		String s1 = in.nextLine();
		
		System.out.println(CheckPalindrone(s1));
		
		in.close();
	}	
}
