package section_F.Day_1;

import java.util.*;

public class Q_4 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the radius the of circle : ");
        int radius = in.nextInt();

        double area = 3.14 * radius*radius;
        
        System.out.println("Area of a Circle is : " + area);

        in.close();
    }
}
