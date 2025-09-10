package ClassWork.Day_8_2;

import java.util.Scanner;

public class Q_2 {
	public static int input(Scanner in, String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }
	
	public static int maximum(int a, int b, int c) {
        int max = a; 
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = input(in, "Enter first number: ");
        int num2 = input(in, "Enter second number: ");
        int num3 = input(in, "Enter third number: ");

        int max = maximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);

      in.close();
    }
}
