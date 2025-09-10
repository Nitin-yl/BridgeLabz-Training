package ElementPractice.Level1;

import java.util.*;

public class Q_8 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = in.nextDouble();

        double miles = km * 0.621371;

        System.out.println(km + " kilometers is equal to " + miles + " miles");

    }
}
