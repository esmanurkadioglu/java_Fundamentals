package loops.controlflow;

import java.util.Scanner;

public class ATMransactionSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;

        System.out.println("=== Simple ATM Expense Tracker ===");
        System.out.printf("Current Balance: $%.2f\n", balance);
        System.out.println("Enter amounts to withdraw (Enter 0 to exit):");

        while(true) {
            System.out.print("\nEnter amount: ");
            double amount = scanner.nextDouble();

            // 1. BREAK: Terminate loop immediately if user enters 0
            if(amount == 0) {
                System.out.println("Existing application...");
                break;
            }

            // 2. CONTINUE: Skip remaining steps on negative input and prompt again
            if(amount<0) {
                System.out.println("Error: Negative amounts are not allowed!");
                continue;
            }

            // 3. CONTINUE: Skip transaction if requested amount exceeds balance
            if(amount>balance) {
                System.out.println("Error: Insufficient funds! Amount exceeds current balance.");
                continue;
            }

            balance -=amount;
            System.out.printf("Successfully withdrawn: $%.2f. Remaining Balance: $%.2f\n", amount, balance);

            // Terminate loop if balance reaches zero
            if(balance == 0) {
                System.out.println("Balance exhausted. Session terminated.");
                break;
            }

        }
        System.out.printf("\nTransaction Summary - Final Balance: $%.2f\n", balance);
        scanner.close();
    }
}
