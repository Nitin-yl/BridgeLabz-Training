package ElementPractice.Level1;

import java.util.*;

public class Q_14 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = in.nextDouble();

        double yards = feet / 3.0;

        double miles = feet / 5280.0;

        System.out.println("Distance in yards: " + yards);
        System.out.println("Distance in miles: " + miles);
	}
}
