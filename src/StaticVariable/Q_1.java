package StaticVariable;

class BankAccount {
    static String bankName = "Punjab National Bank";

    private static int totalAccounts = 0;
    
    public static void getTotalAccounts() {
        System.out.println("Total Accounts : " + totalAccounts);
    }


    private String accountName;
    private final int accountNumber; 

    public BankAccount(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name : " + bankName);
            System.out.println("Account Holder : " + accountName);
            System.out.println("Account Number : " + accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }
}

public class Q_1 {
    public static void main(String... args) {
        BankAccount acc1 = new BankAccount("Nitin", 10092005);
        BankAccount acc2 = new BankAccount("Nav", 10092006);

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}
