package ElementPractice.Level1;

import java.util.*;

public class Q_10 {
	public static void main(String...args) {
		 Scanner in = new Scanner(System.in);

	        System.out.print("Enter your height in centimeters: ");
	        double height = in.nextDouble();

	        double totalInches = height / 2.54;

	        int feet = (int) (totalInches / 12);
	        double inches = totalInches % 12;

	        System.out.println("Your height is " + feet + " feet and " + inches + " inches.");
	}
}
