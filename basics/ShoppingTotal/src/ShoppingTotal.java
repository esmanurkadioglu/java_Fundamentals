import java.util.Scanner;

public class ShoppingTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = input.nextLine();
        System.out.print("Enter the price of product: ");
        double price = input.nextDouble();
        System.out.print("Enter the count of product: ");
        int count = input.nextInt();

        double total = price * count;
        System.out.printf("The product name: %s\n", productName);
        System.out.printf("The total price: %.2f\n", total);
    }
}
