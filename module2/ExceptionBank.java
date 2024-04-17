package module2;
/*Question 40
 * 
 */
// Custom exception class for InsufficientBalanceException
class InsufficientBalanceException extends Exception {
    // Constructor to initialize the exception message
    public InsufficientBalanceException(int requiredAmount) {
        super("Sorry, insufficient balance, you need more " + requiredAmount + " Rs. to perform this transaction");
    }
}

// Account class representing a bank account
class Account {
    private int balance; // Account balance

    // Constructor to initialize account balance
    public Account(int balance) {
        this.balance = balance;
    }

    // Method to withdraw amount from account
    public void withdraw(int amount) throws InsufficientBalanceException {
        // Check if withdrawal amount is greater than balance
        if (amount > balance) {
            // Calculate the required additional amount
            int requiredAmount = amount - balance;
            // Throw InsufficientBalanceException with required additional amount
            throw new InsufficientBalanceException(requiredAmount);
        } else {
            // Deduct amount from balance
            balance -= amount;
            System.out.println("Amount successfully withdrawn.");
        }
    }
}

// Main class for testing

public class ExceptionBank {
	public static void main(String[] args) {
        // Create an account with initial balance of 2000 Rs.
        Account account = new Account(2000);

        // Withdraw amount
        try {
            // Assuming user enters withdrawal amount of 2500 Rs.
            int withdrawalAmount = 2500;
            account.withdraw(withdrawalAmount);
        } catch (InsufficientBalanceException e) {
            // Catch and handle InsufficientBalanceException
            System.out.println(e.getMessage());
        }
    }
}

