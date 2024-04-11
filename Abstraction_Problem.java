public class Abstraction_Problem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(0 , 12345, "John Doe", "123MainSt", 5);

        // Deposit and display initial details
        savingsAccount.deposit(1000);
        savingsAccount.display();

        // Withdraw and display updated details
        savingsAccount.withdrawal(500);
        savingsAccount.display();

        // Calculate amount with interest and display
        savingsAccount.CalAmount();
    }
}

abstract class Savings{
    double balance;
    int AccNumber;
    String AccName;
    String address;

    abstract void withdrawal(double amount);
    abstract void deposit(double amount);
    abstract void display();

    Savings(){
        System.out.println("Default constructor");
    }

    Savings(double balance , int AccNumber , String AccName , String address){
        this.balance = balance;
        this.AccNumber = AccNumber;
        this.AccName = AccName;
        this.address = address;
    }
}

class SavingsAccount extends Savings{

    public double rateOfInterest;
    SavingsAccount(){
        System.out.println("Default constructor");
    }

    SavingsAccount(double balance , int AccNumber , String AccName , String address , double rateOfInterest){
        super(balance , AccNumber , AccName , address);
        this.rateOfInterest = rateOfInterest;
    }

    double CalAmount(){
        double amount = balance * (1 + rateOfInterest / 100);
        System.out.println("Amount is");
        return amount;
    }

    void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful. Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Override deposit method

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Override display method to show balance of the account
    public void display() {
        System.out.println("Account Number: " + AccNumber);
        System.out.println("Account Holder: " + AccName);
        System.out.println("Address: " + address);
        System.out.println("Current Balance: " + balance);
    }

}
