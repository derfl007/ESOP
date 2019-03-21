package ab02;

import java.util.Scanner;

public class Aufgabe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nf = 1;
        for(int i = 1; i <= n; i++) {
            nf *= i;
        }
        System.out.println(nf);
    }
}
