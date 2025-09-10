package String_Level_1;

import java.util.*;

public class Q_9 {
	public static String customUpperCase(String text) {
	    String result = "";
	    for (int i = 0; i < text.length(); i++) {
	      char ch = text.charAt(i);
	      if (ch >= 'a' && ch <= 'z') {

	        ch = (char) (ch - 32);
	      }
	      result += ch;
	    }
	    return result;
	  }

	  public static boolean compare(String s1, String s2) {
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

	    System.out.print("Enter text: ");
	    String text = sc.nextLine();

	    String customUpper = customUpperCase(text);

	    String builtinUpper = text.toUpperCase();

	    boolean res = compare(customUpper, builtinUpper);

	    System.out.println("Custom Uppercase: " + customUpper);
	    System.out.println("Built-in Uppercase: " + builtinUpper);
	    System.out.println("Are both results equal? " + res);
	  }
}
