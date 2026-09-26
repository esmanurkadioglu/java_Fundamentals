import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's name & surname: ");
        String name = input.nextLine();
        System.out.print("Enter student's age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter student's department: ");
        String department = input.nextLine();

        System.out.println("==== STUDENT INFORMATION ====");
        System.out.printf("Name Surname: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Department: %s\n", department);
    }
}
