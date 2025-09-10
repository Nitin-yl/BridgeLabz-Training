package String_Day_3;

import java.util.Scanner;;

public class Q_14 {
	
	public static String capital(String s) {
        
        String[] words = s.trim().split("\\s+");  
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += Character.toUpperCase(words[i].charAt(0)) 
                    + words[i].substring(1) + " ";
        }

        return result.trim(); 
    }
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String s = in.nextLine();

        System.out.println("Capitalized: " + capital(s));

        in.close();
    }
}
