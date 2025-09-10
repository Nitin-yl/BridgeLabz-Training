package section_F.Day_1;

import java.util.*;

public class Q_8 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base : ");
        double base = in.nextDouble();
        
        System.out.println("Enter the exponent : ");
        double exponent = in.nextDouble();

        double ans = Math.pow(base , exponent);

        System.out.println("Answer is : " + ans);

        in.close();
    }
}
