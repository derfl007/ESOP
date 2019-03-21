package ab01;

import java.util.Scanner;

public class Aufgabe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println((x % 2 == 0) ? "EVEN" : "ODD");
    }
}
