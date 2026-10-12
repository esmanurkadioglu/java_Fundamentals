package loops.coursegrades;

import java.util.Scanner;

public class CourseGrades {
    private String courseName;

    private int total; // sum of grades
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;

    // constructor initializes courseName
    public CourseGrades(String name) {
        courseName = name; // initializes courseName
    } // end constructor

    // method to set the course name
    public void setCourseName ( String name) {
        courseName = name; // store the course name
    } // end method setCourseName

    // method to retrieve the course name
    public String getCourseName() {
        return courseName;
    } // end method getCourseName

    // display a welcome message to the CourseGrades user
    public void displayMessage() {
        // getCourseName gets the name of the course
        System.out.printf("Welcome to the Course Grades for \n%s!\n\n", getCourseName());
    } // end method displayMessage

    // input arbitrary number of grades from user
    public void inputGrades() {
        Scanner input = new Scanner(System.in);
        int grade; // grade entered by user

        System.out.printf("%s\n%s\n  %s\n  %s\n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Max OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        // loop until user enters the end-of-file indicator
        while(input.hasNext()) {
            grade = input.nextInt();
            if(grade==-1) {
                break;
            }

            total +=grade;
            ++gradeCounter;

            // call method to increment appropriate counter
            incrementLetterGradeCounter(grade);
        }
    }

    // add 1 to appropriate counter for specified grade
    private void incrementLetterGradeCounter(int grade) {
        // determine which grade was entered
        switch (grade/10) {
            case 9: // grade was between 90
            case 10: // and 100, incusive
                 ++aCount; // increment aCount
                 break; // necessary to exit switch

            case 8: // grade was between 80-89
                ++bCount;
                break;

            case 7: // grade was between 70-79
                ++cCount;
                break;

            case 6: // grade was betweenn 60-69
                ++dCount;
                break;

            default: // grade was less than 60
                ++fCount;
                break;
        }
    }

    // display a report based on the grades entered by the user
    public void displayGradeReport() {
        System.out.println("\nGrade Repor: ");

        // if user entered at least one grade
        if(gradeCounter !=0) {
            // calculate average of all grades entered
            double average = (double) total / gradeCounter;

            // output summary of results
            System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);

            System.out.println("Number of students who received each grade:");
            System.out.println("A: " + aCount);
            System.out.println("B: " + bCount);
            System.out.println("C: " + cCount);
            System.out.println("D: " + dCount);
            System.out.println("F: " + fCount);
        } else System.out.println("No grades were entered");
    }
}
