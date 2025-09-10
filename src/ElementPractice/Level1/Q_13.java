package ElementPractice.Level1;

import java.util.*;

public class Q_13 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = in.nextDouble();

        double side = perimeter / 4;

        System.out.println("The side of the square is: " + side);
	}
}
