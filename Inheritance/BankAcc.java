package Inheritance;
class BankAccount {
    String name;
    int accountNumber;
    String address;
    double balance;

    BankAccount(String name, int accNo, String address, double balance) {
        this.name = name;
        this.accountNumber = accNo;
        this.address = address;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double roi;

    SavingsAccount(String name, int accNo, String address, double balance, double roi) {
        super(name, accNo, address, balance);
        this.roi = roi;
    }

    void calc_Amt() {
        balance += balance * roi / 100;
    }
}

public class BankAcc {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("John Doe", 12345, "123 Main St", 1000.0, 5.0);
        sa.display();
        sa.calc_Amt();
        sa.display();
    }
}
