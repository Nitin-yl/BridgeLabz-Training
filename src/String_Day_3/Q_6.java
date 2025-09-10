package String_Day_3;

import java.util.Scanner;

public class Q_6 {
	public static char NonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }
        
        return '-'; 
    }

    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Enter the string : ");
    	
    	String s = in.nextLine();
    	
        char ans = NonRepeating(s);

        if  (ans != '-') {
            System.out.println("non-repeating character is : " + ans);
        } 
        else {
            System.out.println("No non-repeating character found");
        }
        
        in.close();
    }
}
