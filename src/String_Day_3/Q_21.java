package String_Day_3;

import java.util.Scanner;

public class Q_21 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str = sc.nextLine();
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();
        boolean found = false;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Substring found!");
        } else {
            System.out.println("Substring not found.");
        }

    }
}
