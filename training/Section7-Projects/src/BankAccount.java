public class BankAccount {
    private String owner;
    private double balance = 0;
    private double deposit = 0;
    private double withdraw = 0;

    public BankAccount(String owner){
        this.owner = owner;
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Withdraw amount cannot be less than or equal zero");
        }
        else if (amount > this.balance) {
            System.out.println("Withdraw amount cannot be greater than balance");
        }
        else {
            this.balance += amount;
            this.deposit += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount cannot be less than or equal zero");
        }
        else if (amount > this.balance) {
            System.out.println("Withdraw amount cannot be greater than balance");
        }
        else {
            this.balance -= amount;
            this.withdraw += amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public double getDeposit() {
        return this.deposit;
    }

    public double getWithdraw() {
        return this.withdraw;
    }
    public String getOwner() {
        return this.owner;
    }
}
