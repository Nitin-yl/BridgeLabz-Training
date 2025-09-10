package String_Level_2;

import java.util.*;

public class Q_7 {
	public static int[] makeArray(String str) {
	    int n = str.length();
	    int start = 0, end = n - 1;

	    while (start < n && str.charAt(start) == ' ') {
	      start++;
	    }

	    while (end >= 0 && str.charAt(end) == ' ') {
	      end--;
	    }

	    return new int[] { start, end };
	  }

	  public static String makeSubstring(String str, int start, int end) {
	    String result = "";
	    for (int i = start; i <= end; i++) {
	      result += str.charAt(i);
	    }
	    return result;
	  }

	  public static boolean compareStrings(String s1, String s2) {
	    if (s1.length() != s2.length()) {
	      return false;
	    }

	    for (int i = 0; i < s1.length(); i++) {
	      if (s1.charAt(i) != s2.charAt(i)) {
	        return false;
	      }
	    }
	    return true;
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a string with spaces: ");
	    String text = sc.nextLine();

	    int[] range = makeArray(text);

	    String s = "";
	    if (range[0] <= range[1]) {
	      s = makeSubstring(text, range[0], range[1]);
	    }

	    String str = text.trim();

	    boolean same = compareStrings(s, str);

	    System.out.println("Manual Trimmed String: \"" + s + "\"");
	    System.out.println("Built-in Trimmed String: \"" + str + "\"");
	    System.out.println("Are both equal? " + same);
	  }
}
