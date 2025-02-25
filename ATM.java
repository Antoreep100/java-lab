import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 0.0;  // Start with a balance of 0
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Check balance
                System.out.println("Current Balance: " + balance);
            } else if (choice == 2) {
                // Deposit money
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                balance += depositAmount;
                System.out.println("Deposited: " + depositAmount);
            } else if (choice == 3) {
                // Withdraw money
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > balance) {
                    System.out.println("Insufficient balance.");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawn: " + withdrawAmount);
                }
            } else if (choice == 4) {
                // Exit
                System.out.println("Exiting. Goodbye!");
                break;  // Exit the loop and end the program
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
