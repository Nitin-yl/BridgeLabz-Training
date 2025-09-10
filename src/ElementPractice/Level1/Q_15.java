package ElementPractice.Level1;

import java.util.*;

public class Q_15 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter the unit price of the item: ");
        double unitPrice = in.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = in.nextInt();

        double Price = unitPrice * quantity;

        System.out.println("Total price to be paid: " +  Price);
	}
}	
