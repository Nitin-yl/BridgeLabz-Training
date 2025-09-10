package section_F.Day_1;

import java.util.*;

public class Q_5 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the radius of Cylinder : ");
        int radius = in.nextInt();

        System.out.println("Enter the height of Cylinder : ");
        int height = in.nextInt();

        double volume = 3.14 * radius * radius * height;

        System.out.println("Volume of the cyclinder is : " + volume);

        in.close();
    }
}
