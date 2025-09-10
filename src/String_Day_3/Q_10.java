package String_Day_3;

import java.util.Scanner;

public class Q_10 {
	
	public static void reverse(String s) {
		String[] words = s.split(" ");  
		
		String ans = "";
		
		for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rev += word.charAt(j);
            }

            ans += rev + " ";
        }

		System.out.println("Reversed sentence: " + ans.trim());
		
	}
	
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        
        String s = in.nextLine();

        reverse(s);
        
        in.close();
	}
}
