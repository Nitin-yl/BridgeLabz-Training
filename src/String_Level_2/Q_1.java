package String_Level_2;

import java.util.*;

public class Q_1 {
	public static int findLn(String text) {
	    int cnt = 0;
	    try {
	      while (true) {
	        text.charAt(cnt);
	        cnt++;
	      }
	    } catch (StringIndexOutOfBoundsException e) {
	      return cnt;
	    }
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a string: ");
	    String text = sc.next();
	    int len = findLn(text);
	    int builtLen = text.length();
	    System.out.println("Custom Length " + len);
	    System.out.print("Builtin Length " + builtLen);
	  }
}
