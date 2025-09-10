package Element_Practice.Level2;

import java.util.*;

public class Q_7 {
	public static void main(String...args) {
		 Scanner in = new Scanner(System.in);

	     System.out.print("Enter value of a: ");
	     int a = in.nextInt();

	     System.out.print("Enter value of b: ");
         int b = in.nextInt();

	     System.out.print("Enter value of c: ");
	     int c = in.nextInt();

	     int result1 = a + b * c;        
         int result2 = a * b + c;        
         int result3 = c + a / b;        
         int result4 = a % b + c;        


	     System.out.println("a + b * c = " + result1);
         System.out.println("a * b + c = " + result2);
         System.out.println("c + a / b = " + result3);
         System.out.println("a % b + c = " + result4);
	}
}
