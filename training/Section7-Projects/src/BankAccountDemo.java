public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("enes", 100);
        System.out.println(account.getBalance());
        account.deposit(100);
        System.out.println(account.getBalance());
        account.withdraw(50);
        System.out.println(account.getBalance());
        account.deposit(-5);
        System.out.println(account.getBalance());
        account.withdraw(-5);
        System.out.println(account.getBalance());
        account.withdraw(500);
        System.out.println(account.getOwner());
    }

}
