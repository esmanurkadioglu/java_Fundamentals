package basics.prepostincrement;

import java.util.Scanner;

public class IncrementDemo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== Pre-increment & Post-increment===");
        System.out.print("Enter an integer value: ");
        int initialValue = input.nextInt();

        System.out.println("Select the action you want to perform:");
        System.out.println("1 - Postfix Increment (c++) Analysis");
        System.out.println("2 - Prefix Increment (++c) Analysis");
        System.out.println("3 - Compare both of them");
        System.out.print("Your choice (1/2/3): ");
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                demonstratePostfix(initialValue);
                break;
            case 2:
                demonstratePrefix(initialValue);
                break;
            case 3:
                compareBoth(initialValue);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        input.close();
    }
    private static void demonstratePostfix(int c) {
        System.out.println("\n--- Postfix Increment (c++) ---");
        System.out.println("Initial value: c = " + c);
        System.out.println("Printing (c++): " + (c++) + " First print then +1.");
        System.out.println("Value after the process : c = " + c);
    }

    private static void demonstratePrefix(int c) {
        System.out.println("\n--- Prefix Increment (++c) ---");
        System.out.println("Initial value: c = " + c);
        System.out.println("Printing (++c): " + (++c) + " First print then +1.");
        System.out.println("Value after the process : c = " + c);
    }

    private static void compareBoth(int initialValue) {
        System.out.println("\n====== COMPARE  TABLE ======");
        System.out.printf("Initial value: %d%n%n", initialValue);

        // Postfix test
        int postfixC = initialValue;
        System.out.printf("[Postfix] Output when evaluating 'c++' inline : %d%n", postfixC++);
        System.out.printf("[Postfix] value of 'c' on the subsequent line : %d%n%n", postfixC);

        // Prefix test
        int prefixC = initialValue;
        System.out.printf("[Prefix] output when evaluating '++c' inline : %d%n", ++prefixC);
        System.out.printf("[Prefix] value of 'c' on the subsequent line : %d%n", prefixC);


    }



}
