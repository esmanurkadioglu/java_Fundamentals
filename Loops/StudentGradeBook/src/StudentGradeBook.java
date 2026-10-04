import java.util.Scanner;

public class StudentGradeBook {
    private String studentName;
    private int studentId;

    public StudentGradeBook(String name, int id) {
        studentName = name;
        studentId = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void determineAverage() {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int grade;
        int gradeCounter=1;

        while(gradeCounter<=5) {
            System.out.print("Enter grade " + gradeCounter + ":");
            grade = input.nextInt();

            while(grade < 0 || grade > 100) {
                System.out.println("Invalid grade!");
                System.out.print("Enter grade " + gradeCounter + ":");
                grade = input.nextInt();
            }

            total = total + grade;
            gradeCounter++;
        }
        double average = (double) total / 5;
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.printf("Average: %.2f\n", average);
    }
}