import java.util.Scanner;

abstract class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String name, double balance) {
        this.accountHolder = name;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid withdrawal!");
        }
    }

    abstract void accountType();
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    void accountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    void accountType() {
        System.out.println("Account Type: Current Account");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account;

        System.out.println("Choose Account Type:");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        int choice = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        if (choice == 1) {
            account = new SavingsAccount(name, balance);
        } else {
            account = new CurrentAccount(name, balance);
        }

        int option;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Info");
            System.out.println("5. Exit");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double wit = sc.nextDouble();
                    account.withdraw(wit);
                    break;

                case 3:
                    System.out.println("Balance: ₹" + account.getBalance());
                    break;

                case 4:
                    System.out.println("Name: " + account.getAccountHolder());
                    account.accountType();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (option != 5);

        sc.close();
    }
}
