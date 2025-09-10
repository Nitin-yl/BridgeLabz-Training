package ElementPractice.Level1;

import java.util.*;

public class Q_11 {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
  
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        double sub = num1 - num2;
        double prod = num1 * num2;
        double div = num1/num2;
        
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + prod);
        System.out.println("Division : "+ div);
	}
}
