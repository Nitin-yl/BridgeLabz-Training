package String_Day_3;

import java.util.Scanner;

public class Q_8 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = in.nextLine();

        String ans = s.replace(" ", "-");

        System.out.println("new string : " + ans);

        in.close();
	}
}
