import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance = 10000;

        while (true) {
            System.out.println("Enter your PIN:");
            int pin = input.nextInt();

            if (pin != 1234) { 
                System.out.println("Incorrect PIN. Please try again.");
                continue; 
            }

            
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.println("Enter your choice:");
            int choice = input.nextInt();

            switch (choice) {
                case 1: 
                    System.out.println("Your balance is Rupees " + balance);
                    break;
                case 2: 
                    System.out.println("Enter the amount to withdraw:");
                    int amount = input.nextInt();
                    if (amount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= amount;
                        System.out.println("Transaction successful. Your new balance is Rupees " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount to deposit:");
                    amount = input.nextInt();
                    balance += amount;
                    System.out.println("Transaction successful. Your new balance is Rupees " + balance);
                    break;
                case 4: 
                    System.out.println("Thank you for using this ATM.");
                    input.close();
                    System.exit(0);
                default: 
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
           
        }
    }
}
