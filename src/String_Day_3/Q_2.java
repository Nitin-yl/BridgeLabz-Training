package String_Day_3;

import java.util.Scanner;

public class Q_2 {
	
	public static String upper(String s) {	
		String ans = ""; 
 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch>='a' && ch<='z') {
                ch = (char)(ch - 32); 
            }
            
            ans += ch;
        }
        
        return ans;
	}
	
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String s = in.nextLine();
		
		System.out.println(upper(s));
		
		in.close();
	}
}
