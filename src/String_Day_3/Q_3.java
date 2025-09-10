package String_Day_3;

import java.util.*;

public class Q_3 {
	
	public static int VowelCount(String s) {
		
		int count = 0;
		
		for(int i = 0 ;i < s.length(); i++ ) {
			char ch = s.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U'){
				count++;
			}
		}
		return count;
	}
	
	
	
	public static  void main(String...args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String s = in.nextLine();
		
		System.out.println(VowelCount(s));
		
		in.close();
	}
}
