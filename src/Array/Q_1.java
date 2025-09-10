package Array;
import java.util.*;
public class Q_1 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total student : ");
		int n = in.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the students age : ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i = 0 ;i <n;i++) {
			if(arr[i] >= 18) System.out.println("Student can vote ");
			else System.out.println("Student can't vote ");
		}
	}
}
