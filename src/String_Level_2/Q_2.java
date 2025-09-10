package String_Level_2;

import java.util.*;

public class Q_2 {
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

	  public static boolean compareArrays(String[] arr1, String[] arr2) {
	    if (arr1.length != arr2.length) {
	      return false;
	    }
	    for (int i = 0; i < arr1.length; i++) {
	      if (!arr1[i].equals(arr2[i])) {
	        return false;
	      }
	    }
	    return true;
	  }

	  public static void printArray(String[] arr) {
	    for (String s : arr) {
	      System.out.print(s);
	    }
	    System.out.println();
	  }

	  public static String[] customSplit(String text) {
	    int length = findLn(text);

	    int wordCnt = 1;
	    for (int i = 0; i < length; i++) {
	      if (text.charAt(i) == ' ') {
	        wordCnt++;
	      }
	    }

	    String[] words = new String[wordCnt];
	    int start = 0, wordIdx = 0;

	    for (int i = 0; i < length; i++) {
	      if (text.charAt(i) == ' ') {
	        words[wordIdx] = text.substring(start, i);
	        wordIdx++;
	        start = i + 1;
	      }
	    }

	    words[wordIdx] = text.substring(start, length);

	    return words;
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a sentence: ");
	    String text = sc.nextLine();
	    String[] customWords = customSplit(text);
	    String[] builtinWords = text.split(" ");

	    boolean areEqual = compareArrays(customWords, builtinWords);

	    System.out.println("\nCustom split result: ");
	    printArray(customWords);

	    System.out.println("\n Using Built-in split() result: ");
	    printArray(builtinWords);

	    System.out.println("\nAre both arrays equal? " + areEqual);

	  }
}
