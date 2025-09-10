package String_Day_3;

import java.util.Scanner;

public class Q_18 {
	
	public static String longest(String s) {
        String[] words = s.split(" ");
        String ans = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > ans.length()) {
                ans = words[i];
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        
        String s = in.nextLine();

        String longest = longest(s);
        
        System.out.println("Longest word: " + longest);

        in.close();
    }
}
