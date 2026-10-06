import java.util.Scanner;

public class GradeBookSentinel {
    private String courseName;

    // Constructor
    public GradeBookSentinel(String name) {
        courseName = name;
    }

    // Kurs adını güncelleme ve getirme metotları
    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    // Karşılama mesajı
    public void displayMessage() {
        System.out.printf("Welcome to the grade book for\n%s!\n\n", getCourseName());
    }

    // Sentinel döngüsü ile ortalama hesaplama
    public void determineClassAverage() {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;
        int grade;
        double average;

        // Döngü öncesi ilk girdiyi alma (priming read)
        System.out.print("Enter grade or -1 to quit: ");
        grade = input.nextInt();

        // Sentinel (-1) girilene kadar dönen döngü
        while (grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

        // Sonuçları yazdırma
        if (gradeCounter != 0) {
            average = (double) total / gradeCounter;
            System.out.printf("\nTotal of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
        } else {
            System.out.println("No grades were entered");
        }
    }
}