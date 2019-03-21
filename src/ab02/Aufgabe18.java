package ab02;

import java.util.Scanner;

public class Aufgabe18 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "+" + (n - i) + "=" + n);
        }
    }
}
