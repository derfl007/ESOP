package ab02;

import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        for(int i = (a+n); i >= a; i--) {
            System.out.println(i);
        }
    }
}