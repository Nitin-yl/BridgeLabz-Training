package ClassWork.Day_8_2;

import java.util.Scanner;

public class Q_5 {
	public static String input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        return in.nextLine();
        
    }

    public static boolean CheckPalindrome(String s) {
        s = s.toLowerCase(); 
        String reverse = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return s.equals(reverse);
    }
    
    public static void show(String s, boolean ans) {
        if (ans) System.out.println(s + " is a palindrome.");
        else System.out.println(s + " is not a palindrome.");
    }
    
    public static void main(String[] args) {
        String s = input();            
        boolean ans = CheckPalindrome(s); 
        show(s, ans);  
    }
}
