package String_Day_3;

import java.util.Scanner;

public class Q_17 {
	
	public static String change(String s) {
        String ans = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                ans += Character.toLowerCase(ch);
            } 
            else {
            	ans += Character.toUpperCase(ch);
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        
        String s = in.nextLine();

        String output = change(s);
        
        System.out.println("Toggled case : " + output);

        in.close();
    }
}
