package ab03;

import java.util.Scanner;

public class Aufgabe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n > 10) {
            System.out.println("Please enter a number below 10");
            n = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("n = " + i + ", n! = " + factorial(i));
        }
    }

    private static int factorial(int p0) {
        int r = 1;
        for (int i = p0; i > 0; i--) {
            r *= i;
        }
        return r;
    }
}
