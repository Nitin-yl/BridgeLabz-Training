package String_Day_3;

import java.util.*;

public class Q_26 {
	public static boolean isShuffle(String str, String str2, String res) {
		if (str.length() + str2.length() != res.length()) {
			return false;
		}
		int i = 0, j = 0, k = 0;
		while (k < res.length()) {

			if (i < str.length() && res.charAt(k) == str.charAt(i)) {
				i++;
			}

			else if (j < str2.length() && res.charAt(k) == str2.charAt(j)) {
				j++;
			}

			else {
				return false;
			}
			k++;
		}

		return (i == str.length() && j == str2.length());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		System.out.print("Enter string 2: ");
		String str2 = sc.nextLine();
		System.out.print("Enter result string: ");
		String result = sc.nextLine();
		if (isShuffle(str, str2, result)) {
			System.out.println("Shuffled");
		} else {
			System.out.println("Not A Shuffled");
		}

	}
}
