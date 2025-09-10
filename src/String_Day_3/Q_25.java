package String_Day_3;

import java.util.*;

public class Q_25 {
	public static void permute(char[] str, int left, int right) {
        if (left == right) {

            for (int i = 0; i <= right; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
        } else {
            for (int i = left; i <= right; i++) {

                swap(str, left, i);

                permute(str, left + 1, right);

                swap(str, left, i);
            }
        }

    }

    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] arr = input.toCharArray();
        int n = arr.length;

        System.out.println("All permutations of the string are:");
        permute(arr, 0, n - 1);
    }
}
