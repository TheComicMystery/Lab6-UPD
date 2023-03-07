import java.util.Scanner;

public class Lab1 {
    public void lab1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the exchange rate: ");
        double rate = scanner.nextDouble();
        System.out.println("USD  |  UAH");
        int i = 1;
        do {
            double uah = i * rate;
            System.out.println(i + "    |  " + uah);
            i++;
        } while (i <= 10);
    }
}