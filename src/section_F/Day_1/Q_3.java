package section_F.Day_1;

import java.util.*;

public class Q_3 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius : ");
        float cel = in.nextFloat();

        double fahrenheit = (cel * 9/5) + 32;

        System.out.println("Temperature in fahrenheit is : " + fahrenheit);

        in.close();
    }
}
