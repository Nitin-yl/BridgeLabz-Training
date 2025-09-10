package String_Level_2;

import java.util.*;

public class Q_3 {
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

	  public static String[] splitWords(String text) {
	    int n = findLn(text);
	    String word = "";
	    String[] temp = new String[n];
	    int index = 0;

	    for (int i = 0; i < n; i++) {
	      char c = text.charAt(i);
	      if (c != ' ') {
	        word += c;
	      } else {
	        if (!word.equals("")) {
	          temp[index++] = word;
	          word = "";
	        }
	      }
	    }

	    if (!word.equals("")) {
	      temp[index++] = word;
	    }

	    String[] result = new String[index];
	    for (int i = 0; i < index; i++) {
	      result[i] = temp[i];
	    }
	    return result;
	  }

	  public static String[][] getArray(String[] words) {
	    String[][] arr = new String[words.length][2];
	    for (int i = 0; i < words.length; i++) {
	      arr[i][0] = words[i];
	      arr[i][1] = String.valueOf(findLn(words[i]));
	    }
	    return arr;
	  }

	  public static void display(String[][] arr) {

	    for (int i = 0; i < arr.length; i++) {
	      String word = arr[i][0];
	      int len = Integer.parseInt(arr[i][1]);
	      System.out.println(word + "\t" + len);
	    }
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a sentence: ");
	    String text = sc.nextLine();
	    String[] words = splitWords(text);
	    String[][] arr = getArray(words);
	    display(arr);

	  }
}
