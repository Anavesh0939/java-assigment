package assigment;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds account balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class CustomexcepBlanaceWithdraw {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = 2500;
        BankAccount account = new BankAccount(initialBalance);

        System.out.print("Enter the withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();

        try {
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final balance: " + account.getBalance());

        scanner.close();
    }

}
