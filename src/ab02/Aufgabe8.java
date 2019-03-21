package ab02;

import java.util.Scanner;

public class Aufgabe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while(x > 0) {
            System.out.print(x % 10 + " ");
            x /= 10;
        }
    }
}
