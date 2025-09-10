package section_F.Day_1;

import java.util.*;

public class Q_9 {
	 public static void main(String...args){
	        Scanner in = new Scanner(System.in);

	        System.out.println("Enter the first number : ");
	        int num1 = in.nextInt();

	        System.out.println("Enter the second number : ");
	        int num2 = in.nextInt();

	        System.out.println("Enter the thrid number : ");
	        int num3 = in.nextInt();

	        int avg = (num1 + num2 + num3) / 3 ;

	        System.out.println("Average of three number : " + avg );

	        in.close();
	    }
}
