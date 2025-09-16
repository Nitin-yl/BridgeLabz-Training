package oops;

public class ATM_MANAGEMENT_SYSTEM {
	abstract class ATM{
		String location;
		String machineID;
		
		public abstract void withdraw(Account account , double amount);
		public abstract void deposit(Account account , double amount);
	}
	
	class Account{
		String accountholder;
		String holderName;
		double balance;
	}
	
	class SavingAccount extends Account {
		double minBalance = 1000.0;
	}
	
	class CurrentAccount extends Account {
		
	}
	
	public static void main(String...args) {
		
	}
}