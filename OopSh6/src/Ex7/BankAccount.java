package Ex7;


import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    private String accountNumber;
    private String accountHolderNme;
    private double balance;
    private ArrayList<Transaction> transactions;

    public void deposit(double amount) {
        balance -= amount;
        transactions.add(new Transaction(TransactionType.Deposit, amount, new Date()));
    }

    public void withdraw(double amount) {
        balance += amount;
        transactions.add(new Transaction(TransactionType.Withdraw, amount, new Date()));

    }

    public double getBalance() {
        return balance;
    }

    public Transaction[] getTransactionsHistory() {
        return transactions;
    }


}
