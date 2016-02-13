package frankl.account;

import java.text.NumberFormat;

/**
 * Created by Josh Frankl on 2/10/2016.
 */
public class CheckingAccount extends Account {
    private double monthlyFee = 1;

    public void subtractMonthlyFee() {
        super.setBalance( super.getBalance() - monthlyFee );
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public String getMonthlyFeeFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String monthlyFeeFormatted = currency.format(monthlyFee);

        return monthlyFeeFormatted;
    }
}
