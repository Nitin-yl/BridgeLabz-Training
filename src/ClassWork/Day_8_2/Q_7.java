package ClassWork.Day_8_2;

import java.util.Scanner;

public class Q_7 {
	public static int input(String s) {
        Scanner in = new Scanner(System.in);
        System.out.print(s);
        return in.nextInt();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void show(int a, int b, int gcd, int lcm) {
        System.out.println("gcd is " + gcd);
        System.out.println("lcm is " + lcm);
    }

    public static void main(String[] args) {
        int num1 = input("Enter first number: ");
        int num2 = input("Enter second number: ");

        int g = gcd(num1, num2);
        int l = lcm(num1, num2);

        show(num1, num2, g, l);
    }
}
