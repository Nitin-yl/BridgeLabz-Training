package ElementPractice.Level1;

import java.util.*;

public class Q_16 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = in.nextInt();

        int max = n * (n - 1) / 2;

        System.out.println("Maximum number of handshakes id : " + max);

	}
}
