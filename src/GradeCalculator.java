import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeCalculator {
    private List<Student> students;
    private Map<Character, Integer> gradeFrequency;

    public GradeCalculator() {
        students = new ArrayList<>();
        gradeFrequency = new HashMap<>();
        gradeFrequency.put('A', 0);
        gradeFrequency.put('B', 0);
        gradeFrequency.put('C', 0);
        gradeFrequency.put('D', 0);
        gradeFrequency.put('F', 0);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void calculateGrades() {
        for (Student student : students) {
            student.calculateGrade();
            gradeFrequency.put(student.getGrade(), gradeFrequency.get(student.getGrade()) + 1);
        }
    }

    public void printResults() {
        int totalStudents = students.size();
        int totalScore = 0;
        double maxScore = Integer.MIN_VALUE;
        double minScore = Integer.MAX_VALUE;

        System.out.println("Index no.\t\tFinal score\t\tGrade");
        for (Student student : students) {
            System.out.println(student);
            totalScore += student.getFinalScore();
            maxScore = Math.max(maxScore, student.getFinalScore());
            minScore = Math.min(minScore, student.getFinalScore());
        }

        System.out.println("\nAverage score: " + (double) totalScore / totalStudents);
        System.out.println("Maximum score: " + maxScore);
        System.out.println("Minimum score: " + minScore);

        System.out.println("\nGrade frequency:");
        for (Map.Entry<Character, Integer> entry : gradeFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
