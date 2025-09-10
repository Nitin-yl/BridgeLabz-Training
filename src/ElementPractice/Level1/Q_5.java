package ElementPractice.Level1;

public class Q_5 {
	public static void main(String...args) {
		int totalPens = 14;
        int students = 3;

        int penStudent = totalPens / students;   
        int remainingPens = totalPens % students;    

        System.out.println("Each student :  " + penStudent + " pens.");
        System.out.println("Remaining : " + remainingPens);
	}
}
