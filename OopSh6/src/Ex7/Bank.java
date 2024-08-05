package Ex7;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
    public void deleteAccount(BankAccount account) {
        accounts.remove(account);
    }

    public double calculateTotalBalance() {
        return  accounts.stream().mapToDouble(BankAccount::getBalance).sum();
    }
}
