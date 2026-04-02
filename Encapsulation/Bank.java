package Encapsulation;

class BankAccount {
    private String accountNumber;
    private double balance;
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if(initialBalance >= 0) {
            this.balance = initialBalance;
        }
        else {
            System.out.println("Initial balance cannot be negative!");
            this.balance = 0;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited:$" + amount);
        }
        else {
            System.out.println("Deposit amount must be positive!");
        }
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn:$" + amount);
        }
        else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

public class Bank {
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12340080", 15000.0);

        System.out.println("Account Number: " + account.getAccountNumber());

        account.deposit(2000);
        account.withdraw(1000);

        System.out.println("Current Balance:$" + account.getBalance());
        
        account.deposit(-90);
        account.withdraw(18000);
    }
}
