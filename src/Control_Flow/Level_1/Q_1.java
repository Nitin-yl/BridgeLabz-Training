package Control_Flow.Level_1;

import java.util.Scanner;

public class Q_1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean Divisible = (number % 5 == 0);
        System.out.println("number " + number + " divisible by 5 " + Divisible);

    }
}
