import java.util.Scanner;

public class Lab5 {
    public void lab5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            if (number > n) { break; }
            if (number > 0) {
                sum += number;
                count++;}
        }
        double average = (double)sum / count;
        System.out.println("Average: " + average);
    }
}