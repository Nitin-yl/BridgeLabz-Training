package String_Level_2;
import java.util.*;
public class Q_5 {
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

	  public static int[] count(String text) {
	    int vowels = 0, consonants = 0;

	    for (int i = 0; i < text.length(); i++) {
	      char c = text.charAt(i);
	      String result = checkChar(c);

	      if (result.equals("Vowel")) {
	        vowels++;
	      } else if (result.equals("Consonant")) {
	        consonants++;
	      }
	    }

	    return new int[] { vowels, consonants };
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a string: ");
	    String s = sc.nextLine();

	    int[] counts = count(s);

	    System.out.println("Number of Vowels: " + counts[0]);
	    System.out.println("Number of Consonants: " + counts[1]);
	  }
}
