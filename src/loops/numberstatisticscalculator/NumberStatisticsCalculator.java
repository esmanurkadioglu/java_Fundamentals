package loops.numberstatisticscalculator;

import java.util.Scanner;

public class NumberStatisticsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int sum =0;
       double average;
       int number, count = 0;
       int max=0;
       int min= 0;
       boolean firstNumber = true;
       String numbers = "";

        do{
            System.out.println("Enter a number (-1 to stop): ");
            number = input.nextInt();

            if(number!=-1){
                sum+=number;
                count++;

                numbers = numbers + number + " ";

                if(firstNumber) {
                    max=number;
                    min=number;
                    firstNumber=false;
                } else {
                    if(number>max) max = number;
                    if(number < min) min =number;
                }
            }
        }while(number !=-1);

        if(count == 0){
            System.out.println("No numbers entered! ");
        } else {
            average = (double) sum / count;
            System.out.println("\nNumbers entered: " + numbers);
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
            System.out.println("Number of entries: " + count);
        }
        input.close();
    }
}
