public class Student {
    private final double MID_SEM_PERCENT = 0.3;
    private final double END_SEM_PERCENT = 0.7;
    private final int indexNumber;
    private int midSemesterScore;
    private int endSemesterScore;
    private double finalScore;
    private char grade;

    public Student(int indexNumber, int midSemesterScore, int endSemesterScore) {
        this.indexNumber = indexNumber;
        this.midSemesterScore = midSemesterScore;
        this.endSemesterScore = endSemesterScore;
        this.finalScore = midSemesterScore * this.MID_SEM_PERCENT + endSemesterScore * this.END_SEM_PERCENT;
    }

    public void calculateGrade() {
        if (finalScore >= 70) {
            grade = 'A';
        } else if (finalScore >= 60) {
            grade = 'B';
        } else if (finalScore >= 50) {
            grade = 'C';
        } else if (finalScore >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public double getFinalScore() {
        return finalScore;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return indexNumber + "\t\t\t" + String.format( "%.2f",finalScore) + "\t\t\t" + grade;
    }
}
