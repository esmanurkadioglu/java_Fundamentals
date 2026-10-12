package loops.coursegrades;

public class CourseGradesTest {
    public static void main(String[] args) {
        // create CourseGrades object theCourseGrades and
        // pass course name to constructor
        CourseGrades theCourseGrades = new CourseGrades("Introduction to Object Oriented Programming");
        theCourseGrades.displayMessage(); // display welcome message
        theCourseGrades.inputGrades(); // read grades from user
        theCourseGrades.displayGradeReport(); // display report based on grades


    }
}
