package Control_Flow.Level_1;

import java.util.Scanner;

public class Q_8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--; 
        }
        System.out.println("Rocket Launched!");
    }
}
