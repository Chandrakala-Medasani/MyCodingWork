package InterviewPrograms;

//Write a Java program to create a class called BankAccount
// with private instance variables accountNumber and balance.
// Provide public getter and setter methods to access and modify these variables.

public class BankAccount {

    private int accountNumber;
    private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
