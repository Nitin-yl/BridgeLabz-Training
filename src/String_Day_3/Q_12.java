package String_Day_3;

import java.util.*;

public class Q_12 {
	public static boolean Anagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        int count =0;
        for(int i =0;i<c.length;i++){
            if(c[i]==d[i]){
                count ++;
            }
        }
        if(count == c.length) return true;
        else return false;
    }
	
	public static  void main(String...args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the S1 : ");
		
		String s1 = in.nextLine();
		
		System.out.println("Enter the S2 : ");
		
		String s2 = in.nextLine();
		
		System.out.println(Anagram(s1,s2));
		
		in.close();
	}
}
