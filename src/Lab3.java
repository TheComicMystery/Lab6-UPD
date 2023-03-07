import java.util.Scanner;

public class Lab3 {
    public void lab3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;
        do {
            System.out.println("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
            i++;
        } while (i < n);
        System.out.println("Sum: " + sum);
    }
}