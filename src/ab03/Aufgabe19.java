package ab03;

import java.util.Scanner;

public class Aufgabe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
