package section_F.Day_1.Day_2;

class Three{
	static int num1 = 5;
	int num2 = 10;
	
	Three(){
		int num3 = 15;
		System.out.println( "num3 : " + num3);
	}
	
	void show() {
		System.out.println( "num2 : " + num2);
	}
}

public class Q_10 {
	public static void main(String...args) {
		Three obj1 = new Three();
		
		System.out.println("num1 : " + Three.num1);
		obj1.show();
	}
}
