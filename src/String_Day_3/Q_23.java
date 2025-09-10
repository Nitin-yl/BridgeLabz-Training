package String_Day_3;

import java.util.Scanner;
import java.util.Arrays;

public class Q_23 {
	public static boolean haveSame(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		System.out.print("Enter string 2: ");
		String str2 = sc.nextLine();
		if (haveSame(str, str2)) {
			System.out.println("Have Same Set");
		} else {
			System.out.println("Have Different Set");
		}

	}
}
