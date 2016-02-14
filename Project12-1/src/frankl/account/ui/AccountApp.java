package frankl.account;

public class AccountApp {

    public static void main(String[] args) {
        Console.displayLine("Welcome to the Account Calculator");
        Console.displayLine();

        CheckingAccount account = new CheckingAccount();
        account.setBalance(1000);


        Console.displayLine("Starting Balance\nChecking: " + account.getBalanceFormatted() );
        Console.displayLine();
        Console.displayLine("Enter the transactions for the month");
        Console.displayLine();
        
        boolean keepRunning = true;
        while (keepRunning == true) {

            String input = Console.getString("Withdrawl or deposit? (w/d)): ");
            Console.displayLine();

            if (input.equalsIgnoreCase("w")) {
                double amount = Console.getDouble("Amount: ");
                if (amount > account.getBalance() ) {
                    Console.displayLine("Error: cannot withdraw more than account balance!");
                }
                else {
                    Transactions.withdraw(account, amount);
                }
            }
            else if (input.equalsIgnoreCase("d")) {
                double amount = Console.getDouble("Amount: ");
                if (amount > 10000 ) {
                    Console.displayLine("Error: cannot deposit more than $10,000 at once!");
                }
                else {
                    Transactions.deposit(account, amount);
                }
            }

            Console.displayLine();
            String continueInput = Console.getString("Continue? (y/n) ");

            if ( !continueInput.equalsIgnoreCase("y") ) {
                keepRunning = false; // Only keep running if "y" is inputted
            }

        }

        Console.displayLine("Monthly Fees");
        Console.displayLine("Checking fee:\t\t" + account.getMonthlyFeeFormatted() );
        account.subtractMonthlyFee();
        Console.displayLine();
        Console.displayLine("Final Balance");
        Console.displayLine("Checking: " + account.getBalanceFormatted());
    }

}
