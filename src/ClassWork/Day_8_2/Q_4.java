package ClassWork.Day_8_2;

import java.util.Scanner;

public class Q_4 {
	
	public static int fibonacci(int n) {
        if (n == 0) return 0;      
        if (n == 1) return 1;      
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter number of terms: ");
        int n = in.nextInt();

        System.out.print("fibonacci sequence is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        in.close();
    }
}
