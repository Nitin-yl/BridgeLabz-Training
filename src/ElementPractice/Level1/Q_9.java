package ElementPractice.Level1;

import java.util.*;

public class Q_9 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter the student fee: ");
        double fee = in.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double disc = in.nextDouble();

        double discAmt = (disc / 100) * fee;
        double finalPrice = fee - discAmt;

        System.out.println("Original Fee: " + fee);
        System.out.println("Discount Amount: " + discAmt);
        System.out.println("Price to Pay after Discount: " + finalPrice);
	}
}
