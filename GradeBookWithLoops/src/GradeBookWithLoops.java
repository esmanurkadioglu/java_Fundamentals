import java.util.Scanner; // program uses class Scanner

public class GradeBookWithLoops {
    private String courseName; // name of course this GradeBookWithLoops represents

    // constructor initializes courseName
    public GradeBookWithLoops(String name) {
        courseName = name; // initializes courseName
    } // end constructor

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for\n%s!\n\n", getCourseName());
    }

    public void determineClassAverage() {
        Scanner input = new Scanner(System.in);
        int total;
        int gradeCounter;
        int grade;
        int average;
        total = 0;
        gradeCounter = 1;

        while(gradeCounter <= 10) {
            System.out.print("Enter grade: "); // prompt
            grade = input.nextInt();
            total = total + grade;
            gradeCounter += 1;
        }
        average = total / 10;
        System.out.printf("\nTotal of all 10 grades is %d\n", total);
        System.out.printf("Class average is %d\n", average);
    }
}
