package ab01;

import java.util.Scanner;

public class Aufgabe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0 && year == 0) || year % 400 == 0) System.out.println("Schaltjahr");
        else System.out.println("Kein Schaltjahr");
    }
}
