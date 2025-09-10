package section_F.Day_1.Day_2;

class User{
	 final String userId;
	 
	 User(String userId){
		 this.userId = userId;
	 }
	 
	 void show() {
		 System.out.println(userId);
	 }
}

public class Q_12 {
	public static void main(String...args) {
		User obj1 = new User("Nitin");
		obj1.show();
	}
}
