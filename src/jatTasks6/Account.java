package jatTasks6;

public class Account {

	 // Data members
    private String accountHolder;
    private double balance;

    // No-argument constructor
    public Account() {
        this.accountHolder = "Unknown";
        this.balance = 0.0;
    }

    // Constructor with two arguments (account holder and initial balance)
    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Creating account objects using different constructors
        Account account1 = new Account(); // No-argument constructor
        Account account2 = new Account("John Doe", 1000.0); // Constructor with arguments

        // Testing the deposit, withdraw, and check balance methods
        account1.deposit(500);
        account1.withdraw(100);
        System.out.println("Balance in account1: " + account1.checkBalance());

        account2.deposit(300);
        account2.withdraw(500);
        System.out.println("Balance in account2: " + account2.checkBalance());
    }
}