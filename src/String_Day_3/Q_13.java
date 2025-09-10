package String_Day_3;

import java.util.Scanner;

public class Q_13 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        System.out.print("Enter a string: ");

	        String s = in.nextLine();

	        String ans = s.replaceAll("[0-9]", "");

	        System.out.println("String without digits: " + ans);

	        in.close();
	    }
}
