package ClassWork.Day_8_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q_2 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println("Enter the date : ");
		String s = in.nextLine();
		
		
		LocalDate date = LocalDate.parse(s,format);
		System.out.println("Original Date: " + date.format(format));
		
		LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
		System.out.println("new Date :" + newDate.format(format));
		
		LocalDate ans = newDate.minusWeeks(3);
		System.out.println("Answer : " + ans.format(format));
		
		
	}
}
