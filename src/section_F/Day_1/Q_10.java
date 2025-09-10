package section_F.Day_1;

import java.util.*;

public class Q_10 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the distance in Kilometer : ");
        int distance_in_Kilometers = in.nextInt();

        double Miles = distance_in_Kilometers * 0.621371;

        System.out.println("Distance in Miles : " + Miles);

        in.close();
    }
}	
