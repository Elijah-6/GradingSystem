import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeCalculator calculator = new GradeCalculator();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student's index number: ");
            int indexNumber = scanner.nextInt();
            System.out.print("Enter mid-semester score: ");
            int midSemesterScore = scanner.nextInt();
            System.out.print("Enter end-semester score: ");
            int endSemesterScore = scanner.nextInt();

            calculator.addStudent(new Student(indexNumber, midSemesterScore, endSemesterScore));
        }

        calculator.calculateGrades();
        calculator.printResults();
    }
}