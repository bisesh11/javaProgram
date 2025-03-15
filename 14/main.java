class BankAccount {
    protected String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 500;
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied! Balance must remain above ₹500.");
        }
    }
}
class CurrentAccount extends BankAccount {
    private static final double MIN_BALANCE = 1000;
    private static final double PENALTY = 50;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            super.withdraw(amount);
            if (balance < MIN_BALANCE) {
                balance -= PENALTY;
                System.out.println("Balance below ₹1000! Penalty of ₹50 applied. New balance: ₹" + balance);
            }
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
public class main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 2000);
        System.out.println("Savings Account:");
        savingsAccount.deposit(500);
        savingsAccount.withdraw(1800); 
        savingsAccount.withdraw(400);
        CurrentAccount currentAccount = new CurrentAccount("CA123", 1500);
        System.out.println("\nCurrent Account:");
        currentAccount.deposit(1000);
        currentAccount.withdraw(600); 
        currentAccount.withdraw(2000); 
    }
}