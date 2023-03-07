import java.util.Scanner;

public class Lab4 {
    public void lab4() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (input < min) {
                min = input;
            }
            if (input > max) {
                max = input;}}
        System.out.println("Difference between the maximum and minimum numbers: " + (max - min));
    }
}