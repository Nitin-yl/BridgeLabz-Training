package String_Level_1;

import java.util.*;

public class Q_3 {
	public static char[] charArray(String text) {
	    char[] arr = new char[text.length()];
	    for (int i = 0; i < text.length(); i++) {
	      arr[i] = text.charAt(i);
	    }
	    return arr;
	  }

	  public static boolean compare(char[] arr1, char[] arr2) {
	    if (arr1.length != arr2.length) {
	      return false;
	    }
	    for (int i = 0; i < arr1.length; i++) {
	      if (arr1[i] != arr2[i]) {
	        return false;
	      }
	    }
	    return true;
	  }

	  public static void printCharArray(char[] arr) {
	    for (char c : arr) {
	      System.out.print(c + " ");
	    }
	    System.out.println();
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a string: ");
	    String text = sc.next();

	    char[] arr1 = charArray(text);

	    char[] arr2 = text.toCharArray();

	    boolean res = compare(arr1, arr2);

	    System.out.print("Custom char array: ");
	    printCharArray(arr1);

	    System.out.print("Built-in toCharArray(): ");
	    printCharArray(arr2);

	    System.out.println("Are both arrays equal? " + res);
	  }
}	
