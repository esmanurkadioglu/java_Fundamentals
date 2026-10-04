import java.util.Scanner;

public class StudentGradeBookTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        int id = input.nextInt();

        StudentGradeBook student = new StudentGradeBook(name, id);
        student.determineAverage();
    }

}
