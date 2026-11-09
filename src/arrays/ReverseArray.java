package arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the numbers: ");
        for(int i =0; i<numbers.length;i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("The array: \n");
        for(int i = 0; i< numbers.length;i++) {
            System.out.printf("%d ", numbers[i]);

        }
        int temp;
        System.out.print("\n");

        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];

            numbers[numbers.length - i - 1] = temp;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        input.close();
    }
}
