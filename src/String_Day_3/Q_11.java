package String_Day_3;

import java.util.*;

public class Q_11 {
	
	 public static String removeDuplicates(String s) {
	        String ans = "";
	        
	        for (int i = 0; i < s.length(); i++) {

	        	char ch = s.charAt(i);

	            if (ans.indexOf(ch) == -1) {
	                ans += ch;
	            }
	        }
	        
	        return ans;
	    }
	
	public static void main(String...args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String s = in.nextLine();
		
		String output = removeDuplicates(s);
	     
		System.out.println("String after revesing : " + output);
		
		in.close();
	}
}
