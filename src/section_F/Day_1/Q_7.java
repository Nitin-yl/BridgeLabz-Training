package section_F.Day_1;

import java.util.*;

public class Q_7 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of rectangle : ");
        int length = in.nextInt();

        System.out.println("Enter the width of rectangle : ");
        int width = in.nextInt();

        int perimeter = 2 * (length * width);

        System.out.println("Perimeter of rectangle is : " + perimeter);

        in.close();
    }
}
