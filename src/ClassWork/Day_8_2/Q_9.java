package ClassWork.Day_8_2;

import java.util.Scanner;

public class Q_9 {
	public static double add(double a, double b) { return a + b; }
    public static double sub(double a, double b) { return a - b; }
    public static double mul(double a, double b) { return a * b; }
    public static double div(double a, double b) { return b==0 ? 0 : a / b; }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = in.nextInt();

        System.out.print("Enter second number: ");
        int y = in.nextInt();

        System.out.print("Choose (+,-,*,/): ");
        char op = in.next().charAt(0);

        double res = 0;
        if (op == '+') res = add(x,y);
        else if (op == '-') res = sub(x,y);
        else if (op == '*') res = mul(x,y);
        else if (op == '/') res = div(x,y);
        else System.out.println("Invalid!");

        System.out.println("Result = " + res);
    }
}
