import java.util.*;

public class ATM {
    // Inner class to represent the bank account
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                this.balance = 0;
            }
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BankAccount account = new BankAccount(1000.00);
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.printf("Current Balance: $%.2f\n", account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        account.deposit(depositAmount);
                        System.out.printf("Deposited $%.2f. New Balance: $%.2f\n", depositAmount, account.getBalance());
                    } else {
                        System.out.println("Invalid amount. Deposit must be greater than zero.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0) {
                        if (account.getBalance() >= withdrawAmount) {
                            account.withdraw(withdrawAmount);
                            System.out.printf("Withdrew $%.2f. New Balance: $%.2f\n", withdrawAmount, account.getBalance());
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                    } else {
                        System.out.println("Invalid amount. Withdrawal must be greater than zero.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}