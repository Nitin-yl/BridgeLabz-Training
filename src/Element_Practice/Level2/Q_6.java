package Element_Practice.Level2;

import java.util.*;

public class Q_6 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int num1 = in.nextInt();

        System.out.print("Enter the divisor: ");
        int num2 = in.nextInt();

     
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int quotient = num1 / num2;
            int remainder = num2 % num2;

            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
	}
}
