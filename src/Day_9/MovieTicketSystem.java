package Day_9;

import java.util.*;

public class MovieTicketSystem {
	
	public static int movie(String movieName , int price) {
		
		if(movieName.equals("Premimum")  || movieName.equals("premimum")) {
			System.out.println("You selected Premimum slot for movie");
			price += 5000;
			System.out.println("Your total will is :" + price);
			
		}
		else if(movieName.equals("Gold")  || movieName.equals("gold")) {
			System.out.println("You selected Gold slot for movie");
			
			price += 3000;
			System.out.println("Your total will is :" + price);
		}
		else if(movieName.equals("Silver")  || movieName.equals("silver") )
		{
			System.out.println("You selected Silver slot for movie");
			
			price += 2000;
			System.out.println("Your total bill is :" + price);
		}
		else {
			System.out.println("You entered wrong category! ");
		}
		
		
		return price;
	}
	
	public static int snack(int amount , String snacks , String category ) {
		int price=0;
		
		if(snacks.equals("y")  || snacks.equals("Y")) {
			if(category.equals("popcorn") || category.equals("Popcorn") ) {
				price = amount+400;
			}
			else if(category.equals("cold drink") || category.equals("Cold drink")) {
				price = amount+100;
			}
			else if(category.equals("coffee") || category.equals("Coffee")) {
				price = amount+250;
			}
			else if(category.equals("chips") || category.equals("Chips")) {
				price = amount+150;
			}
		}
		else if(snacks.equals("n")  || snacks.equals("N")) {
			System.out.println("You are not choose a snacks!");
		}
		return price;
	}
	
	public static void main(String...args) {
		Scanner in = new Scanner (System.in);
		int price = 0;
		
		System.out.println("which movie type do you prefer : Premimum - price 5000 , Gold - price 3000 , Silver - price 2000");
		String s = in.nextLine() ;
		int amount = movie(s,price);
		
		System.out.println("Would you add snacks along with your movie sloth if yes then type 'y' otherwise 'n' ");
		String snacks = in.nextLine();
		
		System.out.println("Which type of snakcs do you want : popcorn - price 400  colddrink price 100 coffee price 250  chips price 150 ");
		String category = in.nextLine();
		
		int finalp = snack(amount , snacks , category);
		
		
		
		System.out.println();
		
		System.out.println("before paying your bill anything want to add to this if yes then type  'y' otherwise 'n'  ");
		String last = in.nextLine();
		
		if(last.equals("y")  || last.equals("Y")) {
			System.out.println("What would you add in this > Movie-slot or snacks ");
			String a = in.nextLine();
			if(a.equals("Movie-slot")) {
				System.out.println("which movie type do you prefer : Premimum - price 5000 , Gold - price 3000 , Silver - price 2000");
				int finalamount = movie(in.nextLine() , finalp);
				System.out.println("Your total amount to pay : " + finalamount);
			}
			else {
				System.out.println("Which type of snakcs do you want : popcorn - price 400  colddrink price 100 coffee price 250  chips price 150 ");
				int n = snack(amount , snacks , category);
				System.out.println("Your total amount to pay : " + n);
			}
			
		}
		
		else {
			System.out.println("Your total amount to pay : " + finalp);
		}
		
		
	}
}
