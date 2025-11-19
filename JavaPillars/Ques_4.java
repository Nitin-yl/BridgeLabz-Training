package JavaPillars;

import java.util.ArrayList;
import java.util.List;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println();
        System.out.println("Holder Name: " + getHolderName());
        System.out.println();
        System.out.println("Balance: " + getBalance());
        System.out.println();
        System.out.println("Interest: " + calculateInterest());
        System.out.println();
        System.out.println("Loan Info: " + getLoanInfo());
        System.out.println();
    }

    protected String getLoanInfo() {
        return "Loan Not Applicable";
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    String calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    private double loanLimit;

    SavingsAccount(String accountNumber, String holderName, double balance, double interestRate, double loanLimit) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.loanLimit = loanLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

   
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

   
    public void applyForLoan(double amount) {
        if (amount <= loanLimit) {
            setBalance(getBalance() + amount);
        }
    }

   
    public String calculateLoanEligibility() {
        return "Eligible up to: " + loanLimit;
    }

  
    protected String getLoanInfo() {
        return calculateLoanEligibility();
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    
    public double calculateInterest() {
        return 0;
    }

 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
        }
    }
}

public class Ques_4 {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount s1 = new SavingsAccount("SAV101", "Akshat", 100000, 0.04, 50000);
        CurrentAccount c1 = new CurrentAccount("CUR202", "Ravi", 50000, 20000);

        s1.deposit(10000);
        s1.applyForLoan(30000);
        c1.withdraw(60000);

        accounts.add(s1);
        accounts.add(c1);

        for (BankAccount acc : accounts) {
            acc.displayDetails();
        }
    }
}