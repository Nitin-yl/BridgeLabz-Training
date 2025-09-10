package String_Day_3;

import java.util.Scanner;

public class Q_7 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        
        String s = in.nextLine();

        String[] words = s.split(" ");  
        
        int wordCount = words.length;

        System.out.println("number of words: " + wordCount);

        in.close();
    }
}
