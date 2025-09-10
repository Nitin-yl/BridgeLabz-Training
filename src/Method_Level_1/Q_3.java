package Method_Level_1;

import java.util.*;

public class Q_3 {
    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        int handshake = calculateHandshakes(students);

        System.out.println("The maximum number of handshakes among " + students +
            " students is: " + handshake);
    }
}
