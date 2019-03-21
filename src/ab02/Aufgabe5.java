package ab02;

import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int x = 0;
        while((n%2 == 0) ? i <= n : i < n) {
            i+=2;
        }
        System.out.println(i);
    }
}
