package ClassWork.Day_8_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_3 {
	public static void main(String...args) {
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter fom1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fom2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter fom3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		
		System.out.println("fom1 : " + date.format(fom1));
		System.out.println("fom2 : " + date.format(fom2));
		System.out.println("fom3 : " + date.format(fom3));
	}
}
