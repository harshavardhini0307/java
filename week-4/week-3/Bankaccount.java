public class Bankaccount {
    private long accountNumber;
    private String accountHolder;
    private double balance;

    //  using the Constructor
    public Bankaccount(long accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount + " New Balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount + " New Balance: " + this.balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Print account details method
    public void printAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
    }

    // Main method
    public static void main(String args[]) {
        Bankaccount account = new Bankaccount(678456, "Harsha", 100000.0);
        account.printAccountDetails();

        account.deposit(8000.0);
        account.withdraw(1000.0);
        account.printAccountDetails();

        Bankaccount account1 = new Bankaccount(786865, "swami",50000.0);
        account1.deposit(3000.0);
        account1.withdraw(200.0);
        account1.printAccountDetails();


        Bankaccount account2 = new Bankaccount(863455,"valli",7000.0);
        account2.deposit(2000.0);
        account2.withdraw(500.0);
        account2.printAccountDetails();

        Bankaccount account3 = new Bankaccount(234561,"eswari",5780.0);
        account3.deposit(1500.0);
        account3.withdraw(800);
        account3.printAccountDetails();
    }
}
