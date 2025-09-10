package ElementPractice.Level1;

import java.util.*;

public class Q_12 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of the triangle : ");
        double inches = in.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double heightInches = in.nextDouble();

        double areaInches = 0.5 *inches * heightInches;

        double areaCm = areaInches * 2.54 * 2.54;

        System.out.println("Area of triangle in square inches: " + areaInches);
        System.out.println(" Area of triangle in square centimeters: " + areaCm);
	}
}
