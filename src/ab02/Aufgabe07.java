package ab02;

import java.util.Scanner;

public class Aufgabe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n:");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int i = 0;
        float sum = 0;
        do {
            sum += a[i];
            i++;
        } while(i < n);
        float avg = sum / n;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
    }
}
