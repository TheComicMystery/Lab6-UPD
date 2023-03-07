import java.util.Scanner;

public class Lab6 {
    public void lab6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of students: ");
        int n = scanner.nextInt();
        int totalScore = 0;
        int fiveMarks = 0;
        int i = 0;
        while (i < n) {
            System.out.println("Please enter the grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            totalScore += grade;
            if (grade == 5) {
                fiveMarks++;
            }
            i++;
        }
        double averageScore = (double) totalScore / n;
        System.out.println("The average mark: " + averageScore);
        System.out.println("The number of 5 marks is: " + fiveMarks);
    }
}