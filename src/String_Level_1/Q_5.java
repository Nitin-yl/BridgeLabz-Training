package String_Level_1;

import java.util.*;

public class Q_5 {
	public static void generateException(String text) {
	    int invalidIndex = text.length();
	    System.out.println("Character at invalid index: " + text.charAt(invalidIndex));
	  }

	  public static void handleException(String text) {
	    int invalidIndex = text.length();
	    try {
	      System.out.println("Character at invalid index: " + text.charAt(invalidIndex));
	    } catch (StringIndexOutOfBoundsException e) {
	      System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
	    }
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a string: ");
	    String text = sc.nextLine();
	    // generateException(text);
	    handleException(text);

	  }
}
