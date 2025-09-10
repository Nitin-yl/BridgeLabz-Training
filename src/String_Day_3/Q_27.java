package String_Day_3;

import java.util.*;

public class Q_27 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string 1: ");
	        String str = sc.nextLine();
	        System.out.print("Enter replace Value From: ");
	        String from = sc.nextLine();
	        System.out.print("Enter replace Value To: ");
	        String to = sc.nextLine();

	        String rec = replace(str, from, to);
	        System.out.println(rec);
	    }

	    public static String replace(String str, String from, String to) {
	        String result = "";
	        int i = 0;
	        while (i < str.length()) {
	            boolean match = true;
	            for (int j = 0; j < from.length(); j++) {
	                if (i + j >= str.length() || str.charAt(i + j) != from.charAt(j)) {
	                    match = false;
	                    break;
	                }
	            }

	            if (match) {
	                result += to;
	                i += from.length();
	            } else {
	                result += str.charAt(i);
	                i++;
	            }
	        }
	        return result;

	    }
}
