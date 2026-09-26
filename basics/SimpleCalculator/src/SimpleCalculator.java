import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if(choice == 1) {
            double result = number1 + number2;
            System.out.println("Result: " + result);
        } else if (choice ==2) {
            double result = number1 - number2;
            System.out.println("Result: " + result);
        } else if (choice == 3) {
            double result = number1 * number2;
            System.out.println("Result: " + result);
        } else if (choice == 4) {
            if(number2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                double result = number1 / number2;
                System.out.println("Result: " + result);
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
