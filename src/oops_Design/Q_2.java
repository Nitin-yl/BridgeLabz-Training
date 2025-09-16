package oops_Design;

import java.util.*;

class Account {
    static int accCounter = 1000;
    int accNo;
    double balance;

    public Account(double deposit) {
        this.accNo = accCounter++;
        this.balance = deposit;
    }

    public void show() {
        System.out.println("Account No: " + accNo + "  Balance: " + balance);
    }
}

class Customer {
    String name;
    List<Account> accounts = new ArrayList<>();

    public Customer(String name) { this.name = name; }

    public String getName() { return name; }

    public void openAccount(Account acc) { accounts.add(acc); }

    public void viewBalance() {
        System.out.println("Account details for " + name + ":");
        for (Account acc : accounts) acc.show();
    }
}

class Bank {
    String name;

    public Bank(String name) { this.name = name; }

    public void openAccount(Customer c, double deposit) {
        Account acc = new Account(deposit);
        c.openAccount(acc);
        System.out.println("Account opened for " + c.getName() + " in " + name);
    }
}

public class Q_2 {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");

        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Priya");

        bank.openAccount(c1, 5000);
        bank.openAccount(c1, 4000);
        bank.openAccount(c2, 8000);

        System.out.println();
        c1.viewBalance();
        c2.viewBalance();
    }
}
