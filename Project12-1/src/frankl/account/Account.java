package frankl.account;

import java.text.NumberFormat;

/**
 * Created by Josh Frankl on 2/10/2016.
 */
public class Account implements Depositable, Withdrawable, Balanceable {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public String getBalanceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String balanceFormatted = currency.format(balance);

        return balanceFormatted;
    }
}
