package ElementPractice.Level1;

public class Q_6 {
	public static void main(String...args) {
		double fee = 125000;
        double disc = 10;
        
        double discAmt = (disc / 100) * fee;
        double finalPrice = fee - discAmt;
        
        System.out.println("Fee : " + fee);
        System.out.println("discount : " + discAmt);
        System.out.println("pay : " + finalPrice);
	}
}
