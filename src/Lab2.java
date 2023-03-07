public class Lab2 {
    public void lab2() {
        int n = 5;
        double sum = 0;
        int i = 1;
        while (i <= n) {
            sum += 1.0 / i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}