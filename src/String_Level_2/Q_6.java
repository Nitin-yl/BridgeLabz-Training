package String_Level_2;

import java.util.*;

public class Q_6 {
	public static String checkChar(char ch) {

	    if (ch >= 'A' && ch <= 'Z') {
	      ch = (char) (ch + 32);
	    }

	    if (ch >= 'a' && ch <= 'z') {
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	        return "Vowel";
	      } else {
	        return "Consonant";
	      }
	    } else {
	      return "Not a Letter";
	    }
	  }

	  public static void display(String[][] arr) {

	    for (int i = 0; i < arr.length; i++) {
	      System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
	    }
	  }

	  public static String[][] check(String text) {
	    int n = text.length();
	    String[][] result = new String[n][2];

	    for (int i = 0; i < n; i++) {
	      char c = text.charAt(i);
	      result[i][0] = String.valueOf(c);
	      result[i][1] = checkChar(c);
	    }

	    return result;
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a string: ");
	    String input = sc.nextLine();

	    String[][] arr = check(input);

	    display(arr);
	  }
}
