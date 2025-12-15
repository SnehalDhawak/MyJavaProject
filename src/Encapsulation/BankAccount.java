package Encapsulation;
//Demonstrate encapsulation by validating data before setting the value.
public class BankAccount {
    private double balance;

    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());

        acc.setBalance(-100); // Invalid case
    }
}
