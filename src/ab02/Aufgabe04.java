package ab02;

import java.util.Scanner;

public class Aufgabe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i < n);
    }
}
