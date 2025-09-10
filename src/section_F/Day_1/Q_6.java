package section_F.Day_1;

import java.util.*;

public class Q_6 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal : ");
        int principal = in.nextInt();

        System.out.println("Enter the rate : ");
        double rate = in.nextDouble();

        System.out.println("Enter the time : ");
        int time = in.nextInt();

        int simple_interset = (int)(principal * rate * time) / 100 ;

        System.out.println("Simple interset is : " + simple_interset);

        in.close();
    }
}
