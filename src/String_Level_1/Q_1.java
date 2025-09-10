package String_Level_1;

import java.util.*;

public class Q_1 {
	public static boolean compares(String s1, String s2) {
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

	    System.out.print("Enter first string: ");
	    String s1 = sc.next();
	    System.out.print("Enter second string: ");
	    String s2 = sc.next();
	    boolean isequal = compares(s1, s2);
	    boolean isequal2 = s1.equals(s2);
	    System.out.println("\nComparison using charAt(): " + isequal);
	    System.out.println("Comparison using equals(): " + isequal2);
	    if (isequal == isequal2) {
	      System.out.println("Both method are same");
	    } else {
	      System.out.println("Both method are different");
	    }
	  }
}
