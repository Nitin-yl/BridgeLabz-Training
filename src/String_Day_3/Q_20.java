package String_Day_3;

import java.util.Scanner;

public class Q_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str = sc.nextLine();
		String[] words = mySplit(str);
		System.out.println("Words:");
		for (String w : words) {
			System.out.println(w);
		}

	}

	public static String[] mySplit(String str) {
		int cntSpace = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				cntSpace++;
			}
		}
		String[] result = new String[cntSpace];
		String temp = "";
		int idx = 0;
		for (char c : str.toCharArray()) {
			if (c != ' ') {
				temp += c;

			} else {
				result[idx++] = temp;
				temp = "";
			}
		}
		result[idx] = temp;
		return result;
	}
}
