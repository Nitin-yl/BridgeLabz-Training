package ClassWork.Day_8_2;

import java.util.Scanner;

public class Q_6 {	
	
	public static int input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return in.nextInt();
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void show(int n, long ans) {
        System.out.println("Factorial of " + n + " is = " + ans);
    }

    public static void main(String[] args) {
        int num = input();           
        long fact = factorial(num);     
        show(num, fact);       
    }
	
}
