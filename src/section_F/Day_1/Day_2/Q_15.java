package section_F.Day_1.Day_2;

class hi {
    int amt;

    void add(int x) {
        amt = amt + x;
    }

    void sub(int y) {
        amt = amt - y;
    }

    void print() {
        System.out.println("Now balance = " + amt);
    }
}

public class Q_15 {
	public static void main(String[] args) {
        hi a1 = new hi();
        a1.add(500);
        a1.print();
        a1.sub(200);
        a1.print();
    }
}
