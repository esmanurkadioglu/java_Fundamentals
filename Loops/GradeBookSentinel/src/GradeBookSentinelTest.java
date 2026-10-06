public class GradeBookSentinelTest {
    public static void main(String[] args) {
        GradeBookSentinel myGradeBook = new GradeBookSentinel("CS101 Introduction to Java Programming");

        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();
    }
}