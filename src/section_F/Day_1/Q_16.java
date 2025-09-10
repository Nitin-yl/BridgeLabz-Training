package section_F.Day_1;

class Rectangle{
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int Area() {
        return length * width;
    }

    int Perimeter() {
        return 2 * (length + width);
    }
}

public class Q_16 {
	public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(7, 3);

        System.out.println( "Area1 : " + r1.Area() + " Perimeter1 :" + r1.Perimeter());
        System.out.println( "Area2 : " + r2.Area() + " Perimeter2 :" + r2.Perimeter());
    }
}
