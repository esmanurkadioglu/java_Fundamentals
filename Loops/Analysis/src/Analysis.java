import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing varibles in declarations
        int passes = 0; // number of passes
        int failures = 0; // number of failures
        int studentCounter = 1; // Student counter
        int result; // one extra exam result (obtains value from user)

        while(studentCounter<=10) {
        // prompt user for input and obtain value from user
            System.out.print("Enter result (1=pass, 2=fail): ");
            result = input.nextInt();

            // if...else is nested in the while statement
            if(result==1) passes+=1;
            else failures +=1;

            studentCounter+=1;
        }
        System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);

        // determine whether more than 8 students passed
        if(passes>8) System.out.println("Bonus to instructor! ");
    }
}
