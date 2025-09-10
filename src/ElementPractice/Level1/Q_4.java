package ElementPractice.Level1;

public class Q_4{
	public static void main(String...args) {
		int cp = 129;
		int sp = 191;
		
		if(sp > cp) {
			double profit = sp-cp;
			double percentegeProfit = (profit/cp)*100;
			System.out.println("Profit : " + profit);
			System.out.println("Profit Percentage : " + percentegeProfit);
		}
		else if(sp<cp) {
			int Loss = cp-sp;
			double percentegeLoss = (Loss/cp)*100;
			System.out.println("Profit : " + Loss);
			System.out.println("Profit Percentage : " + percentegeLoss);
		}
	}
}