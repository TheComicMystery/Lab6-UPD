import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say what lab work you want to see, and you will see");
        int N = scanner.nextInt();
        switch (N) {
            case 1 -> {
                Lab1 lab1 = new Lab1();
                lab1.lab1();
            }
            case 2 -> {
                Lab2 lab2 = new Lab2();
                lab2.lab2();
            }
            case 3 -> {
                Lab3 lab3 = new Lab3();
                lab3.lab3();
            }
            case 4 -> {
                Lab4 lab4 = new Lab4();
                lab4.lab4();
            }
            case 5 -> {
                Lab5 lab5 = new Lab5();
                lab5.lab5();
            }
            case 6 -> {
                Lab6 lab6 = new Lab6();
                lab6.lab6();
            }
        }
    }
}