interface Account {
    void displayBalance();
    void withdraw(double amount);
    void displayAccountDetails();
}

class SavingsAccount implements Account {
    String accountNumber;
    double balance;
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied: Insufficient balance");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Savings Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Interest Rate: " + interestRate + "%");
        displayBalance();
    }
}

class CurrentAccount implements Account {
    String accountNumber;
    double balance;
    double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied: Overdraft limit exceeded");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Current Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Overdraft Limit: " + overdraftLimit);
        displayBalance();
    }
}

public class Ass5_pr9 {
    public static void main(String[] args) {

        Account sa = new SavingsAccount("SA101", 5000, 3.5);
        sa.displayAccountDetails();
        sa.withdraw(6000);
        sa.displayBalance();

        System.out.println();

        Account ca = new CurrentAccount("CA201", 3000, 2000);
        ca.displayAccountDetails();
        ca.withdraw(3500);
        ca.displayBalance();
    }
}
