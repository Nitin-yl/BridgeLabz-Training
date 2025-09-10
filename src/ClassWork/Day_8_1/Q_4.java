package ClassWork.Day_8_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q_4 {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);

	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	    System.out.print("Enter first date : ");
	    LocalDate date1 = LocalDate.parse(in.nextLine(), formatter);

	    System.out.print("Enter second date : ");
	    LocalDate date2 = LocalDate.parse(in.nextLine(), formatter);
	    
	    if (date1.isBefore(date2)) {
	    	System.out.println("first date is before the second date.");
	      } 
	    else if (date1.isAfter(date2)) {
	        System.out.println("first date is after the second date.");
	      } 
	    else if (date1.isEqual(date2)) {
	        	System.out.println("both dates are the same.");
	    }  	
	}
}
