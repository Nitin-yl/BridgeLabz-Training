package section_F.Day_1.Day_2;

class Check{
    static int num = 5;

}

public class Q_5 {
	public static void main(String[] args) {
        Check obj1 = new Check();
        Check obj2 = new Check();

        obj1.num = 1000;

        System.out.println(obj2.num);
    }
}
