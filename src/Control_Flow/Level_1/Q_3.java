package Control_Flow.Level_1;

import java.util.Scanner;

public class Q_3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        boolean FirstLargest = (number1 >= number2) && (number1 >= number3);
        boolean SecondLargest = (number2 >= number1) && (number2 >= number3);
        boolean ThirdLargest = (number3 >= number1) && (number3 >= number2);

        System.out.println("Is the first number the largest? " + FirstLargest);
        System.out.println("Is the second number the largest? " + SecondLargest);
        System.out.println("Is the third number the largest? " + ThirdLargest);

    }
}
