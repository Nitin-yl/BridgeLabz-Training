package section_F.Day_1;

class Try {
    static int count = 0; 
    
    void setCount(int value) {
        count = value;
    }

    void showCount() {
        System.out.println("Count = " + count);
    }
}

public class Q_12 {
	public static void main(String[] args) {
        Try obj1 = new Try();
        Try obj2 = new Try();

        obj1.showCount(); 
        obj1.setCount(10);
        obj2.showCount();
        obj2.setCount(25); 
        obj1.showCount();
    }
}
