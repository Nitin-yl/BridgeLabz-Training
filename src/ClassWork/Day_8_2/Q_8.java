package ClassWork.Day_8_2;

import java.util.Scanner;

public class Q_8 {
	public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double a = in.nextDouble();

        System.out.print("Convert to (C/F): ");
        char ch = in.next().charAt(0);

        if (ch == 'C' || ch == 'c')System.out.println(toCelsius(a) + " C");
        else if (ch == 'F' || ch == 'f') System.out.println(toFahrenheit(a) + " F");
        else  System.out.println("Wrong choice!");
    }
}
