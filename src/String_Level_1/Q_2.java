package String_Level_1;

import java.util.*;

public class Q_2 {
	public static String manualSubstring(String text, int start, int end) {
	    String res = "";
	    for (int i = start; i < end; i++) {
	      res += text.charAt(i);
	    }
	    return res;

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
	    System.out.print("Enter a string: ");
	    String text = sc.next();

	    System.out.print("Enter start index: ");
	    int start = sc.nextInt();
	    System.out.print("Enter end index: ");
	    int end = sc.nextInt();

	    String manualSub = manualSubstring(text, start, end);

	    String subs = text.substring(start, end);

	    boolean res = compareStrings(manualSub, subs);
	    System.out.println("\nManual Substring: " + manualSub);
	    System.out.println("Built-in Substring: " + subs);
	    System.out.println("Are both substrings equal? " + res);
	  }
}
