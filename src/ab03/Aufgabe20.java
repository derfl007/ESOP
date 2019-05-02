package ab03;

import java.util.Scanner;

public class Aufgabe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            n = scanner.nextInt();
        } while(n % 2 == 0);
        for (int i = -n+1; i < n; i+=2) {
            for(int j1 = (n-(Math.abs(i)+1))/2; j1 > 0; j1--) {
                System.out.print(' ');
            }
            for (int j2 = Math.abs(i)+1; j2 > 0; j2--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
